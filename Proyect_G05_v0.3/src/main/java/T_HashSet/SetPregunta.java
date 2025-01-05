
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_HashSet;

import T_Clases.Pregunta;
import java.util.HashSet;
import java.util.Set;

public class SetPregunta {
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
