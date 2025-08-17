
package datos;

import clase.Carreras;
import java.util.ArrayList;

public class AlmacenamientoCarreras {
    private ArrayList<Carreras> listaCarreras;

    public AlmacenamientoCarreras(ArrayList<Carreras> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public ArrayList<Carreras> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(ArrayList<Carreras> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }
    
    //metodo crud
    public void insertarBenefico (Carreras carrera){
        if (this.listaCarreras != null){
            this.listaCarreras.add(carrera);
        }
    }
    
    public void editarCarreras (int index, Carreras newCarrera){
        if(index >= 0 && newCarrera != null && !listaCarreras.isEmpty()){
            this.listaCarreras.set(index, newCarrera);
        }
    }
    
    public boolean eliminarCarreras (Carreras carrera){
        if(this.listaCarreras.contains(carrera)){ //carrera es el objeto
            this.listaCarreras.remove(carrera);
            return true;
        }
        return false;
    }
    
    public Carreras buscarIdCarreras (int idCarrera){
        for(Carreras i: listaCarreras){ //i de id
            if (i.getIdCarrera() == idCarrera){ 
                return i;
            }
        }
        return null;
    }
    
      public Carreras buscarNombreCarrera (String nombre){ //para buscar por nombre
        for(Carreras n: listaCarreras){ //n de nombre
            if (n.getNomCarrera().equals(nombre)){ 
                return n;
            }
        }
        return null;
    }
}
