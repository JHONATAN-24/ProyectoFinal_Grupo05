
package T_Clases;

public class Alternativa {
    // ATRIBUTOS :______________________________________________________________
    private String textoOpcion;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Alternativa() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Alternativa(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    // GETTERS :________________________________________________________________
    public String getTextoOpcion() {
        return textoOpcion;
    }
    

    // SETTERS :________________________________________________________________
    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    
    @Override
    public String toString(){
        return "Alternativa{" + "textoOpcion=" + textoOpcion + '}';
    }

    public void seleccionar() {
    }
    public void editarOpcion(){
        }
    public void eleiminarOpcion(){
        }
    }
