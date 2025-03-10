package tn.esprit.jessersallemi_4arctic3.services;

import tn.esprit.jessersallemi_4arctic3.entity.Skier;

import java.util.List;

public interface ISkierServices {

    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void removeSkier(Long skier);
    Skier retriveSkier(Long numSkier);
    public List<Skier> retriveAll();
    public List<Skier> retrieveSkierByName(String fname , String lname);

}
