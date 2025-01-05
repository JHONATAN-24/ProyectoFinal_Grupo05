
package T_ArrayList;

import T_Clases.Alternativa;
import java.util.ArrayList;
import java.util.List;

public class ListaAlternativas {
    // LISTA DE OBJETOS DEL TIPO ALTERNATIVA:___________________________________
    List<Alternativa> listaAlternativas = new ArrayList<>();
    
    // METODOS:_________________________________________________________________
    public void agregarAlternativa(Alternativa alternativa){
        listaAlternativas.add(alternativa);
    }
    
    public void eliminarAlternativa(Alternativa alternativa){
        listaAlternativas.remove(alternativa);
    }
    
    public Alternativa obtenerAlternativa(int posicion){
        return listaAlternativas.get(posicion);
    }
    
    public List<Alternativa> listarAlternativas(){
        return this.listaAlternativas;   
    }
    
}
