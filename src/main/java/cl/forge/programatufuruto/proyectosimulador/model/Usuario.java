package cl.forge.programatufuruto.proyectosimulador.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "rut")
    private String rut;


    @Column(name = "password")
    private String password;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    @Column(name = "fechaRegistro")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name ="idRol")
    private Rol rol;


    public Usuario(){

    }

    public Usuario(String rut){
        this.rut = rut;
    }

    public Usuario(String rut, String password, String nombre, String apellido, String correo, Date fechaRegistro) {
        this.rut = rut;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "rut='" + rut + '\'' +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
