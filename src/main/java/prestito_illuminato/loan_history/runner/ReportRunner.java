package prestito_illuminato.loan_history.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import prestito_illuminato.loan_history.service.ReportService;

@Component
@Slf4j
public class ReportRunner implements ApplicationRunner {
	
	@Autowired
	private ReportService repService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		if(repService.findAllReport().isEmpty())
			for (int i = 0; i < 10; i++) {
				repService.createFakeReport();
			}

	}

}
