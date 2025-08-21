
package datos;

import clase.Beneficios;
import java.util.ArrayList;

public class AlmacenamientoBeneficios {
    private ArrayList<Beneficios> listaBeneficios;

    public AlmacenamientoBeneficios(ArrayList<Beneficios> listaBeneficios) { //constructor 
        this.listaBeneficios = listaBeneficios;
    }

    public ArrayList<Beneficios> getListaBeneficios() { //get
        return listaBeneficios;
    }

    public void setListaBeneficios(ArrayList<Beneficios> listaBeneficios) { //set
        this.listaBeneficios = listaBeneficios;
    }
    
    //metodo crud
    public void insertarBeneficio (Beneficios bnficios){
        if (this.listaBeneficios != null){
            this.listaBeneficios.add(bnficios);
        }
    }
    
    public void editarBeneficios (int index, Beneficios newBeneficio){
        if(index >= 0 && newBeneficio != null && !listaBeneficios.isEmpty()){
            this.listaBeneficios.set(index, newBeneficio);
        }
    }
    
    public boolean eliminarBeneficios (Beneficios bnficio){
        if(this.listaBeneficios.contains(bnficio)){ //bnficio es el objeto
            this.listaBeneficios.remove(bnficio);
            return true;
        }
        return false; //el bnficioorador no existe en el ArrayList
    }
    
    public Beneficios buscarIdBeneficio (int idBnFicio){
        for(Beneficios i: listaBeneficios){ //i de id
            if (i.getIdBeneficio() == idBnFicio){ 
                return i;
            }
        }
        return null;
    }
    
      public Beneficios buscarNombreBeneficio (String nombre){ //para buscar por nombre
        for(Beneficios n: listaBeneficios){ //n de nombre
            if (n.getNomBeneficio().equals(nombre)){ 
                return n;
            }
        }
        return null;
    }
      
}
