package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.Rol;
import cl.forge.programatufuruto.proyectosimulador.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {


    private RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    public Rol encontrarRol(Integer id){
        return rolRepository.findById(id).get();
    }
}
