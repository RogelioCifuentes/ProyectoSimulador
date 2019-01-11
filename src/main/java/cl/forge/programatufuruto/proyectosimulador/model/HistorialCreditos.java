package cl.forge.programatufuruto.proyectosimulador.model;

import javax.persistence.*;


@Entity
@Table(name ="historialCreditos")
public class HistorialCreditos {

    @Id
    @Column(name = "idHistorialCreditos")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idHistorialCreditos;

    @Column(name="sueldo")
    private Integer sueldo;

    @Column(name ="nCuotas")
    private Integer nCuotas;

    @Column(name="seguro")
    private Boolean seguro;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public HistorialCreditos(){

    }

    public HistorialCreditos(Integer sueldo, Integer nCuotas, Boolean seguro, Usuario usuario) {
        this.sueldo = sueldo;
        this.nCuotas = nCuotas;
        this.seguro = seguro;
        this.usuario = usuario;
    }

    public Integer getIdHistorialCreditos() {
        return idHistorialCreditos;
    }

    public void setIdHistorialCreditos(Integer idHistorialCreditos) {
        this.idHistorialCreditos = idHistorialCreditos;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getnCuotas() {
        return nCuotas;
    }

    public void setnCuotas(Integer nCuotas) {
        this.nCuotas = nCuotas;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "HistorialCreditos{" +
                "idHistorialCreditos=" + idHistorialCreditos +
                ", sueldo=" + sueldo +
                ", nCuotas=" + nCuotas +
                ", seguro=" + seguro +
                ", usuario=" + usuario +
                '}';
    }
}
