package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.HistorialCreditos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HistorialCreditosRepository extends CrudRepository<HistorialCreditos, Integer> {

    long count();
}
