package tn.esprit.demo.Service;

import tn.esprit.demo.entity.Bloc;

public interface BlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    Bloc getBlocById(Long id);
    Bloc deleteBloc(Long id);
    Bloc getBlocByName(String nomBloc);

}
