package prestito_illuminato.loan_history.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import prestito_illuminato.auth.entity.User;
import prestito_illuminato.loan_history.model.Report;

@Configuration
public class ReportConfig {
	private Faker fake = Faker.instance(new Locale("en-En"));
	
	@Bean("FakeReport")
	@Scope("prototype")
	public Report fakeReport() {
		return Report.builder().year(fake.number().numberBetween(1, 30))
				.actualLoanRequest(fake.number().numberBetween(10000, 300000))
				.actualTotalImport(fake.number().numberBetween(10000, 300000))
				.rateFixOrVar("Fisso").sustainability("Alta").rate(3.6).taeg(3.87)
				.monthlyRate(fake.number().randomDouble(2,200, 1300)).build();
	}
}
