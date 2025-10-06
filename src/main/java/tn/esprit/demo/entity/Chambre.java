package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter

public class Chambre {
    @Id
            @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    Long idChambre;
    long nomChambre;
    @Enumerated (EnumType.STRING)
    TypeChambre typeC;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    Set<Reservation> reservation;
}
