/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import Clases.Pregunta;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class SetPreguntas {
    Set<Pregunta> pre = new HashSet<>();
    
    public void agregarPregunta(Pregunta pre1){
        pre.add(pre1); 
    }
    
    public void eliminarPregunta(Pregunta pre1){
        pre.remove(pre1);
    }
    
    public Set<Pregunta> listarPregunta(){
        return pre;
    }
    
    public int tamaño(){
        return pre.size();
    }
}
