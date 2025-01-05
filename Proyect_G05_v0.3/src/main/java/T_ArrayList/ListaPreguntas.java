
package T_ArrayList;

import T_Clases.Pregunta;
import java.util.List;
import java.util.ArrayList;

public class ListaPreguntas {
    // LISTA DE OBJETOS DEL TIPO PREGUNTA:______________________________________
    List<Pregunta> listaPreguntas = new ArrayList<>();
    
    // METODOS:_________________________________________________________________
    public void agregarPregunta(Pregunta p){
        listaPreguntas.add(p);
    }
    
    public void eliminarPregunta(Pregunta p){
        listaPreguntas.remove(p);
    }
    
    public Pregunta obtenerPregunta(int pos){
        return listaPreguntas.get(pos);
    }
    public List<Pregunta> listarPregunta(){
        return this.listaPreguntas;   
    }
    
     public void setListaPreguntas(List<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }
    
}
