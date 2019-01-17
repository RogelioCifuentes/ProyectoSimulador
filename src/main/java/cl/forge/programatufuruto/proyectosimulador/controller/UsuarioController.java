package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.model.Usuario;
import cl.forge.programatufuruto.proyectosimulador.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @CrossOrigin()
    @RequestMapping("/registrar")
    public void registrarUsuario(@RequestParam String rut, @RequestParam String password, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String correo) {

        if (usuarioService.existeUsuarioPorId(rut)) {               //Compara el RUT ingresado y lo compara con la DB, si esque esta, arroja un mensaje que dice que esta en uso
            System.out.println("Rut actualmente en uso");
        }else{                                                             //Si no esta, crea un objeto usuario, cuyo rol se define por el admin
            Usuario usuario = new Usuario(rut, password, nombre, apellido, correo, new Date());
            usuarioService.guardarUsuario(usuario);
            System.out.println("Usuario registrado exitosamente");
        }
    }

    @CrossOrigin()
    @RequestMapping("/login")
    public boolean login(@RequestParam("rut") String rut, @RequestParam("password") String password){

        List<Usuario> lista = usuarioService.validador(rut,password);                       //Se hace una consulta a la DB con los datos ingresados y se crea una lista con el resultado

        if(lista.size() != 0){                                                              //Si la lista es distinta de 0, es porque hay alguien con ese RUT y esa PASSWORD en la DB
            String nombre = usuarioService.obtenerUsuario(rut).getNombre();                 //La consulta obtenerUsuario, me trae un objeto Usuario por su rut, del cual se le extrae el nombre
            System.out.println("Bienvenido "+nombre);
            return true;
        }else{
            System.out.println("Usuario o contraseña incorrectos");
            return false;
        }
    }


}
