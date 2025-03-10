package tn.esprit.jessersallemi_4arctic3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.jessersallemi_4arctic3.entity.Skier;

import java.util.List;

@Repository
public interface SkierRepository extends CrudRepository<Skier, Long> {
List<Skier> findByFirstNameAndLastName(String firstName, String lastName);
}