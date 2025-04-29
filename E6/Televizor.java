package E6;

public class Televizor implements Conectabil {
    private boolean conectat = false;

    public void porneste() {
        System.out.println("Televizor pornit.");
    }

    public void opreste() {
        System.out.println("Televizor oprit.");
    }

    public void conecteazaLaWiFi(String retea) {
        System.out.println("Televizor conectat la reteaua: " + retea);
        conectat = true;
    }

    public boolean esteConectat() {
        return conectat;
    }
}