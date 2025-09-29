package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Foyer {
    @Id
    Long idfoyer;
    String nomfoyer;
    Long acapacitéfoyer;
}
