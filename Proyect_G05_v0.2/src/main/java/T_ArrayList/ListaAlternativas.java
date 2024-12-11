/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_ArrayList;

import T_Clases.Alternativa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ListaAlternativas {
    List<Alternativa> listaPreguntas = new ArrayList<>();
    
    // METODOS
    public void agregarAlternativa(Alternativa p){
        listaPreguntas.add(p);
    }
    
    public void eliminarAlternativa(Alternativa p){
        listaPreguntas.remove(p);
    }
    
    public Alternativa obtenerAlternativa(int pos){
        return listaPreguntas.get(pos);
    }
    public List<Alternativa> listarAlternativa(){
        return this.listaPreguntas;   
    }
    
}
