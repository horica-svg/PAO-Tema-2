package E8;
import java.util.*;

public class E8 {

    public static void main(String[] args) {
        List<ContUtilizator> conturi = List.of(
            new ContUtilizator("Caesar", NivelAcces.ADMIN),
            new ContUtilizator("Augustus", NivelAcces.EDITOR),
            new ContUtilizator("Tiber Septim", NivelAcces.USER),
            new ContUtilizator("Tulius", NivelAcces.GUEST)
        );

        System.out.println("Conturi cu acces mai mare decat USER:");
        for (ContUtilizator c : conturi) {
            if (c.getAcces().compareTo(NivelAcces.USER) < 0) {
                System.out.println(c);
            }
        }
    }

}