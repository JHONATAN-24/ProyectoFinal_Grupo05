
package ArrayList;

import Clases.Encuestador;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestadores {
    List<Encuestador> listaEncuestador = new ArrayList<>();
    
    public void agregar(Encuestador e){
        listaEncuestador.add(e);
    }
    
    public void quitar(Encuestador e){
        listaEncuestador.remove(e);
    }
    
    public List<Encuestador> listar(){
        return listaEncuestador;
    }  
}
