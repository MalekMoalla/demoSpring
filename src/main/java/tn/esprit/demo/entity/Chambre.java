package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Chambre {
    @Id
    Long idChambre;
    Long nomChambre;
    TypeChambre typeC;
}
