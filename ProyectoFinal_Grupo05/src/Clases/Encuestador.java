
package Clases;

public class Encuestador extends Persona {
    private String codigo;

    public Encuestador() {
    }

    public Encuestador(String codigo, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(nombre, apellidos, fechaNacimiento, genero);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Encuestador{" + "codigo=" + codigo + '}';
    }
    
    //Metodos

    @Override
    public String descripcion() {
        return super.descripcion()+  ", Encuestador:{" + codigo +"}";
    }
    
    public void crearEncuesta(){
        //Definir la funcionalidad del metodo
    }
    
    public void editarEncuesta(){
        //Definir la funcionalidad del metodo
    }
    
    public void eliminarEncuesta(){
        //Definir la funcionalidad del metodo
    }
}
