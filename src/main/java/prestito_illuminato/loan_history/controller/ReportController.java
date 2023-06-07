package prestito_illuminato.loan_history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prestito_illuminato.auth.entity.User;
import prestito_illuminato.loan_history.model.Report;
import prestito_illuminato.loan_history.service.ReportService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/reports")
public class ReportController {
	@Autowired
	ReportService addService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findReportById(@PathVariable Long id) {
		return new ResponseEntity<Report>(addService.findReportById(id), HttpStatus.FOUND);
	}
	
	@GetMapping
	public ResponseEntity<?> findAllReports() {
		return new ResponseEntity<List<Report>>(addService.findAllReport(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> AddNewReport(@RequestBody Report r) {
		return new ResponseEntity<String>(addService.persistReport(r), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateReport(@RequestBody Report r) {
		return new ResponseEntity<String>(addService.updateReport(r), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteReport(@RequestBody Report r) {
		return new ResponseEntity<String>(addService.deleteReport(r), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteReport(@PathVariable Long id) {
		return new ResponseEntity<String>(addService.deleteReport(id), HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> findAllUsers() {
		return new ResponseEntity<List<User>>(addService.findAllUser(), HttpStatus.OK);
	}

}
