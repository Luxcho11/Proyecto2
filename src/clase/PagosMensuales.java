/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.time.LocalDate;

/**
 *
 * @author Huawei
 */
public class PagosMensuales {
    private int idPago;
    private LocalDate fechCreacion;
    private LocalDate mes;
    private Estudiante estudiante;
    private int totalBeneficios;
    private int deducSeguro;
    private int deducRenta;
    private int pagoNeto;
    
    //

    public PagosMensuales(int idPago, LocalDate fechCreacion, LocalDate mes, Estudiante estudiante, int totalBeneficios, int deducSeguro, int deducRenta, int pagoNeto) {
        this.idPago = idPago;
        this.fechCreacion = fechCreacion;
        this.mes = mes;
        this.estudiante = estudiante;
        this.totalBeneficios = totalBeneficios;
        this.deducSeguro = deducSeguro;
        this.deducRenta = deducRenta;
        this.pagoNeto = pagoNeto;
    }
    
     public PagosMensuales() {
        this.idPago = 0;
        this.fechCreacion = null;
        this.mes = null;
        this.estudiante = null;
        this.totalBeneficios = 0;
        this.deducSeguro = 0;
        this.deducRenta = 0;
        this.pagoNeto = 0;
    }
     
     //

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public LocalDate getFechCreacion() {
        return fechCreacion;
    }

    public void setFechCreacion(LocalDate fechCreacion) {
        this.fechCreacion = fechCreacion;
    }

    public LocalDate getMes() {
        return mes;
    }

    public void setMes(LocalDate mes) {
        this.mes = mes;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getTotalBeneficios() {
        return totalBeneficios;
    }

    public void setTotalBeneficios(int totalBeneficios) {
        this.totalBeneficios = totalBeneficios;
    }

    public int getDeducSeguro() {
        return deducSeguro;
    }

    public void setDeducSeguro(int deducSeguro) {
        this.deducSeguro = deducSeguro;
    }

    public int getDeducRenta() {
        return deducRenta;
    }

    public void setDeducRenta(int deducRenta) {
        this.deducRenta = deducRenta;
    }

    public int getPagoNeto() {
        return pagoNeto;
    }

    public void setPagoNeto(int pagoNeto) {
        this.pagoNeto = pagoNeto;
    }
     
    // 
    public void calcularDeducciones(){
        if(totalBeneficios > 0){
            this.deducSeguro = calcularDeducSeguro();
            this.deducRenta = calcularDeducRenta();
            this.pagoNeto = calcularPagoNeto();
        }
    }
    
    public int calcularDeducSeguro(){
        return (int ) Math.round(totalBeneficios * 0.10);
    }
    
    public int calcularDeducRenta(){
        return (int ) Math.round(totalBeneficios * 0.05);
    }
    
    public int calcularPagoNeto(){
        return totalBeneficios - deducSeguro - deducRenta;
    }
     
}
