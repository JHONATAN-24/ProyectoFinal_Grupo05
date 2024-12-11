
package T_Clases;

import T_ArrayList.ListaPreguntas;
import T_ArrayList.ListaRespuestas;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pregunta {
    // ATRIBUTOS :______________________________________________________________
    private int Id;
    private String enunciado;
    private String tipoPregunta;
    private Encuesta encuesta;
    private ListaRespuestas respuestas;
    private Alternativa alternativa;
    private List<Alternativa> alternativas;
    
    // CONSTRUCTOR SIN PARAMETROS :_____________________________________________
    
    public Pregunta() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Pregunta(int Id, String enunciado, String tipoPregunta, Encuesta encuesta, ListaRespuestas respuestas, Alternativa alternativa) {
        this.Id = Id;
        this.enunciado = enunciado;
        this.tipoPregunta = tipoPregunta;
        this.encuesta = encuesta;
        this.respuestas = respuestas;
        this.alternativa = alternativa;
    }

    // GETTERS :________________________________________________________________
    public String getEnunciado() {
        return enunciado;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public int getId() {
        return Id;
    }

    public ListaRespuestas getRespuestas() {
        return respuestas;
    }

    public Alternativa getAlternativa() {
        return alternativa;
    } 
    
    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    
    // SETTERS :________________________________________________________________
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setRespuestas(ListaRespuestas respuestas) {
        this.respuestas = respuestas;
    }

    public void setAlternativa(Alternativa alternativa) {
        this.alternativa = alternativa;
    } 
    
    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________

    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", tipoPregunta=" + tipoPregunta + ", encuesta=" + encuesta + '}';
    }
    
    
    // Verifica si dos Preguntas son iguales comparando sus emails.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pregunta other = (Pregunta) obj;
        return Objects.equals(enunciado, other.enunciado);
    }
    
    // Genera un código hash basado en el email para usar en estructuras de datos.
    @Override
    public int hashCode() {
        return Objects.hash(enunciado);
    }
}
