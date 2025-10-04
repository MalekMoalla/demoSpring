package tn.esprit.demo.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Bloc;
import tn.esprit.demo.repository.BlocRepository;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements BlocService {
    BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public Bloc getBlocById(Long id) {
        return blocRepository.findById(id).orElse(null);
    }
    public Bloc deleteBloc(Long id) {
        Bloc bloc = blocRepository.findById(id).orElse(null);
        if (bloc != null) {
            blocRepository.delete(bloc);
        }
        return bloc;
    }
    public Bloc getBlocByName(String nomBloc) {
        return blocRepository.findByNomBloc(nomBloc);
    }
}
