package prestito_illuminato.loan_history.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import prestito_illuminato.auth.entity.User;

@Data
@Builder
@Entity
@Table(name = "reports")
@NoArgsConstructor
@AllArgsConstructor
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer year;
	private Integer actualLoanRequest;
	private Integer actualTotalImport;
	private String rateFixOrVar;
	private String sustainability;
	private Double rate;
	private Double taeg;
	private Double monthlyRate;

	@ManyToOne
	@JsonIgnoreProperties({ "user" })
	@JoinColumn(name = "user_id")
	private User user;
}
