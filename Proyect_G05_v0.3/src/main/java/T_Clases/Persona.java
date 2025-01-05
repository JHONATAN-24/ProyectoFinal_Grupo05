
package T_Clases;

public class Persona {
    
    // ATRIBUTOS :______________________________________________________________
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;
    private String password;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Persona() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Persona(String nombre, String apellidos, String fechaNacimiento, String genero, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.password = password;
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

    public String getPassword() {
        return password;
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

    public void setPassword(String password) {
        this.password = password;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", password=" + password + '}';
    }
    
    // METODOS :________________________________________________________________
    public void registrarse(){
        
    }
    
    public String descripcion(){
        return "Persona:" +nombre + " " +apellidos + " " +fechaNacimiento +" " +genero + " " +password;
    }
    
}
