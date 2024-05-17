public class Buch {
    private String titel;
    private String autor;
    private int jahr;
    private boolean ausgeliehen;

    // Konstruktor

    public Buch(String titel, String autor, int jahr) {
        this.titel = titel;
        this.autor = autor;
        this.jahr = jahr;
        this.ausgeliehen = false;
    }
    // Methode zum Ausleihen eines Buches

    public void ausleihen(); {
        if (!ausgeliehen) {
            ausgeliehen = true;
            System.out.println(titel + "wurde ausgeliehen.");
        } else {
            System.out.println(titel + "wurde ausgeliehen.");
    }
}
// Methode zum Überprüfen, ob das Buch ausgeliehen ist

    public boolean istAusgeliehen() {
        return ausgeliehen;
    }

    // Methode zur Darstellung des Buches als String

    public String toString() {
        return "Buch [Titel=" + titel +", Autor=" + autor +", Jahr=" + jahr +", Ausgeliehen=" + ausgeliehen +"]";
    }
}


