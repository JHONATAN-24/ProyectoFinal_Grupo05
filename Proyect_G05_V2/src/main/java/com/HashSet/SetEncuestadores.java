
package com.HashSet;

import com.Clases.Encuestador;
import java.util.HashSet;
import java.util.Set;

public class SetEncuestadores {
    Set<Encuestador> setEncuestadores = new HashSet<>();
    
    public void agregarEncuestador(Encuestador encuestador){
        setEncuestadores.add(encuestador);
    }
    
    public void quitarEncuestador(Encuestador encuestador){
        setEncuestadores.remove(encuestador);
    }
    
    public Set<Encuestador> listarEncuestador(){
        return setEncuestadores;
    }
    
    public int tamaño(){
        return setEncuestadores.size();
    }
    
}


