package fa.training.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Candidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidate_id")
	private int candidateID;
	
	@Column(name = "application_date")
	private LocalDate applicationDate;
	
	private String status;
	
	private String history;
	
	private String remarks;
	
	@OneToMany(mappedBy = "candidate")
	private List<EntryTest> listEntryTest;
	
	@ManyToOne
	@JoinColumn(name = "channel_id", nullable = false)
	private Channel channel;
	
	@OneToMany(mappedBy = "candidate")
	private List<InterView> listInterview;
	
	@OneToOne(mappedBy = "candidate")
	private CandidateProfile candidateProfile;
	
	@ManyToOne
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;
	
}
