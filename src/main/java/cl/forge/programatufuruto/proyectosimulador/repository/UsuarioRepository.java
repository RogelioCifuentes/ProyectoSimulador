package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    boolean findByPassword(String password);

    Usuario findByRut(String rut);


}
