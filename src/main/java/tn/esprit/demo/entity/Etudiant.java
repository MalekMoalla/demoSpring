package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
            @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    long CIN;
    String ecole;
    Date dateNaissance;
    @ManyToMany
    Set<Reservation> reservations;

}
