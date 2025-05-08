package models;

import java.util.ArrayList;

public class Evidence {
    private ArrayList<Zamestnanec> zamestnanci = new ArrayList<>();
    private ArrayList<Zakazka> zakazky = new ArrayList<>();

    public void pridejZamestnance(Zamestnanec z) {
        zamestnanci.add(z);
    }

    public void pridejZakazku(Zakazka z) {
        zakazky.add(z);
    }

    public void vypisZamestnance() {
        for (Zamestnanec z : zamestnanci) {
            System.out.println(z);
        }
    }

    public void vypisZakazky() {
        for (Zakazka z : zakazky) {
            System.out.println(z);
        }
    }
}
