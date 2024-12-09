
package T_Clases;

import T_ArrayList.ListaPreguntas;
import java.util.Objects;

public class Encuesta {
    // ATRIBUTOS :______________________________________________________________
    private String titulo;
    private String descripción;
    private String tipoEncuesta;
    private String fechaCreacion;
    private String fechaCierre;
    private ListaPreguntas nuevaPre;
    private Encuestador encuestador;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Encuesta() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________

    public Encuesta(String titulo, String descripción, String tipoEncuesta, String fechaCreacion, String fechaCierre, ListaPreguntas nuevaPre, Encuestador encuestador) {
        this.titulo = titulo;
        this.descripción = descripción;
        this.tipoEncuesta = tipoEncuesta;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.nuevaPre = nuevaPre;
        this.encuestador = encuestador;
    }
    

    // GETTERS :________________________________________________________________
    public String getTitulo() {
        return titulo;
    }

    public String getDescripción() {
        return descripción;
    }

    public String getTipoEncuesta() {
        return tipoEncuesta;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public ListaPreguntas getNuevaPre() {
        return nuevaPre;
    }

    public Encuestador getEncuestador() {
        return encuestador;
    }

    // SETTERS :________________________________________________________________
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setTipoEncuesta(String tipoEncuesta) {
        this.tipoEncuesta = tipoEncuesta;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public void setNuevaPre(ListaPreguntas nuevaPre) {
        this.nuevaPre = nuevaPre;
    }

    public void setEncuestador(Encuestador encuestador) {
        this.encuestador = encuestador;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________

    @Override
    public String toString() {
        return "Encuesta{" + "titulo=" + titulo + ", descripci\u00f3n=" + descripción + ", tipoEncuesta=" + tipoEncuesta + ", fechaCreacion=" + fechaCreacion + ", fechaCierre=" + fechaCierre + ", nuevaPre=" + nuevaPre + ", encuestador=" + encuestador + '}';
    }
    
    // Verifica si dos participantes son iguales comparando sus emails.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Encuesta other = (Encuesta) obj;
        return Objects.equals(titulo, other.titulo);
    }
    
    // Genera un código hash basado en el email para usar en estructuras de datos.
    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
    
}
