
package ArrayList;

import Clases.Pregunta;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestas {
    List<Pregunta> listaEncuestas = new ArrayList<>();
    
    // METODOS
    public void agregarEncuesta(Pregunta p){
        listaEncuestas.add(p);
    }
    
    public void eliminarEncuesta(Pregunta p){
        listaEncuestas.remove(p);
    }
    
    public Pregunta obtener(int pos){
        return listaEncuestas.get(pos);
    }
    public List<Pregunta> listar(){
        return this.listaEncuestas;   
    }
}
