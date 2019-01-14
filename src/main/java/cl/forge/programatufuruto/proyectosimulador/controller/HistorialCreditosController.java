package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.services.HistorialCreditosService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historialCreditos")
public class HistorialCreditosController {


    private HistorialCreditosService historialCreditosService;

    public HistorialCreditosController(HistorialCreditosService historialCreditosService){
        this.historialCreditosService = historialCreditosService;
    }
}
