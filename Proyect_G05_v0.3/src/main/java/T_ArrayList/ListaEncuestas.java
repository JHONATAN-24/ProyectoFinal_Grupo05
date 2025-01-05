
package T_ArrayList;

import T_Clases.Encuesta;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestas {
    // LISTA DE OBJETOS DE TIPO ENCUESTA:_______________________________________
    List<Encuesta> listaEncuestas = new ArrayList<>();
    
    // METODOS:_________________________________________________________________
    public void agregarEncuesta(Encuesta e){
        listaEncuestas.add(e);
    }
    
    public void eliminarEncuesta(Encuesta e){
        listaEncuestas.remove(e);
    }
    
    public Encuesta obtenerEncuesta(int pos){
        return listaEncuestas.get(pos);
    }
    
    public List<Encuesta> listarEncuestas(){
        return this.listaEncuestas;   
    }
    
}
