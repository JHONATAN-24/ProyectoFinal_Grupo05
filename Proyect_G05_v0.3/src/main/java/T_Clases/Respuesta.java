
package T_Clases;

public class Respuesta {
    // ATRIBUTOS :______________________________________________________________
    private String textoRespuesta;
    private Participante participante;

    // CONSTRUCTOR SIN PARAMETROS :_____________________________________________
    public Respuesta() {
    }

    // CONSTRUCTOR CON PARAMETROS :_____________________________________________

    public Respuesta(String textoRespuesta, Participante participante) {
        this.textoRespuesta = textoRespuesta;
        this.participante = participante;
    }
    

    // GETTERS :________________________________________________________________
    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public Participante getParticipante() {
        return participante;
    }

    // SETTERS :______________________________________________
    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
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
