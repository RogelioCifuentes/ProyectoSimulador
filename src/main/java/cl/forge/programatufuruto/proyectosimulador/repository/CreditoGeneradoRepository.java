package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.CreditoGenerado;
import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CreditoGeneradoRepository extends CrudRepository<CreditoGenerado, Integer> {


    List<CreditoGenerado> findByUsuario(Usuario idUsuario);
    long count();
}
