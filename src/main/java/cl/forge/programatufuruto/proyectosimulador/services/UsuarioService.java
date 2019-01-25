package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.Rol;
import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import cl.forge.programatufuruto.proyectosimulador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    public List<Usuario> traerEjecutivos(){

        List<Usuario> ejecutivos = new ArrayList<>();
        usuarioRepository.findByRol(new Rol(2)).forEach(Usuario -> ejecutivos.add(Usuario));;
        return ejecutivos;
    }


    public List<Usuario> validador(String rut, String password){return usuarioRepository.findByRutAndPassword(rut,password); }
    public Usuario validador2(String correo, String password){
        return usuarioRepository.findByCorreoAndPassword(correo, password);
    }


    public void guardarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }


    public boolean existeUsuarioPorId(String rut){
        return usuarioRepository.existsById(rut);
    }

    public Usuario obtenerUsuario(String rut){
        return usuarioRepository.findById(rut).get();
    }

    public Usuario obtenerUsuarioPorCorreo(String correo){
        return usuarioRepository.findByCorreo(correo);
    }




}
