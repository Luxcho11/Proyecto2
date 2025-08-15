/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.time.LocalDate;

/**
 *
 * @author yamil
 */
public abstract class Persona {
    
    private String cedula;
    private String nombre;
    private LocalDate fecNac;
    private String direccion;
    private int telefono;
    private String email;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String cedula, String nombre, LocalDate fecNac, String direccion, int telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona() {
        this.cedula = "";
        this.nombre = "";
        this.fecNac = LocalDate.now();
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", fecNac=" + fecNac + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
    
}
