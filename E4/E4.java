package E4;

public class E4 {

    // Adaptorul este folosit pentru a face legătura între un sistem existent și un cod nou,
    // fără a modifica implementarea originală. Practic, acesta funcționează ca un traducător
    // între două clase care nu sunt direct compatibile. Este deosebit de util atunci când
    // lucrăm cu biblioteci externe sau cu cod legacy care nu poate fi modificat,
    // dar care trebuie integrat în aplicația actuală.

    public static void main(String[] args) {
        JsonGen generator = new JsonGen();
        Sistem sistem = new Sistem();
        JsonToXml adaptor = new JsonToXml(generator, sistem);

        adaptor.trimiteDate();
    }
}