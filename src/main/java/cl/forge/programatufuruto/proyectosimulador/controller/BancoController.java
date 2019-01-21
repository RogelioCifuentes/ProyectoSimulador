package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.model.Banco;
import cl.forge.programatufuruto.proyectosimulador.services.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bancos")
public class BancoController {

    private BancoService bancoService;

    @Autowired
    public BancoController(BancoService bancoService){
        this.bancoService = bancoService;
    }


    //LISTAR TODOS LOS BANCOS
    @CrossOrigin(origins="*")
    @RequestMapping("/listar")
    public List<Banco> listarBancos(){
        List<Banco> lista = new ArrayList<>();
        bancoService.findAll().forEach(Banco -> lista.add(Banco));
        return lista;
    }


    //LISTAR POR ID BANCO
    @CrossOrigin(origins="*")
    @RequestMapping("/id/{id}")
    public Banco buscarPorId(@PathVariable(value="id") String id){
       return bancoService.findById(id);
    }


}
