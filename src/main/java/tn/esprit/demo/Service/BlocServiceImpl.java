package tn.esprit.demo.Service;

import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Bloc;
import tn.esprit.demo.repository.BlocRepository;

import java.util.List;

@Service

public class BlocServiceImpl implements BlocService {
    BlocRepository blocRepository;
    public BlocServiceImpl(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    @Override
    public void deleteBlocByID(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    @Override
    public List<Bloc> findAllBloc() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc findBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }
}
