package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.CreditoGenerado;
import org.springframework.data.repository.CrudRepository;

public interface CreditoGeneradoRepository extends CrudRepository<CreditoGenerado, Integer> {


    long CountByCreditoGenerado();
}
