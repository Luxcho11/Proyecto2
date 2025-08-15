/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import clase.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author yamil
 */
public class ListaEstudiantes {

    private ArrayList<Estudiante> listaEstudiantes;

    public ListaEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public Estudiante obtenerEstudiante(String cedula) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    public void listarEstudiantes() {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + listaEstudiantes.get(i));
        }
    }

    public boolean eliminarPorCedula(String cedula) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return listaEstudiantes.remove(estudiante); 
            }
        }
        return false;
    }

}
