package prestito_illuminato.loan_history.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import prestito_illuminato.auth.entity.User;
import prestito_illuminato.auth.repository.UserRepository;
import prestito_illuminato.loan_history.model.Report;
import prestito_illuminato.loan_history.repository.reportDAO;

@Service
public class ReportService {
	@Autowired
	private reportDAO reportDao;
	
	@Autowired
	private UserRepository userDao;
	
	@Autowired
	@Qualifier("FakeReport")
	private ObjectProvider<Report> reportProvider;
	
	public void createFakeReport() {
		Report fakeReportBuffer = reportProvider.getObject();
		reportDao.save(fakeReportBuffer);
	}
	
	public String persistReport(Report r) {
		reportDao.save(r);
		return "Report correctly persisted on Database!";
	}

	public String updateReport(Report r) {
		if (reportDao.existsById(r.getId())) {
			reportDao.save(r);
			return "Report correctly updated on Database!";
		} else {
			throw new EntityNotFoundException("Report with ID --> " + r.getId() + " doesn't exists on Database");
		}
	}

	public String deleteReport(Report a) {
		if (reportDao.existsById(a.getId())) {
			reportDao.delete(a);
			return "Report correctly deleted from Database!";
			} else {
			throw new EntityNotFoundException("Report with ID --> " + a.getId() + " doesn't exists on Database");
		}
	}

	public String deleteReport(Long id) {
		if (reportDao.existsById(id)) {
			reportDao.deleteById(id);
			;
			return "Report correctly deleted from Database!";
		} else {
			throw new EntityNotFoundException("Report with ID --> " + id + " doesn't exists on Database");
		}
	}

	public Report findReportById(Long id) {
		if (reportDao.existsById(id)) {
			return reportDao.findById(id).get();
		} else {
			throw new EntityNotFoundException("Report with ID --> " + id + " doesn't exists on Database");
		}
	}
	
	public List<Report> findAllReport() {
		return(List<Report>) reportDao.findAll();
	}
	
	public List<User> findAllUser() {
		return(List<User>) userDao.findAll();
	}
	
}
