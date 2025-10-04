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
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
            @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    //mappedBy l'attribut le plus faible dans la classe la plus faible
    @OneToOne (mappedBy = "foyer")
    Universite universite;
    @OneToMany (mappedBy = "foyer")
     Set<Bloc> blocs;

}
