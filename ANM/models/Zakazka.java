package models;

public class Zakazka {
    private int cisloZakazky;
    private String popis;
    private boolean dokonceno;

    public Zakazka(int cisloZakazky, String popis) {
        this.cisloZakazky = cisloZakazky;
        this.popis = popis;
        this.dokonceno = false;
    }

    public void dokoncit() {
        this.dokonceno = true;
    }

    @Override
    public String toString() {
        return "Zakazka [Číslo=" + cisloZakazky + ", Popis=" + popis + ", Dokončeno=" + dokonceno + "]";
    }
}
