package cl.forge.programatufuruto.proyectosimulador.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="creditoGenerado")
public class CreditoGenerado {

    @Id
    @Column(name="idCreditoGenerado")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCreditoGenerado;

    @Column(name =" nombre")
    private String nombre;

    @Column(name ="valorCuota")
    private Integer valorCuota;

    @Column(name = "cae")
    private Float cae;

    @Column(name="tasaInteresMensual")
    private Float tasaInteresMensual;

    @Column(name = "gastosAsociados")
    private Integer gastosAsociados;

    @Column(name = "seguro")
    private Integer seguro;

    @Column(name="totalIntereses")
    private Integer totalIntereses;

    @Column(name ="montoBrutoCredito")
    private Integer montoBrutoCredito;

    @Column(name = "costoTotal")
    private Integer costoTotal;

    @Column(name = "fechaCredito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCredito = new Date();

    @ManyToOne
    @JoinColumn(name = "idBanco")
    private Banco banco;

    @ManyToOne
    @JoinColumn(name = "rut")
    private Usuario usuario;

    public CreditoGenerado(){

    }

    public CreditoGenerado(Integer id){
        this.idCreditoGenerado = id;
    }

    
    public CreditoGenerado(Integer idCreditoGenerado, String nombre, Integer valorCuota, Float cae, Float tasaInteresMensual, Integer gastosAsociados, Integer seguro, Integer totalIntereses, Integer montoBrutoCredito, Integer costoTotal, Date fechaCredito, Banco banco, Usuario usuario) {
        this.idCreditoGenerado = idCreditoGenerado;
        this.nombre = nombre;
        this.valorCuota = valorCuota;
        this.cae = cae;
        this.tasaInteresMensual = tasaInteresMensual;
        this.gastosAsociados = gastosAsociados;
        this.seguro = seguro;
        this.totalIntereses = totalIntereses;
        this.montoBrutoCredito = montoBrutoCredito;
        this.costoTotal = costoTotal;
        this.fechaCredito = fechaCredito;
        this.banco = banco;
        this.usuario = usuario;
    }
/*
    public CreditoGenerado(String nombre, Integer valorCuota, Float cae, Float tasaInteresMensual, Integer gastosAsociados, Integer seguro, Integer totalIntereses, Integer montoBrutoCredito, Integer costoTotal, Banco banco, Usuario usuario) {
        this.nombre = nombre;
        this.valorCuota = valorCuota;
        this.cae = cae;
        this.tasaInteresMensual = tasaInteresMensual;
        this.gastosAsociados = gastosAsociados;
        this.seguro = seguro;
        this.totalIntereses = totalIntereses;
        this.montoBrutoCredito = montoBrutoCredito;
        this.costoTotal = costoTotal;
        this.banco = banco;
        this.usuario = usuario;
    }
*/
    public Integer getIdCreditoGenerado() {
        return idCreditoGenerado;
    }

    public void setIdCreditoGenerado(Integer idCreditoGenerado) {
        this.idCreditoGenerado = idCreditoGenerado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(Integer valorCuota) {
        this.valorCuota = valorCuota;
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

    public Integer getGastosAsociados() {
        return gastosAsociados;
    }

    public void setGastosAsociados(Integer gastosAsociados) {
        this.gastosAsociados = gastosAsociados;
    }

    public Integer getSeguro() {
        return seguro;
    }

    public void setSeguro(Integer seguro) {
        this.seguro = seguro;
    }

    public Integer getTotalIntereses() {
        return totalIntereses;
    }

    public void setTotalIntereses(Integer totalIntereses) {
        this.totalIntereses = totalIntereses;
    }

    public Integer getMontoBrutoCredito() {
        return montoBrutoCredito;
    }

    public void setMontoBrutoCredito(Integer montoBrutoCredito) {
        this.montoBrutoCredito = montoBrutoCredito;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaCredito() {
        return fechaCredito;
    }

    public void setFechaCredito(Date fechaCredito) {
        this.fechaCredito = fechaCredito;
    }

    @Override
    public String toString() {
        return "CreditoGenerado{" +
                "idCreditoGenerado=" + idCreditoGenerado +
                ", nombre='" + nombre + '\'' +
                ", valorCuota=" + valorCuota +
                ", cae=" + cae +
                ", tasaInteresMensual=" + tasaInteresMensual +
                ", gastosAsociados=" + gastosAsociados +
                ", seguro=" + seguro +
                ", totalIntereses=" + totalIntereses +
                ", montoBrutoCredito=" + montoBrutoCredito +
                ", costoTotal=" + costoTotal +
                ", fechaCredito=" + fechaCredito +
                ", banco=" + banco +
                ", usuario=" + usuario +
                '}';
    }

}
