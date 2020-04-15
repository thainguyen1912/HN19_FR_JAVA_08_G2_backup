package fa.training.model;

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
public class InterView {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_id")
	private int interviewId;
	
	@Column(name="interview_time")
	private int interviewTime;
	
	@Column(name="interviewer")
	private String interviewer;
	
	@Column(name="commnets")
	private String commnets;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="result")
	private String result;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@OneToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;
	
}
