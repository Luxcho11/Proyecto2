package datos;

import clase.BeneficioEstudiantes;
import clase.Beneficios;
import java.util.ArrayList;

public class AlmacenamientoBeneficiosEstudiante {

    private ArrayList<BeneficioEstudiantes> listaBenefEstudiante;

    public AlmacenamientoBeneficiosEstudiante() {
        this.listaBenefEstudiante = new ArrayList<>();
    }

    public AlmacenamientoBeneficiosEstudiante(ArrayList<BeneficioEstudiantes> listaBenefEstudiante) { //constructor 
        this.listaBenefEstudiante = listaBenefEstudiante;
    }

    public ArrayList<BeneficioEstudiantes> getlistaBenefEstudiante() { //get
        return listaBenefEstudiante;
    }

    public void setlistaBenefEstudiante(ArrayList<BeneficioEstudiantes> listaBenefEstudiante) { //set
        this.listaBenefEstudiante = listaBenefEstudiante;
    }

    //metodo crud
//  public boolean insertarBeneficioEstudiante(BeneficioEstudiantes benefEstudiante) {
//    //if (this.listaBenefEstudiante != null && !existeAsignacion(benefEstudiante.getCedula(), benefEstudiante.getIdBeneficio())) {
//    if (this.listaBenefEstudiante != null && !existeAsignacion(benefEstudiante.getCedula(), benefEstudiante.getIdBeneficio())){
//        this.listaBenefEstudiante.add(benefEstudiante);
//        return true;
//    }
//    return false;
//}

    public void editarBeneficioEstudiante(int index, BeneficioEstudiantes newBenefEstudiante) {
        if (index >= 0 && index < listaBenefEstudiante.size() && newBenefEstudiante != null) {
            this.listaBenefEstudiante.set(index, newBenefEstudiante);
        }
    }

    public boolean eliminarBeneficioEstudiante(BeneficioEstudiantes beneficioEstudiante) {
        if (this.listaBenefEstudiante.contains(beneficioEstudiante)) {
            return this.listaBenefEstudiante.remove(beneficioEstudiante);
        }
        return false;
    }

//    public BeneficioEstudiantes buscarIdBeneficio (Beneficios idBeneEstu){
//        for(BeneficioEstudiantes i: listaBenefEstudiante){ //i de id
//            if (i.getIdBeneficio() == idBeneEstu){ 
//                return i;
//            }
//        }
//        return null;
//    }
    public BeneficioEstudiantes buscarPorIdBeneficio(Beneficios idBeneficio) {
        for (BeneficioEstudiantes benefEst : listaBenefEstudiante) {
            if (benefEst.getIdBeneficio() == idBeneficio) {
                return benefEst;
            }
        }
        return null;
    }

    public ArrayList<BeneficioEstudiantes> buscarPorCedula(String cedula) {
        ArrayList<BeneficioEstudiantes> resultados = new ArrayList<>();
        for (BeneficioEstudiantes benefEst : listaBenefEstudiante) {
            if (benefEst.getCedula().equals(cedula)) {
                resultados.add(benefEst);
            }
        }
        return resultados;
    }

    public boolean existeAsignacion(String cedula, Beneficios idBeneficio) {
        for (BeneficioEstudiantes benefEst : listaBenefEstudiante) {
            if (benefEst.getCedula().equals(cedula) && benefEst.getIdBeneficio() == idBeneficio) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<BeneficioEstudiantes> obtenerBeneficiosDeEstudiante(String cedula) {
        return buscarPorCedula(cedula);
    }

    public int cantidadDeBeneficiosAsignados() {
        return listaBenefEstudiante.size();
    }

    public void limpiarLista() {
        listaBenefEstudiante.clear();
    }

}
