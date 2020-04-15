package fa.training.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class EntryTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private int testId;
	
	private int time;
	
	private LocalDate date;
	
	@Column(name = "language_valuator")
	private String languageValuator;
	
	@Column(name = "language_result")
	private int languageResult;
	
	@Column(name = "technical_valuator")
	private String technicalValuator;
	
	@Column(name = "teachnical_result")
	private int technicalResult;
	
	private String result;
	
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
}
