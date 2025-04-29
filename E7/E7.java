package E7;
import java.util.*;

public class E7 {

    public static void main(String[] args) {
        Set<Produs> produse = new HashSet<>();
        produse.add(new Produs(1, "Laptop", 3000));
        produse.add(new Produs(2, "Mouse", 150));
        produse.add(new Produs(1, "Laptop Duplicate", 3100));

        System.out.println("Produse in HashSet:");
        produse.forEach(System.out::println);

        Map<Produs, Integer> stocuri = new HashMap<>();
        for (Produs p : produse) {
            stocuri.put(p, 10);
        }

        System.out.println("\nStocuri din HashMap:");
        stocuri.forEach((key, value) -> System.out.println(key + " -> stoc: " + value));
    }

}