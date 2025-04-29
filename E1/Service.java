package E1;

public class Service {
    public void afiseazaPermisiuni(Utilizator utilizator) {
        System.out.println("Permisiuni pentru: " + utilizator.getNume() + "/n");
        if (utilizator instanceof PoateVizualiza) {
            System.out.println("- Poate vizualiza/n");
        }
        if (utilizator instanceof PoateEdita) {
            System.out.println("- Poate edita/n");
        }
        if (utilizator instanceof PoateSterge) {
            System.out.println("- Poate sterge/n");
        }
        System.out.println();
    }
}
