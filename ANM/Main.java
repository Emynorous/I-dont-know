import models.*;

public class Main {
    public static void main(String[] args) {
        Evidence evidence = new Evidence();

        Zamestnanec z1 = new Zamestnanec(1, "Jan Novák", "Technik");
        Zamestnanec z2 = new Zamestnanec(2, "Eva Svobodová", "Projektová manažerka");

        evidence.pridejZamestnance(z1);
        evidence.pridejZamestnance(z2);

        Zakazka zak1 = new Zakazka(101, "Instalace serveru");
        Zakazka zak2 = new Zakazka(102, "Údržba sítě");

        evidence.pridejZakazku(zak1);
        evidence.pridejZakazku(zak2);

        zak1.dokoncit();

        System.out.println("=== Seznam zaměstnanců ===");
        evidence.vypisZamestnance();

        System.out.println("\n=== Seznam zakázek ===");
        evidence.vypisZakazky();
    }
}
