package tn.esprit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo.entity.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
//Requette de recherche d'un bloc connu par son nom
    Bloc findByNomBloc(String nomBloc);
}
