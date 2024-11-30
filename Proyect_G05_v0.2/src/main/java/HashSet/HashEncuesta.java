package HashSet;


import CLASES.Encuesta;
import java.util.HashSet;
import java.util.Set;


public class HashEncuesta {
    Set<Encuesta> enc = new HashSet<>();
    
    public void agregarEncuesta(Encuesta enc1){
        enc.add(enc1);
    }
    
    public void quitarEncuesta(Encuesta enc1){
        enc.remove(enc1);
    }
    
    public Set<Encuesta> listarEncuesta(){
        return enc;
    }
    
    public int tamaño(){
        return enc.size();
    }
    
}
