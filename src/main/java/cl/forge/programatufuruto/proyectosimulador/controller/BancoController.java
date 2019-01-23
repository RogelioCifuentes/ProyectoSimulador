package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.model.Banco;
import cl.forge.programatufuruto.proyectosimulador.services.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bancos")
public class BancoController {

    private BancoService bancoService;

    @Autowired
    public BancoController(BancoService bancoService){
        this.bancoService = bancoService;
    }


    //LISTAR TODOS LOS BANCOS
    @CrossOrigin(origins="*")
    @RequestMapping("/listar")
    public List<Banco> listarBancos(){
        List<Banco> lista = new ArrayList<>();
        bancoService.findAll().forEach(Banco -> lista.add(Banco));
        return lista;
    }

    //Traer Banco por ID
    @CrossOrigin(origins="*")
    @PutMapping("/banco")
    public Banco traerBanco(@RequestBody Banco banco){
        return bancoService.findById(banco.getIdNombre());
    }



    //Setear cae y tasaInteres
    @CrossOrigin(origins="*")
    @PutMapping("/setear")
    public boolean setCaeYTasaInteres(@RequestBody Banco banco ) {

        Banco banquito = bancoService.findById(banco.getIdNombre());

        if(banco.getCae() != null)
            banquito.setCae(banco.getCae());

        if(banco.getTasaInteresMensual() != null)
            banquito.setTasaInteresMensual(banco.getTasaInteresMensual());

        if(banco.getGastosAsociados() != null)
            banquito.setGastosAsociados(banco.getGastosAsociados());

        bancoService.guardarBanco(banquito);
        return true;

    }

        /*
        if(banco.getCae()!=0 && banco.getTasaInteresMensual()!=0 && banco.getGastosAsociados()!=0){

            Banco banquito = bancoService.findById(banco.getIdNombre());
                    banquito.setCae(banco.getCae());
                    banquito.setGastosAsociados(banco.getGastosAsociados());
                    banquito.setTasaInteresMensual(banco.getTasaInteresMensual());
                    bancoService.guardarBanco(banquito);


            System.out.println("Datos actualizados exitosamente"+banco.getGastosAsociados()+" -"+banco.getTasaInteresMensual()+" - "+banco.getCae());
            return true;


            //NO FUNCIONAN ESTAS CONDICIONES, SI INTENTO AÑADIR SOLO UNA VARIABLE, NO PERMITE ACTUALIZAR
        }else if(banco.getCae()!=0 || banco.getTasaInteresMensual()==0 | banco.getGastosAsociados()==0){
            Banco banquito = bancoService.findById(banco.getIdNombre());
                    banquito.setCae(banco.getCae());
                    bancoService.guardarBanco(banquito);
            return true;
        }else if(banco.getCae() == 0 || banco.getTasaInteresMensual()!=0 || banco.getGastosAsociados()==0){
            Banco banquito = bancoService.findById(banco.getIdNombre());
                    banquito.setTasaInteresMensual(banco.getTasaInteresMensual());
                    bancoService.guardarBanco(banquito);
            return true;
        }else {

            if (banco.getGastosAsociados() != 0) {
                Banco banquito = bancoService.findById(banco.getIdNombre());
                        banquito.setGastosAsociados(banco.getGastosAsociados());
                        bancoService.guardarBanco(banquito);
                return true;
            }else{
                System.out.println("Ingrese bien los datos");
            }
        }
        return false;
    }

*/
}
