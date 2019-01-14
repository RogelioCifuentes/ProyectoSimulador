package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.HistorialCreditos;
import org.springframework.data.repository.CrudRepository;

public interface HistorialCreditosRepository extends CrudRepository<HistorialCreditos, Integer> {

    long CountByHistorialCreditos();
}
