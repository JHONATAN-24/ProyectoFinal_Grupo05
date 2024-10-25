/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.Encuestador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class EncuestadorList {
    List<Encuestador> listaEncuestador = new ArrayList<>();
    
    public void agregar(Encuestador e){
        listaEncuestador.add(e);
    }
    
    public void quitar(Encuestador e){
        listaEncuestador.remove(e);
    }
    
    public void listar(Encuestador e){
        if (listaEncuestador.contains(e)) {
        System.out.println(e);
        } else {
        System.out.println("El encuestador no está en la lista.");
        }
    }

}
