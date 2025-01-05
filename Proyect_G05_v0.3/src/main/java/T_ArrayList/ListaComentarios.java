
package T_ArrayList;

import T_Clases.Comentario;
import java.util.ArrayList;
import java.util.List;

public class ListaComentarios {
    List<Comentario> T_listaComentarios = new ArrayList<>();
    
    public void agregarComentario(Comentario comentario){
        T_listaComentarios.add(comentario);
    }
    
    public void eliminarComentario(Comentario comentario){
        T_listaComentarios.remove(comentario);
    }
    
    public List<Comentario> listarComentarios(){
        return T_listaComentarios;
    }  
}
