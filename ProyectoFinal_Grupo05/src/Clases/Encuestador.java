
package Clases;

import java.util.Objects;

public class Encuestador extends Persona {
    // ATRIBUTOS :______________________________________________________________
    private String codigo;

    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Encuestador() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Encuestador(String codigo, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(nombre, apellidos, fechaNacimiento, genero);
        this.codigo = codigo;
    }
    
    // GETTERS :________________________________________________________________
    public String getCodigo() {
        return codigo;
    }
    
    // SETTERS :________________________________________________________________
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }  

    @Override
    public String toString() {
        return "Encuestador{" + "codigo=" + codigo + '}';
    }
    
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String descripcion() {
        return super.descripcion()+  ", Encuestador:{"+"codigo=" + codigo +"}";
    }
    
    // METODOS :________________________________________________________________
    public void crearEncuesta(){
        
    }
    
    public void editarEncuesta(){
        
    }
    
    public void eliminarEncuesta(){
        
    }
    
    // Verifica si dos participantes son iguales comparando sus emails.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Encuestador other = (Encuestador) obj;
        return Objects.equals(codigo, other.codigo);
    }
    
    // Genera un código hash basado en el email para usar en estructuras de datos.
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
 
}
