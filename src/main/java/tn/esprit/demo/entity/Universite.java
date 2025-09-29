package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Universite {
    @Id
    Long idUniv;
    String nomUniv;
    String adresse;
}
