
package T_Pruebas;

import T_HashSet.HashParticipante;
import T_ArrayList.ListaEncuestadores;
import T_ArrayList.ListaParticipantes;
import T_Clases.Encuestador;
import T_Clases.Participante;


public class ArraylistvsHashSet {

    public static void main(String[] args) {
        
        Encuestador e = new Encuestador("U1598784236", "Moises", "Sebastian", "2006-01-14", "Masculino", "holamundo123");
        
        ListaEncuestadores lp = new ListaEncuestadores();
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            System.out.println("LOS ARRAYLIST: ");
            System.out.println(lp.listarEncuestadores());
            
        
        Participante p = new Participante("moises@gmail.com",15, "Moises", "Avila", "14-01-2006", "Masculino", "1234");
        Participante pa = new Participante("Jhonatan@gmail.com",15, "Jhonatan", "Quispe", "18-04-2006", "Masculino", "1546498156");
        HashParticipante hp = new HashParticipante();
            hp.agregar(p);
            hp.agregar(p);
            hp.agregar(p);
            hp.agregar(p);
            hp.agregar(pa);
            hp.agregar(pa);
            hp.agregar(pa);
            hp.agregar(pa);
            
            System.out.println("LOS HASHSET SON: ");
            System.out.println(hp.listar());
            System.out.println(hp.tamaño());
    }
    
}
