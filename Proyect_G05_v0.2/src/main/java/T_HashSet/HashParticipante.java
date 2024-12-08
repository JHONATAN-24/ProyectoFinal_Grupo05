/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_HashSet;


import T_Clases.Participante;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class HashParticipante {
    Set<Participante> nuevoP = new HashSet<>();
    
    public void agregar (Participante p){
        nuevoP.add(p);
    }
    
    public void quitar (Participante p){
        nuevoP.remove(p);
    }
    
    public Set<Participante> listar(){
        return nuevoP;
    }
    
    public int tamaño(){
        return nuevoP.size();
    }
    
    
}
