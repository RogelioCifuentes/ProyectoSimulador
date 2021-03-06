package cl.forge.programatufuruto.proyectosimulador.services;


import cl.forge.programatufuruto.proyectosimulador.model.CreditoGenerado;
import cl.forge.programatufuruto.proyectosimulador.repository.CreditoGeneradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreditoGeneradoService {

    private CreditoGeneradoRepository creditoGeneradoRepository;

    @Autowired
    public CreditoGeneradoService(CreditoGeneradoRepository creditoGeneradoRepository){
        this.creditoGeneradoRepository = creditoGeneradoRepository;
    }

    public Iterable<CreditoGenerado> listarCreditosGenerados(){
        return creditoGeneradoRepository.findAll();
    }

    public CreditoGenerado listarCreditoGeneradoPorId(Integer idCreditoGenerado){
        return creditoGeneradoRepository.findById(idCreditoGenerado).get();
    }


    public long numeroDeCreditosGenerados(){
       return creditoGeneradoRepository.count();
    }



}
