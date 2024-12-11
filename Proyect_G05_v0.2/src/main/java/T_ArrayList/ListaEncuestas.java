
package T_ArrayList;


import T_Clases.Encuesta;
import T_Clases.Pregunta;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestas {
    private List<Encuesta> listaEncuestas = new ArrayList<>();
    
    // METODOS
    public void agregarEncuesta(Encuesta e){
        listaEncuestas.add(e);
    }
    
    public void eliminarEncuesta(Encuesta e){
        listaEncuestas.remove(e);
    }
    
    public Encuesta obtenerEncuesta(int pos){
        return listaEncuestas.get(pos);
    }
    
    public List<Encuesta> listarEncuestas(){
        return this.listaEncuestas;   
    }
}
