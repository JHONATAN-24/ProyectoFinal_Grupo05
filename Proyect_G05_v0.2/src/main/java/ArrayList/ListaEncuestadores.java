
package ArrayList;

import CLASES.Encuestador;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestadores {
    List<Encuestador> T_listaEncuestadores = new ArrayList<>();
    
    public void agregarEncuestador(Encuestador encuestador){
        T_listaEncuestadores.add(encuestador);
    }
    
    public void quitarEncuestador(Encuestador encuestador){
        T_listaEncuestadores.remove(encuestador);
    }
    
    public List<Encuestador> listarEncuestadores(){
        return T_listaEncuestadores;
    }  
}
