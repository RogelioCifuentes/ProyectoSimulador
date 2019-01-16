package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {
}
