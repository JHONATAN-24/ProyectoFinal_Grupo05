
package T_ArrayList;

import T_Clases.Respuesta;
import java.util.ArrayList;
import java.util.List;

public class ListaRespuestas {
    // LISTA DE OBJETOS DEL TIPO RESPUESTA:_____________________________________
    List<Respuesta> listaRespuestas = new ArrayList<>();

    // METODOS:_________________________________________________________________
    public void agregarRespuesta(Respuesta r){
        listaRespuestas.add(r);
    }
    
    public void eliminarEncuesta(Respuesta r){
        listaRespuestas.remove(r);
    }

    public List<Respuesta> listar(){
        return this.listaRespuestas;   
    }
 
}