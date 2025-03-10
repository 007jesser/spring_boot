package tn.esprit.jessersallemi_4arctic3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.jessersallemi_4arctic3.entity.Piste;
import tn.esprit.jessersallemi_4arctic3.services.IPisteServices;
import tn.esprit.jessersallemi_4arctic3.services.PisteServices;

import java.util.List;
@RestController
@RequestMapping("piste")
public class PisteRestController {
    @Autowired
    private IPisteServices pisteServices;
   @PostMapping("skier/add")
    public Piste addPiste (Piste piste){
        return pisteServices.addPiste(piste);
    }
    @PutMapping("skier/update")
    public Piste updatePiste (Piste piste){
        return pisteServices.update(addPiste(piste));
    }
    @GetMapping("get/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste){
        return pisteServices.retrievePiste(numPiste);
    }
    @DeleteMapping("delete/{numPiste}")
    public void deletePiste (@PathVariable Long numPiste){
        pisteServices.deletePiste(numPiste);
    }
    @GetMapping("all")
    public List <Piste> retrieveAll(){
        return pisteServices.retrieveAll();

    }
}
