package E2;

public final class TransferBancar extends MetodaPlata {
    private final String iban;

    public TransferBancar(String iban) {
        this.iban = iban;
    }

    public void valideaza() {
        if (iban != null && iban.startsWith("RO") && iban.length() == 24) {
            System.out.println("IBAN valid.");
        } else {
            System.out.println("IBAN invalid.");
        }
    }
}