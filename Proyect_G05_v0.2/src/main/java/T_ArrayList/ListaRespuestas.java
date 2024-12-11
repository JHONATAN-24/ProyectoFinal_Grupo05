
package T_ArrayList;


import T_Clases.Alternativa;
import T_Clases.Encuesta;
import T_Clases.Pregunta;
import T_Clases.Respuesta;
import java.util.ArrayList;
import java.util.List;

public class ListaRespuestas {
    List<Respuesta> listaRespuestas= new ArrayList<>();

    // METODOS
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