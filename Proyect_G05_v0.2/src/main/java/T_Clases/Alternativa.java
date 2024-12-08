
package T_Clases;

public class Alternativa {
    // ATRIBUTOS :______________________________________________________________
    private String textoOpcion;
    private int puntaje;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Alternativa() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Alternativa(String textoOpcion, int puntaje) {
        this.textoOpcion = textoOpcion;
        this.puntaje = puntaje;
    }

    // GETTERS :________________________________________________________________
    public String getTextoOpcion() {
        return textoOpcion;
    }
    
    public int getPuntaje() {
        return puntaje;
    }

    // SETTERS :________________________________________________________________
    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Alternativa{" + "textoOpcion=" + textoOpcion + ", puntaje=" + puntaje + '}';
    }
    public void seleccionar(){
        }
    public void editarOpcion(){
        }
    public void eleiminarOpcion(){
        }
    }
