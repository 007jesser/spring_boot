package tn.esprit.jessersallemi_4arctic3.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity


public class Piste implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String namePiste;
    private color color;
    private int length;
    private int slope ;

    @ManyToMany
    Set<Skier> skier;


}
