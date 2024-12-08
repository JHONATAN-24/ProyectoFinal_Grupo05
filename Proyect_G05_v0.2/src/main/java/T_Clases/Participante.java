
package T_Clases;

import java.util.Objects;

public class Participante extends Persona {
    // ATRIBUTOS :______________________________________________________________
    private String email;
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Participante() {
    }
    // CONSTRUCTOR CON PARAMETROS:______________________________________________

    public Participante(String email, String nombre, String apellidos, String fechaNacimiento, String genero, String password) {
        super(nombre, apellidos, fechaNacimiento, genero, password);
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

    //SOBREESCRITURA:___________________________________________________________
    @Override
    public String toString() {
        return "Participante{" + "email=" + email + '}';
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

   // Verifica si dos participantes son iguales comparando sus emails.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participante other = (Participante) obj;
        return Objects.equals(email, other.email);
    }
    
    // Genera un código hash basado en el email para usar en estructuras de datos.
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
    
    

}
