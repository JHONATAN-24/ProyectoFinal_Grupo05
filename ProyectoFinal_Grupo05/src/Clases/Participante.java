
package Clases;

public class Participante extends Persona {
    private String direccion;
    private int numerocelular;

    public Participante() {
    }

    public Participante(String direccion, int numerocelular, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(nombre, apellidos, fechaNacimiento, genero);
        this.direccion = direccion;
        this.numerocelular = numerocelular;
    }

    //Getters and Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumerocelular() {
        return numerocelular;
    }

    public void setNumerocelular(int numerocelular) {
        this.numerocelular = numerocelular;
    }

    @Override
    public String toString() {
        return "Participante{" + "direccion=" + direccion + ", numerocelular=" + numerocelular + '}';
    }
    
    //Metodos

    @Override
    public String descripcion() {
        return super.descripcion() +"Participante: {"+direccion + " " +numerocelular +"}" ;
    }
    
    public void ResponderEncuesta(){
        //Definir la funcionalidad del metodo
    }
    
    public void verResultados(){
        //Definir la funcionalidad del metodo
    }
    
    
    
}
