
package ArrayList;

import com.Clases.Participante;
import java.util.ArrayList;
import java.util.List;

public class ListaParticipantes {
    // CREACION DE LA LISTA DE PARTICIPANTES:___________________________________
    List <Participante> listaParticipantes = new ArrayList<>();
    
    // CREACION DE METODOS CONCRETOS:___________________________________________
    public void agregarParticipante(Participante participante){
        listaParticipantes.add(participante);
    }
    
    public void quitarParticipante(Participante participante){
        listaParticipantes.remove(participante);
    }
    
    public List<Participante> listarParticipantes(){
        return listaParticipantes;
    }
}
