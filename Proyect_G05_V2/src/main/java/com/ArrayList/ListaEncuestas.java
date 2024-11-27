
package ArrayList;

import Clases.Encuesta;
import Clases.Pregunta;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestas {
    // CREACION DE LA LISTA DE ENCUESTAS:_______________________________________
    List<Encuesta> listaEncuestas = new ArrayList<>();
    
    // CREACION DE METODOS CONCRETOS:___________________________________________
    public void agregarEncuesta(Encuesta encuesta){
        listaEncuestas.add(encuesta);
    }
    
    public void eliminarEncuesta(Encuesta encuesta){
        listaEncuestas.remove(encuesta);
    }
    
    public Encuesta obtenerEncuesta(int posicion){
        return listaEncuestas.get(posicion);
    }
    
    public List<Encuesta> listarEncuestas(){
        return this.listaEncuestas;   
    }
}
