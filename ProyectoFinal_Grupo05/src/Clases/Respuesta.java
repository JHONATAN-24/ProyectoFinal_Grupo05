
package Clases;

public class Respuesta {
    private String textoRespuesta;

    public Respuesta() {
    }

    public Respuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "textoRespuesta=" + textoRespuesta + '}';
    }
    public void registrarRespuesta(){
//Definir la funcion del metodo
    }
}
