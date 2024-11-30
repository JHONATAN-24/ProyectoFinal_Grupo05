
package ArrayList;

import CLASES.Encuesta;
import java.util.List;
import java.util.ArrayList;

public class ListaPreguntas {
    List<Encuesta> listaPreguntas = new ArrayList<>();
    
    // METODOS
    public void agregarPregunta(Encuesta p){
        listaPreguntas.add(p);
    }
    
    public void eliminarPregunta(Encuesta p){
        listaPreguntas.remove(p);
    }
    
    public Encuesta obtenerPregunta(int pos){
        return listaPreguntas.get(pos);
    }
    public List<Encuesta> listarPregunta(){
        return this.listaPreguntas;   
    }
    
}
