
package ArrayList;

import Clases.Pregunta;
import java.util.List;
import java.util.ArrayList;

public class ListaPreguntas {
    List<Pregunta> listaPreguntas = new ArrayList<>();
    
    // METODOS
    public void agregarPregunta(Pregunta p){
        listaPreguntas.add(p);
    }
    
    public void eliminarPregunta(Pregunta p){
        listaPreguntas.remove(p);
    }
    
    public Pregunta obtener(int pos){
        return listaPreguntas.get(pos);
    }
    public List<Pregunta> listar(){
        return this.listaPreguntas;   
    }
    
}
