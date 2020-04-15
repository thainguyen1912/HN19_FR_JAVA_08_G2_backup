package fa.training.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class CandidateProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_profileId")
	private int candidateProfileId;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="date_ofBirth")
	private LocalDate dateOfBirth;
	
	@Column(name="gender")
	private boolean gender;
	
	@Column(name="graduation_year")
	private int graduationYear;
	
	@Column(name="phone",unique = true)
	private int phone;
	
	@Column(name="email",unique = true)
	private String email;
	
	private String type;
	
	private String skill;
	
	@Column(name="foreign_language")
	private String foreignLanguage;
	
	private String level;
	
	private String cv;
	
	@Column(name="allocation_status", nullable = true)
	private String allocationStatus;
	
	@Column(name="remarks", nullable = true)
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name = "university_id", nullable = false)
	private University university;
	
	@ManyToOne
	@JoinColumn(name = "faculty_id", nullable = false)
	private Faculty faculty;
	
	@OneToOne
	@JoinColumn(name = "candidate_id", nullable = false, unique = true)
	private Candidate candidate;
	
}
