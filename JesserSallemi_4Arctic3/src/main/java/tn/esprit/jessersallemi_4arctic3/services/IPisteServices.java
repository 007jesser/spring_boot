package tn.esprit.jessersallemi_4arctic3.services;

import tn.esprit.jessersallemi_4arctic3.entity.Piste;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste piste);
    Piste update(Piste piste);
    Piste retrievePiste(long numPiste);
    void deletePiste(long numPiste);
    List <Piste> retrieveAll();
}
