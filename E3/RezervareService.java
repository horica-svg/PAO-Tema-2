package E3;

import java.time.LocalDate;
import java.util.*;

public class RezervareService {
    private final Map<LocalDate, Set<Integer>> rezervari = new HashMap<>();

    public void rezervaLoc(String data, int loc) throws RezervareExcep {
        LocalDate dataParsed = LocalDate.parse(data);

        if (dataParsed.isBefore(LocalDate.now())) {
            throw new DateInvalideExcep("Data deja a trecut.");
        }

        if (loc < 1 || loc > 100) {
            throw new LocIndisponibilExcep("Locul nu este disponibil (numar invalid).");
        }

        Set<Integer> locuriRezervate = rezervari.getOrDefault(dataParsed, new HashSet<>());
        if (locuriRezervate.contains(loc)) {
            throw new LocIndisponibilExcep("Locul este deja rezervat pentru data selectata.");
        }

        locuriRezervate.add(loc);
        rezervari.put(dataParsed, locuriRezervate);

        System.out.println("Rezervare reusita pentru data: " + data + ", loc: " + loc);
    }
}