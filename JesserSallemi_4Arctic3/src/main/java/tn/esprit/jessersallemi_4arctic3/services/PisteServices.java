package tn.esprit.jessersallemi_4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.jessersallemi_4arctic3.entity.Piste;
import tn.esprit.jessersallemi_4arctic3.repository.PisteRepository;

import java.util.List;
@Service
public class PisteServices implements IPisteServices {
    @Autowired
    private final PisteRepository pisteRepository;

    public PisteServices(PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste update(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(long numPiste) {
        return pisteRepository.getReferenceById(numPiste);
    }

    @Override
    public void deletePiste(long numPiste) {

    }

    @Override
    public List<Piste> retrieveAll() {
        return List.of();
    }
}
