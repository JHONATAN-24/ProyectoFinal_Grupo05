
package Clases;

public class Participante extends Persona {
    // ATRIBUTOS :______________________________________________________________
    private String direccion;
    private int numerocelular;
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Participante() {
    }
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Participante(String direccion, int numerocelular, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(nombre, apellidos, fechaNacimiento, genero);
        this.direccion = direccion;
        this.numerocelular = numerocelular;
    }

    // GETTERS :________________________________________________________________
    public String getDireccion() {
        return direccion;
    }
    
    public int getNumerocelular() {
        return numerocelular;
    }
    
    // SETTERS :________________________________________________________________
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumerocelular(int numerocelular) {
        this.numerocelular = numerocelular;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Participante{" + "direccion=" + direccion + ", numerocelular=" + numerocelular + '}';
    }
    
    // METODOS :________________________________________________________________

    @Override
    public String descripcion() {
        return super.descripcion() +"Participante: {"+direccion + " " +numerocelular +"}" ;
    }
    
    public void ResponderEncuesta(){
        
    }
    
    public void verResultados(){
        
    }
    
    
    
}
