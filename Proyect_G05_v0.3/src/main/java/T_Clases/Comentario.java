/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Clases;

import java.util.Objects;

public class Comentario {    
    // ATRIBUTOS :______________________________________________________________
    private int codigo;
    private String comentario;
    private String fechaDeEnvio;

    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Comentario() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Comentario(int codigo, String comentario, String fechaDeEnvio) {
        this.codigo = codigo;
        this.comentario = comentario;
        this.fechaDeEnvio = fechaDeEnvio;
    }

    // GETTERS :________________________________________________________________
    public int getCodigo() {
        return codigo;
    }

    public String getComentario() {
        return comentario;
    }

    public String getFechaDeEnvio() {
        return fechaDeEnvio;
    }

    // SETTERS :________________________________________________________________
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFechaDeEnvio(String fechaDeEnvio) {
        this.fechaDeEnvio = fechaDeEnvio;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "ComentarioEnc{" + "codigo=" + codigo + ", comentario=" + comentario + ", fechaDeEnvio=" + fechaDeEnvio + '}';
    }
    
    // COMPARACIÓN DE ENCUESTAS SEGUN SU TITULO:________________________________
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Comentario other = (Comentario) obj;
        return Objects.equals(comentario, other.comentario);
    }
    
    // GENERAR CODIGO HASH PARA UN OBJETO:______________________________________
    @Override
    public int hashCode() {
        return Objects.hash(comentario);
    }
    
}
