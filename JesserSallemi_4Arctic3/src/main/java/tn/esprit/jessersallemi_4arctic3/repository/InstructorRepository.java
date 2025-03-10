package tn.esprit.jessersallemi_4arctic3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.jessersallemi_4arctic3.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}