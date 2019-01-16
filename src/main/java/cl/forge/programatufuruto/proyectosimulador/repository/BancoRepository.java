package cl.forge.programatufuruto.proyectosimulador.repository;

import cl.forge.programatufuruto.proyectosimulador.model.Banco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends CrudRepository<Banco, String> {
}
