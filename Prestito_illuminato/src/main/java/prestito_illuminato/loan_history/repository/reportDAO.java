package prestito_illuminato.loan_history.repository;

import org.springframework.data.repository.CrudRepository;

import prestito_illuminato.loan_history.model.Report;

public interface reportDAO extends CrudRepository<Report, Long> {

}
