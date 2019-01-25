package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.Rol;
import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {




    List<Usuario> findByRol(Rol rol);
    List<Usuario> findByRutAndPassword(String rut, String password);
    Usuario findByCorreoAndPassword(String correo, String password);
    Usuario findByCorreo(String correo);






}
