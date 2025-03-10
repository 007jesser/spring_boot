package tn.esprit.jessersallemi_4arctic3.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Skier implements Serializable {
    @Id
    private long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dataOfBirth;
    private String city;
    @OneToOne (mappedBy = "user" )
    Subscription subscription;
    @OneToMany(mappedBy = "skier", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Subscription> subscriptions;
    @ManyToMany (mappedBy = "skier")
    Set<Piste> piste;

}
