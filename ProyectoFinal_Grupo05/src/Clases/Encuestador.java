
package Clases;

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
}
