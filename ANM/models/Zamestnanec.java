package models;

public class Zamestnanec {
    private int id;
    private String jmeno;
    private String pozice;

    public Zamestnanec(int id, String jmeno, String pozice) {
        this.id = id;
        this.jmeno = jmeno;
        this.pozice = pozice;
    }

    public int getId() { return id; }
    public String getJmeno() { return jmeno; }
    public String getPozice() { return pozice; }

    @Override
    public String toString() {
        return "Zamestnanec [ID=" + id + ", Jméno=" + jmeno + ", Pozice=" + pozice + "]";
    }
}
