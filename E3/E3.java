package E3;

public class E3 {

    public static void main(String[] args) {
        RezervareService service = new RezervareService();
        try {
            service.rezervaLoc("2025-04-23", 50);
            //service.rezervaLoc("2023-01-01", 1211); // DateInvalideException
            service.rezervaLoc("2025-04-23", 50); // LocIndisponibilException
        } catch (DateInvalideExcep | LocIndisponibilExcep e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (RezervareExcep e) {
            System.out.println("Alta eroare de rezervare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            System.out.println("Finalizare proces rezervare.");
        }
    }

}