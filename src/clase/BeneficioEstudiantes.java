/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author Huawei
 */
public class BeneficioEstudiantes {
    private Estudiante cedula;
    private Beneficios idBeneficio;

    public BeneficioEstudiantes(Estudiante cedula, Beneficios idBeneficio) {
        this.cedula = cedula;
        this.idBeneficio = idBeneficio;
    }
    
    public BeneficioEstudiantes() {
        this.cedula = null;
        this.idBeneficio = null;
    }

    public Estudiante getCedula() {
        return cedula;
    }

    public void setCedula(Estudiante cedula) {
        this.cedula = cedula;
    }

    public Beneficios getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Beneficios idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    
       
       
}
