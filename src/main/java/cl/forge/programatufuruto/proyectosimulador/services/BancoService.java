package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BancoService {

    private BancoRepository bancoRepository;

    @Autowired
    public BancoService(BancoRepository bancoRepository){
        this.bancoRepository = bancoRepository;
    }


}
