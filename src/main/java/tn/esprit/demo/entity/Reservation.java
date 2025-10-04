package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
            @GeneratedValue (strategy = GenerationType.TABLE)
    String IdReservation;
    LocalDate anneeUniversitaire;
    boolean valide;
    //mappedBy l'attribut le plus faible dans la classe la plus faible
    @ManyToMany (mappedBy = "reservations")
    Set <Etudiant> etudiants;

}