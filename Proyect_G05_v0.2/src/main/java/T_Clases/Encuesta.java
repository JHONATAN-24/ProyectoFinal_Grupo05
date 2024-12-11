
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
    private Pregunta pregunta;
    private ListaPreguntas listaPreguntas;
    private Encuestador encuestador;
    private Participante participante;
    private int Id;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Encuesta() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________

    public Encuesta(String titulo, String descripción, String tipoEncuesta, String fechaCreacion, String fechaCierre, 
            Pregunta pregunta, ListaPreguntas listaPreguntas, Encuestador encuestador, Participante participante, int Id) {
        this.titulo = titulo;
        this.descripción = descripción;
        this.tipoEncuesta = tipoEncuesta;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.pregunta = pregunta;
        this.listaPreguntas = listaPreguntas;
        this.encuestador = encuestador;
        this.participante = participante;
        this.Id = Id;
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

    public ListaPreguntas getListaPreguntas() {
        return listaPreguntas;
    }

    public Encuestador getEncuestador() {
        return encuestador;
    }

    public int getId() {
        return Id;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public Participante getParticipante() {
        return participante;
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

    public void setListaPreguntas(ListaPreguntas listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }
    
    public void setEncuestador(Encuestador encuestador) {
        this.encuestador = encuestador;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________

    @Override
    public String toString() {
        return "Encuesta{" + "titulo=" + titulo + ", descripci\u00f3n=" + descripción + ", tipoEncuesta=" + tipoEncuesta + ", fechaCreacion=" + fechaCreacion + ", fechaCierre=" + fechaCierre + ", pregunta=" + pregunta + ", listaPreguntas=" + listaPreguntas + ", encuestador=" + encuestador + ", participante=" + participante + ", Id=" + Id + '}';
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
