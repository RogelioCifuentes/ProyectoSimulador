package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.model.Rol;
import cl.forge.programatufuruto.proyectosimulador.services.RolService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {


    private RolService rolService;

    public RolController(RolService rolService){
        this.rolService = rolService;
    }


    @RequestMapping("/encontrarRolPorId/{id}")
    public Rol encontrarRolPorId(@PathVariable("id") Integer id){

        return rolService.encontrarRol(id);

    }
}
