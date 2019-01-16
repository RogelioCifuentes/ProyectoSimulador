package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import org.springframework.data.repository.CrudRepository;



public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    boolean findById(Usuario usuario);

    boolean findByPassword(String password);

    Usuario findByRut(String rut);


}
