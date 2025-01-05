
package T_ArrayList;

import T_Clases.Participante;
import java.util.ArrayList;
import java.util.List;

public class ListaParticipantes {
    // Lista de objetos del tipo Participante:__________________________________
    List <Participante> listaParticipante = new ArrayList<>();
    
    // Metodos:_________________________________________________________________
    public void agregarParticipante(Participante participante){
        listaParticipante.add(participante);
    }
    
    public void quitarParticipante(Participante participante){
        listaParticipante.remove(participante);
    }
    
    public List<Participante> listarParticipantes(){
        return listaParticipante;
    }
    
}
