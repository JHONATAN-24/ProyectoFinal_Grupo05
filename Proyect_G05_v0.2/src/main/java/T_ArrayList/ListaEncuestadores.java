
package T_ArrayList;

import T_CLASES.Encuestador;
import T_CONEXION_BD.CRUDJavaE;
import T_CONEXION_BD.ConexionSQLServer;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ListaEncuestadores {
    List<Encuestador> T_listaEncuestadores = new ArrayList<>();
    
    public void agregarEncuestador(Encuestador encuestador){
        T_listaEncuestadores.add(encuestador);
    }
    
    public void quitarEncuestador(Encuestador encuestador){
        T_listaEncuestadores.remove(encuestador);
    }
    
    public List<Encuestador> listarEncuestadores(){
        return T_listaEncuestadores;
    }  
    
}
