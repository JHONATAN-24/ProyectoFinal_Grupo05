
package Clases;

public class Alternativa {
    private String textoOpcion;
    private int puntaje;

    public Alternativa() {
    }

    public Alternativa(String textoOpcion, int puntaje) {
        this.textoOpcion = textoOpcion;
        this.puntaje = puntaje;
    }

    public String getTextoOpcion() {
        return textoOpcion;
    }

    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

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
