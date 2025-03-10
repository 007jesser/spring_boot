package tn.esprit.jessersallemi_4arctic3.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Registration implements Serializable {
    @Id
    private Long numRegistration;
    private int numWeek ;

    @ManyToOne
    private Skier skier;

    @ManyToOne
    Course course ;

}
