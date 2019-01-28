package cl.forge.programatufuruto.proyectosimulador;

import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin(origins="*")
@SpringBootApplication
@EnableSwagger2
public class Programa {

    public static void main(String[] args) {
        SpringApplication.run(Programa.class,args);
    }

  /* @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
*/



}
