/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HashSet;

import com.Clases.Participante;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class SetParticipantes {
    Set<Participante> setParticipantes = new HashSet<>();
    
    public void agregarParticipante (Participante participante){
        setParticipantes.add(participante);
    }
    
    public void quitarParticipante (Participante participante){
        setParticipantes.remove(participante);
    }
    
    public Set<Participante> listarParticipante(){
        return setParticipantes;
    }
    
    public int tamaño(){
        return setParticipantes.size();
    }
    
    
}
