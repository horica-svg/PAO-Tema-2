package E2;

import java.time.LocalDate;

public class E2 {

    public static void main(String[] args) {
        MetodaPlata card = new Card("1923192319231923", 744, LocalDate.of(2030, 1, 12));
        MetodaPlata cash = new Cash();
        MetodaPlata transfer = new TransferBancar("RO49ABCD1234567890123456");

        card.valideaza();
        cash.valideaza();
        transfer.valideaza();
    }

}
