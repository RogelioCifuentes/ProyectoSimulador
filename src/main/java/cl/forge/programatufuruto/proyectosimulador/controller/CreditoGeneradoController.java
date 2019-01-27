package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.model.Banco;
import cl.forge.programatufuruto.proyectosimulador.model.CreditoGenerado;
import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import cl.forge.programatufuruto.proyectosimulador.services.CreditoGeneradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/creditosGenerados")
public class CreditoGeneradoController {


    private CreditoGeneradoService creditoGeneradoService;

    @Autowired
    public CreditoGeneradoController(CreditoGeneradoService creditoGeneradoService){
        this.creditoGeneradoService = creditoGeneradoService;
    }

    @PostMapping("/guardar")
    public void guardarCredito(@RequestBody CreditoGenerado creditoGenerado){

        creditoGeneradoService.guardarCredito(creditoGenerado);

    }



}
