
package CLASES;

public class Persona {
    
    // ATRIBUTOS :______________________________________________________________
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Persona() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Persona(String nombre, String apellidos, String fechaNacimiento, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    
    // GETTERS :________________________________________________________________
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getGenero() {
        return genero;
    }
    
    // SETTERS :________________________________________________________________
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
    // METODOS :________________________________________________________________
    public void registrarse(){
        
    }
    
    public String descripcion(){
        return "Persona:" +nombre + " " +apellidos + " " +fechaNacimiento +" " +genero;
    }
}
