
package T_Clases;

import java.util.Objects;

public class Pregunta {
    // ATRIBUTOS :______________________________________________________________
    private String enunciado;
    private String tipoPregunta;
    
    // CONSTRUCTOR SIN PARAMETROS :_____________________________________________
    
    public Pregunta() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Pregunta(String enunciado, String tipoPregunta) {
        this.enunciado = enunciado;
        this.tipoPregunta = tipoPregunta;
    }
    
    // GETTERS :________________________________________________________________
    public String getEnunciado() {
        return enunciado;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }
    
    // SETTERS :________________________________________________________________
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", tipoPregunta=" + tipoPregunta + '}';
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
