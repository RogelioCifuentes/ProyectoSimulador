package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import cl.forge.programatufuruto.proyectosimulador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }


    public void guardarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public boolean existeUsuarioPorId(String rut){
        return usuarioRepository.existsById(rut);
    }

    public boolean existeContraseña(String password){
        return usuarioRepository.findByPassword(password);
    }

    public Usuario obtenerUsuario(String rut){
        return usuarioRepository.findByRut(rut);     //???? Con esto basta para retornar el objeto entero segun su id??
    }


}
