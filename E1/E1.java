package E1;

public class E1 {

    public static void main(String[] args) {
        Utilizator admin = new Administrator("Constantinopol");
        Utilizator editor = new Editor("Caligula");
        Utilizator vizitator = new Vizitator("Nero");

        Service service = new Service();
        service.afiseazaPermisiuni(admin);
        service.afiseazaPermisiuni(editor);
        service.afiseazaPermisiuni(vizitator);
    }

}