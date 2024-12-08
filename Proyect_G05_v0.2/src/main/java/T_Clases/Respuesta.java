
package T_Clases;

public class Respuesta {
    // ATRIBUTOS :______________________________________________________________
    private String textoRespuesta;

    // CONSTRUCTOR SIN PARAMETROS :_____________________________________________
    public Respuesta() {
    }

    // CONSTRUCTOR CON PARAMETROS :_____________________________________________
    public Respuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    // GETTERS :________________________________________________________________
    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    // SETTERS :______________________________________________
    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Respuesta{" + "textoRespuesta=" + textoRespuesta + '}';
    }

    // METODOS :________________________________________________________________
    public void registrarRespuesta(){
    }
}
