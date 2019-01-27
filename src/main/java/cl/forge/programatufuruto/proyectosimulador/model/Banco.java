package cl.forge.programatufuruto.proyectosimulador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banco")
public class Banco {

    @Id
    @Column(name="idNombre")
    private String idNombre;

    @Column(name="cae")
    private Float cae;

    @Column(name="tasaInteresMensual")
    private Float tasaInteresMensual;

    @Column(name="gastosAsociados")
    private Float gastosAsociados;


    public Banco(){

    }



    public Banco(String idNombre, Float cae, Float tasaInteresMensual, Float gastosAsociados) {
        this.idNombre = idNombre;
        this.cae = cae;
        this.tasaInteresMensual = tasaInteresMensual;
        this.gastosAsociados = gastosAsociados;
    }

    public String getIdNombre() {
        return idNombre;
    }

    public void setIdNombre(String idNombre) {
        this.idNombre = idNombre;
    }

    public Float getCae() {
        return cae;
    }

    public void setCae(Float cae) {
        this.cae = cae;
    }

    public Float getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(Float tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public Float getGastosAsociados() {
        return gastosAsociados;
    }

    public void setGastosAsociados(Float gastosAsociados) {
        this.gastosAsociados = gastosAsociados;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "idNombre='" + idNombre + '\'' +
                ", cae=" + cae +
                ", tasaInteresMensual=" + tasaInteresMensual +
                ", gastosAsociados=" + gastosAsociados +
                '}';
    }
}
