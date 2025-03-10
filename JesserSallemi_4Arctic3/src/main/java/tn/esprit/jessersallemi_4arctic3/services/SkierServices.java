package tn.esprit.jessersallemi_4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.jessersallemi_4arctic3.entity.Skier;
import tn.esprit.jessersallemi_4arctic3.repository.SkierRepository;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class SkierServices {
    @Autowired
    private SkierRepository skierRepository;

    public Skier addSkier(Skier skier){
        return skierRepository.save(skier);
    }
    public Skier updateSkier(Skier skier){
        return skierRepository.save(skier);
    }
    public void removeSkier(Skier skier){
    //skierRepository.deleteById();

    }
    public Skier retriveSkier(Long numSkier){
        return skierRepository.findById(numSkier).get();
    }
    public Skier retriveAll(){
        return null;
    }
    public List<Skier> retrieveSkierByName(String fname , String lname){
        return skierRepository.findByFirstNameAndLastName(fname,lname);
    }

}