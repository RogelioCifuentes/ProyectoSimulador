package cl.forge.programatufuruto.proyectosimulador.controller;


import cl.forge.programatufuruto.proyectosimulador.model.Rol;
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


    //REGISTRO DE USUARIO NORMAL
    @CrossOrigin(origins="*")
    @PostMapping("/registrar")
    public boolean registrarUsuario(@RequestBody Usuario user) {

        if (usuarioService.existeUsuarioPorId(user.getRut())) {               //Compara el RUT ingresado y lo compara con la DB, si esque esta, arroja un mensaje que dice que esta en uso
            System.out.println("Rut actualmente en uso");
            return false;
        }else{                                                             //Si no esta, crea un objeto usuario, cuyo rol se define por el admin
            Usuario usuario = new Usuario(user.getRut(), user.getPassword(), user.getNombre(), user.getApellido(), user.getCorreo(), new Date(), new Rol(3,"Usuario Comun", "Usuario"));
            usuarioService.guardarUsuario(usuario);
            System.out.println("Usuario registrado exitosamente");
            return true;
        }
    }

    //LOGIN USUARIO NORMAL Y EJECUTIVO
    @CrossOrigin(origins="*")
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario user){

        List<Usuario> lista = usuarioService.validador(user.getRut(), user.getPassword());                       //Se hace una consulta a la DB con los datos ingresados y se crea una lista con el resultado

        if(lista.size() != 0){                                                              //Si la lista es distinta de 0, es porque hay alguien con ese RUT y esa PASSWORD en la DB
            String nombre = usuarioService.obtenerUsuario(user.getRut()).getNombre();                 //La consulta obtenerUsuario, me trae un objeto Usuario por su rut, del cual se le extrae el nombre
            System.out.println("Bienvenido "+nombre);

            return usuarioService.obtenerUsuario(user.getRut());
        }else{
            System.out.println("Usuario o contraseña incorrectos");
            return null;
        }
    }

    @CrossOrigin(origins="*")
    @PutMapping("/registrarEjecutivo")
    public boolean registrarUsuarioEjecutivo(@RequestBody Usuario user) {

        if (usuarioService.existeUsuarioPorId(user.getRut())) {               //Compara el RUT ingresado y lo compara con la DB, si esque esta, arroja un mensaje que dice que esta en uso
            System.out.println("Rut actualmente en uso");
            return false;
        }else{                                                             //Si no esta, crea un objeto usuario, cuyo rol se define por el admin
            Usuario usuario = new Usuario(user.getRut(), user.getPassword(), user.getNombre(), user.getApellido(), user.getCorreo(), new Date(),new Rol(2,"Ejecutivo","Puede ver tablas especiales"));
            usuarioService.guardarUsuario(usuario);
            System.out.println("Usuario registrado exitosamente");
            return true;
        }
    }


}
