
package Clases;

public class Participante extends Persona {
    // ATRIBUTOS :______________________________________________________________
    private String email;
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Participante() {
    }
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Participante(String email, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(nombre, apellidos, fechaNacimiento, genero);
        this.email = email;

    }

    // GETTERS :________________________________________________________________
    public String getEmail() {
        return email;
    }
    // SETTERS :________________________________________________________________
    public void setEmail(String email) {
        this.email = email;
    }
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Participante{" + "email=" + email +'}';
    }
    
    // METODOS :________________________________________________________________

    @Override
    public String descripcion() {
        return super.descripcion() +"Participante: {"+email + "}" ;
    }
    
    public void ResponderEncuesta(){
        
    }
    
    public void verResultados(){
        
    }
    
    
    
}
