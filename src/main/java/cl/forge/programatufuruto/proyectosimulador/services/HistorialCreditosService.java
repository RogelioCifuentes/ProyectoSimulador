package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.HistorialCreditos;
import cl.forge.programatufuruto.proyectosimulador.repository.HistorialCreditosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistorialCreditosService {


    private HistorialCreditosRepository historialCreditosRepository;

    @Autowired
    public HistorialCreditosService(HistorialCreditosRepository historialCreditosRepository){
        this.historialCreditosRepository = historialCreditosRepository;
    }

    public Iterable<HistorialCreditos> listaCreditos(){
        return historialCreditosRepository.findAll();
    }

    public long numeroDeHistorialCreditos(){
        return historialCreditosRepository.count();
    }
}
