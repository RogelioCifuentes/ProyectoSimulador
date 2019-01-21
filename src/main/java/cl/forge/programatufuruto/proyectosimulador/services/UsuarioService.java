package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import cl.forge.programatufuruto.proyectosimulador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }


    public List<Usuario> validador(String rut, String password){
        return usuarioRepository.findByRutAndPassword(rut,password);
    }


    public void guardarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }


    public boolean existeUsuarioPorId(String rut){
        return usuarioRepository.existsById(rut);
    }


    public Usuario obtenerUsuario(String rut){
        return usuarioRepository.findByRut(rut);     //???? Con esto basta para retornar el objeto entero segun su id??
    }


}
