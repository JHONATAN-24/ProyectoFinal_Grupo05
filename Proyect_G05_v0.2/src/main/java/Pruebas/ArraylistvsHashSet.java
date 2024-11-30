
package Pruebas;

import HashSet.HashParticipante;
import ArrayList.ListaEncuestadores;
import ArrayList.ListaParticipantes;
import CLASES.Encuestador;
import CLASES.Participante;


public class ArraylistvsHashSet {

    public static void main(String[] args) {
        Encuestador e = new Encuestador("U23246360", "Moises", "Avila", "14-01-2006", "Masculino");
        
        ListaEncuestadores lp = new ListaEncuestadores();
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            lp.agregarEncuestador(e);
            System.out.println("LOS ARRAYLIST: ");
            System.out.println(lp.listarEncuestadores());
            
        
        Participante p = new Participante("moises@gmail.com", "Moises", "Avila", "14-01-2006", "Masculino");
        Participante pa = new Participante("Jhonatan@gmail.com", "Jhonatan", "Quispe", "18-04-2006", "Masculino");
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
