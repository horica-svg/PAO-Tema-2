package E5;
import java.util.*;

public class E5 {

    public static void main(String[] args) {
        List<OrganismViu> lista = new ArrayList<>();
        lista.add(new Urs());
        lista.add(new Delfin());

        for (OrganismViu org : lista) {
            org.respira();
            org.seHraneste();
            if (org instanceof Mamifer) {
                System.out.println("Are par: " + ((Mamifer) org).arePar());
            }
            System.out.println();
        }
    }

}