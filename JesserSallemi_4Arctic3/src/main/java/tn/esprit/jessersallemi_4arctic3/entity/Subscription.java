package tn.esprit.jessersallemi_4arctic3.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Subscription implements Serializable {
    @Id
  private long numSub ;
  private LocalDate startDate ;
  private LocalDate endDate ;
  private Float price;
  private TypeSubscription typeSub;
  @OneToOne
  private Skier user ;
  @ManyToOne
  private Skier skier;

}
