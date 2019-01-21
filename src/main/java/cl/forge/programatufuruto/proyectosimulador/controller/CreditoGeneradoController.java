package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.services.CreditoGeneradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creditosGenerados")
public class CreditoGeneradoController {


    private CreditoGeneradoService creditoGeneradoService;

    @Autowired
    public CreditoGeneradoController(CreditoGeneradoService creditoGeneradoService){
        this.creditoGeneradoService = creditoGeneradoService;
    }



}
