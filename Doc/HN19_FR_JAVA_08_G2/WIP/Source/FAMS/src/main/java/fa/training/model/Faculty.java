package fa.training.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "FAMS_G2")
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "faculty_id")
	private int facultyId;
	
	@Column(name = "faculty_name")
	private String facultyName;
	
	@Column(name = "remarks", nullable = true)
	private String remarks;
	
	@OneToMany(mappedBy = "faculty")
	private List<CandidateProfile> listCandidateProfile;
	
}
