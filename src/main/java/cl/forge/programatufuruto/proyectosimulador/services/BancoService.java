package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.Banco;
import cl.forge.programatufuruto.proyectosimulador.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoService {

    private BancoRepository bancoRepository;

    @Autowired
    public BancoService(BancoRepository bancoRepository){
        this.bancoRepository = bancoRepository;
    }

    public void guardarBanco(Banco banco){
        bancoRepository.save(banco);
    }
    public Iterable<Banco> findAll(){
        return bancoRepository.findAll();
    }

    public Banco findById(String idBanco){
        return bancoRepository.findById(idBanco).get();
    }


}
