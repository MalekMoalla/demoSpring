package tn.esprit.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bloc {
    @Id
    Long idBloc;
    String nomBloc;
    Long capaciteBloc;

}
