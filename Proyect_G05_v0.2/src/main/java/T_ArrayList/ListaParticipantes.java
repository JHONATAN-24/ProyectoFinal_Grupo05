
package T_ArrayList;

import T_CLASES.Participante;
import java.util.ArrayList;
import java.util.List;

public class ListaParticipantes {
    List <Participante> listaParticipante = new ArrayList<>();
    
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
