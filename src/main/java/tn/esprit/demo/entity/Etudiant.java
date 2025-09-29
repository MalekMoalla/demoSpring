package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Etudiant {
    @Id
    Long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    Long CIN;
    String ecole;
    Date dateNaissance;
}
