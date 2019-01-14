package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.repository.HistorialCreditosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialCreditosService {


    private HistorialCreditosRepository historialCreditosRepository;

    @Autowired
    public HistorialCreditosService(HistorialCreditosRepository historialCreditosRepository){
        this.historialCreditosRepository = historialCreditosRepository;
    }
}
