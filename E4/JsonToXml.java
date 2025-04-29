package E4;

public class JsonToXml {
    private final JsonGen generator;
    private final Sistem sistem;

    public JsonToXml(JsonGen generator, Sistem sistem) {
        this.generator = generator;
        this.sistem = sistem;
    }

    public void trimiteDate() {
        String json = generator.genereazaJSON();

        String core = json.replaceAll("[{}\"]", "");

        String[] perechi = core.split(",");

        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<root>");
        for (String pereche : perechi) {
            String[] parts = pereche.split(":");
            if (parts.length == 2) {
                String cheie = parts[0].trim();
                String valoare = parts[1].trim();
                xmlBuilder.append("<").append(cheie).append(">")
                        .append(valoare)
                        .append("</").append(cheie).append(">");
            }
        }
        xmlBuilder.append("</root>");

        sistem.afiseazaXML(xmlBuilder.toString());
    }

}