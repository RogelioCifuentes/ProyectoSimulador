package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.CreditoGenerado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreditoGeneradoRepository extends CrudRepository<CreditoGenerado, Integer> {


    long count();
}
