/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_HashSet;


import T_CLASES.Pregunta;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class HashPregunta {
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
