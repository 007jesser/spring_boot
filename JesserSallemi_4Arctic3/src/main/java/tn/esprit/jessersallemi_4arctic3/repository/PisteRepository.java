package tn.esprit.jessersallemi_4arctic3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.jessersallemi_4arctic3.entity.Piste;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}