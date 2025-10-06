package tn.esprit.demo.Service;

import tn.esprit.demo.entity.Bloc;

import java.util.List;

public interface BlocService {
    Bloc addBloc(Bloc bloc);
    void deleteBlocByID(Long idBloc);
    Bloc updateBloc(Bloc bloc);
    List<Bloc> findAllBloc();
    Bloc findBloc(Long idBloc);

}
