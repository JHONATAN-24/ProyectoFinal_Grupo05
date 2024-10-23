
package Clases;

public class Persona {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String fechaNacimiento, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
    //Metodos
    public void registrarse(){
        //Definir la funcion que va a tener el metodo registrarse
    }
    
    public String descripcion(){
        return "Persona:" +nombre + " " +apellidos + " " +fechaNacimiento +" " +genero;
    }
}
