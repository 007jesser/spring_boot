package tn.esprit.jessersallemi_4arctic3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.jessersallemi_4arctic3.entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
