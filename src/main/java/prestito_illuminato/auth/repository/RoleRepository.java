package prestito_illuminato.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prestito_illuminato.auth.entity.ERole;
import prestito_illuminato.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
