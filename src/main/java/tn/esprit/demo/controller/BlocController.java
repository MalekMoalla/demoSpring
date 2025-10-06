package tn.esprit.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;
import tn.esprit.demo.Service.BlocService;
import tn.esprit.demo.entity.Bloc;

@RestController
@RequestMapping("/bloc")
@RequiredArgsConstructor
public class BlocController {
    private final BlocService blocService;

    @PostMapping(path = "/add")
    Bloc addBloc(@RequestBody Bloc bloc){
        return blocService.addBloc(bloc);
    }
    @DeleteMapping(path = "/delete/{id_bloc}")
    void deleteBloc(@PathVariable ("id_bloc" ) Long idBloc){
        blocService.deleteBlocByID(idBloc);
    }

}
