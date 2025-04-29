package E6;

public class E6 {

    public static void main(String[] args) {
        Dispozitiv.descriereGenerala();

        Telefon telefon = new Telefon();
        Smartwatch ceas = new Smartwatch();
        Televizor tv = new Televizor();

        telefon.porneste();
        telefon.actualizeazaSoftware();
        telefon.conecteazaLaWiFi("HomeNetwork");
        System.out.println("Telefon are asistent virtual: " + telefon.areAsistentVirtual());
        System.out.println("Telefon conectat: " + telefon.esteConectat());
        System.out.println(telefon.status());

        System.out.println();

        ceas.porneste();
        ceas.actualizeazaSoftware();
        System.out.println("Smartwatch are asistent virtual: " + ceas.areAsistentVirtual());
        System.out.println(ceas.status());

        System.out.println();

        tv.porneste();
        tv.conecteazaLaWiFi("TV-NET");
        System.out.println("Televizor conectat: " + tv.esteConectat());
        System.out.println(tv.status());
    }

}