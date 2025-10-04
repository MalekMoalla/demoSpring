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
public class Bloc {
    @Id
            @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    Long idBloc;
    String nomBloc;
    long capaciteBloc;
    //mappedBy l'attribut le plus faible dans la classe la plus faible
    @ManyToOne
    Foyer foyer;
    @OneToMany (mappedBy = "bloc")
    Set<Chambre> chambres;

}
