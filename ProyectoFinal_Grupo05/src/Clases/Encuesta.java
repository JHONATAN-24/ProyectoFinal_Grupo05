
package Clases;

import ArrayList.ListaPreguntas;

public class Encuesta {
    // ATRIBUTOS :______________________________________________________________
    private String titulo;
    private String descripción;
    private String tipoEncuesta;
    private String fechaCreacion;
    private String fechaCierre;
    private ListaPreguntas nuevaPre;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Encuesta() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Encuesta(String titulo, String descripción, String tipoEncuesta, 
                    String fechaCreacion, String fechaCierre) {
    
        this.titulo = titulo;
        this.descripción = descripción;
        this.tipoEncuesta = tipoEncuesta;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
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

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Pregunta{" + "titulo=" + titulo + ", descripci\u00f3n=" + descripción + ", tipoEncuesta=" + tipoEncuesta + ", fechaCreacion=" + fechaCreacion + ", fechaCierre=" + fechaCierre + '}';
    }
    
}
