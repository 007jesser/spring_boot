package tn.esprit.jessersallemi_4arctic3.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Course implements Serializable {
    @Id
    private Long numCours;
    private int level;
    private TypeCourse typeCourse;
    private Support support;
    private Float price;
    private int timeSlot;
    @OneToMany (mappedBy = "course")
    Set<Registration> registration;
}