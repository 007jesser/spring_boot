package tn.esprit.jessersallemi_4arctic3.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Instructor implements Serializable {
    @Id
    private Long numInstructor;
    private String firstName;
    private String lastName;
    private LocalDate dateOfHired;
    @ManyToMany
    Set<Course> courses;
}
