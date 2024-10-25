package ArrayList;



import Clases.Participante;
import Clases.Persona;
import java.awt.List;
import java.util.ArrayList;

public class ParticipanteList {
public class Participante extends Persona {
    private String direccion;
    private int numerocelular;

        public Participante(String direccion, int numerocelular) {
            this.direccion = direccion;
            this.numerocelular = numerocelular;
        }

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

}
}