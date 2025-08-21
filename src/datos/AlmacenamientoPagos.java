/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import clase.PagosMensuales;
import java.util.ArrayList;

/**
 *
 * @author Huawei
 */
public class AlmacenamientoPagos {
    
    private ArrayList<PagosMensuales> listaPagos;

    // Constructores
    public AlmacenamientoPagos() {
        listaPagos = new ArrayList<>();
    }
    
    public AlmacenamientoPagos(ArrayList<PagosMensuales> listaPagos) {
        this.listaPagos = listaPagos;
    }

    // Getter y Setter
    public ArrayList<PagosMensuales> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(ArrayList<PagosMensuales> listaPagos) {
        this.listaPagos = listaPagos;
    }

    // Métodos CRUD
    public boolean insertarPago(PagosMensuales pago) {
        if (pago != null && !existePago(pago.getIdPago())) {
            return listaPagos.add(pago);
        }
        return false;
    }
    
    public boolean editarPago(int idPago, PagosMensuales nuevoPago) {
        if (nuevoPago != null) {
            for (int i = 0; i < listaPagos.size(); i++) {
                if (listaPagos.get(i).getIdPago() == idPago) {
                    listaPagos.set(i, nuevoPago);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean eliminarPago(int idPago) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getIdPago() == idPago) {
                return listaPagos.remove(pago);
            }
        }
        return false;
    }
    
    // Métodos de búsqueda
    public PagosMensuales buscarPorId(int idPago) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getIdPago() == idPago) {
                return pago;
            }
        }
        return null;
    }
    
    public ArrayList<PagosMensuales> buscarPorEstudiante(String cedula) {
        ArrayList<PagosMensuales> pagosEstudiante = new ArrayList<>();
        for (PagosMensuales pago : listaPagos) {
            if (pago.getEstudiante() != null && pago.getEstudiante().getCedula().equals(cedula)) {
                pagosEstudiante.add(pago);
            }
        }
        return pagosEstudiante;
    }
    
    public ArrayList<PagosMensuales> buscarPorMes(int año, int mes) {
        ArrayList<PagosMensuales> pagosMes = new ArrayList<>();
        for (PagosMensuales pago : listaPagos) {
            if (pago.getMes() != null && 
                pago.getMes().getYear() == año && 
                pago.getMes().getMonthValue() == mes) {
                pagosMes.add(pago);
            }
        }
        return pagosMes;
    }
    
    // Métodos de validación
    public boolean existePago(int idPago) {
        return buscarPorId(idPago) != null;
    }
    
    public boolean existePagoParaEstudianteEnMes(String cedula, int año, int mes) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getEstudiante() != null && 
                pago.getEstudiante().getCedula().equals(cedula) &&
                pago.getMes() != null &&
                pago.getMes().getYear() == año &&
                pago.getMes().getMonthValue() == mes) {
                return true;
            }
        }
        return false;
    }
    
    // Métodos utilitarios
    public int cantidadPagos() {
        return listaPagos.size();
    }
    
    public double totalPagadoEnMes(int año, int mes) {
        double total = 0;
        for (PagosMensuales pago : buscarPorMes(año, mes)) {
            total += pago.getPagoNeto();
        }
        return total;
    }
    
    public void listarTodosLosPagos() {
        for (PagosMensuales pago : listaPagos) {
            System.out.println(pago.toString());
        }
    }
    
    public void limpiarLista() {
        listaPagos.clear();
    }
}
