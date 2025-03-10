package tn.esprit.jessersallemi_4arctic3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.jessersallemi_4arctic3.entity.Skier;
import tn.esprit.jessersallemi_4arctic3.services.ISkierServices;

import java.util.List;

@RestController
@RequestMapping("skier")
@RequiredArgsConstructor
public class SkierController {
    private final ISkierServices skierService;

    @PostMapping("add-skier")
    public Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @GetMapping("get-all-skiers")
    public List<Skier> getAllSkiers() {
        return skierService.retriveAll();
    }

    @GetMapping("get-one-skier")
    public Skier getSkier(@RequestParam Long numSkier) {
        return skierService.retriveSkier(numSkier);
    }

    @DeleteMapping("delete-skier")
    public ResponseEntity<String> deleteSkier(@RequestParam Long numSkier) {
        skierService.removeSkier(numSkier);
        return ResponseEntity.ok().body("Skier deleted successfully");
    }


}