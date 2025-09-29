package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Presence {
    @Id
    Long id;
    String jour;
    String seance;
    @ManyToMany
    Set<User> user;

}
