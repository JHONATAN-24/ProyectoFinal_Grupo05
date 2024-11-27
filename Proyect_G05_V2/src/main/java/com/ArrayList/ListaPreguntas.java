
package ArrayList;

import Clases.Encuesta;
import java.util.List;
import java.util.ArrayList;

public class ListaPreguntas {
    // CREACION DE LA LISTA DE PREGUNTAS:_______________________________________
    List<Encuesta> listaPreguntas = new ArrayList<>();
    
    // CREACION DE METODOS CONCRETOS:___________________________________________
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
