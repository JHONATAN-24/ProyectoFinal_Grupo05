
package ArrayList;

import com.Clases.Encuestador;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestadores {
    // CREACION DE LA LISTA DE ENCUESTADORES:___________________________________
    List<Encuestador> listaEncuestadores = new ArrayList<>();
    
    // CREACION DE METODOS CONCRETOS:___________________________________________
    public void agregarEncuestador(Encuestador encuestador){
        listaEncuestadores.add(encuestador);
    }
    
    public void quitarEncuestador(Encuestador encuestador){
        listaEncuestadores.remove(encuestador);
    }
    
    public List<Encuestador> listarEncuestador(){
        return listaEncuestadores;
    }  
}
