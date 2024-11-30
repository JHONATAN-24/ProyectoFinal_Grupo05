/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;


import CLASES.Encuestador;
import java.util.HashSet;
import java.util.Set;

public class HashEncuestador {
    Set<Encuestador> pt = new HashSet<>();
    
    public void agregarEncuestador(Encuestador enc1){
        pt.add(enc1);
    }
    
    public void quitarEncuestador(Encuestador enc1){
        pt.remove(enc1);
    }
    
    public Set<Encuestador> listarEncuestador(){
        return pt;
    }
    
    public int tamaño(){
        return pt.size();
    }
    
}


