package E7;
import java.util.Objects;

public class Produs {
    private final int cod;
    private final String nume;
    private final double pret;

    public Produs(int cod, String nume, double pret) {
        this.cod = cod;
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Produs p)) return false;
        return cod == p.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public String toString() {
        return "Produs{" + "cod=" + cod + ", nume='" + nume + "', pret=" + pret + '}';
    }
}