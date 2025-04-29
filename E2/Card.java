package E2;

import java.time.LocalDate;

public final class Card extends MetodaPlata {
    private final String numar;
    private final int cvv;
    private final LocalDate expirare;

    public Card(String numar, int cvv, LocalDate expirare) {
        this.numar = numar;
        this.cvv = cvv;
        this.expirare = expirare;
    }

    public void valideaza() {
        if (cvv < 100 || cvv > 999) {
            System.out.println("CVV invalid.");
        } else if (expirare.isBefore(LocalDate.now())) {
            System.out.println("Card expirat.");
        } else {
            System.out.println("Card valid.");
        }
    }
}