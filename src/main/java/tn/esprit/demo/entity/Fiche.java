package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Fiche {
    @Id
     Long id;
     String mois;
     String echelon;
     @ManyToOne
     User user;


}
