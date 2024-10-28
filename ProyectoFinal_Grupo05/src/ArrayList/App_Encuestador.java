/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

import Clases.Encuestador;


/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class App_Encuestador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //agregar a los usarios
        Encuestador nuevoEncuestador = new Encuestador("U23246360","Pablo","Gonzales","16/04/1998","Masculino");
        Encuestador nuevoEncuestador1 = new Encuestador("U21587415","Pedro","Martinez","24/11/1999","Masculino");
        
        EncuestadorList nuevoList = new EncuestadorList();
            //Agregamos usuarios a la lista
            nuevoList.agregar(nuevoEncuestador);
            nuevoList.agregar(nuevoEncuestador1);
            
            //Mostramos a los usuarios
            nuevoList.listar(nuevoEncuestador);
            nuevoList.listar(nuevoEncuestador1);
            
            //Eliminamos
            nuevoList.quitar(nuevoEncuestador);

            //Listamos
            nuevoList.listar(nuevoEncuestador);       
    }
    
}
