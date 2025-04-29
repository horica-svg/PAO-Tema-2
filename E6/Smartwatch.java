package E6;

public class Smartwatch implements Smart {
    public void porneste() {
        System.out.println("Smartwatch pornit.");
    }

    public void opreste() {
        System.out.println("Smartwatch oprit.");
    }

    public void actualizeazaSoftware() {
        System.out.println("Smartwatch-ul se actualizeaza...");
    }

    public boolean areAsistentVirtual() {
        return false;
    }
}