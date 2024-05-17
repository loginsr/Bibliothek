import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Buch>buecher;
    private ArrayList<Mitglied>mitglieder;

    // Konstruktor

    public Bibliothek() {
        this.buecher = new ArrayList<>();
        this.mitglieder = new ArrayList<>();
}

// Methode zum Hinzufügen eines Buches

public void buchHinzufuegen(Buch buch) {
        buecher.add(buch);
        System.out.println(buch.getTitel() +" wurde zur Bibliothek hinzugefügt.");
}

    // Methode zum Hinzufügen eines Mitglieds

public void mitgliedHinzufuegen(Mitglied mitglied) {
        mitglieder.add(mitglied);
        System.out.println(mitglied.getName() +" wurde zur Bibliothek hinzugefügt.");
}

    // Methode zur Darstellung der Bibliothek als String

public String to String() {
        return "Bibliothek [Buecher=" + buecher +", Mitglieder=" + mitglieder +"]";
    }
}