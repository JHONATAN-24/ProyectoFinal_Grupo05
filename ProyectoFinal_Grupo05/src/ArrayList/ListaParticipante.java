/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.Participante;
import java.util.ArrayList;
import java.util.List;

public class ListaParticipante {
    List <Participante> listaParticipante = new ArrayList<>();
    
    public void agregar(Participante p){
        listaParticipante.add(p);
    }
    public void quitar(Participante p){
        listaParticipante.remove(p);
    }
    public List<Participante> listarParticipante(){
        return listaParticipante;
    }
}
