//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();

        // Erstellen von Büchern

        Buch buch1 = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", 1954);
        Buch buch2 = new Buch("Harry Potter", "J.K.Rowling", 1997);

        // Erstellen von Mitgliedern

        Mitglied mitglied1 = new Mitglied("Alice", 1);
        Mitglied mitglied2 = new Mitglied("Bob", 2);

        // Hinzufügen von Büchern zur Bibliothek

        bibliothek.buchHinzufuegen(buch1);
        bibliothek.buchHinzufuegen(buch2);

        // Hinzufügen von Mitgliedern zur Bibliothek

        bibliothek.mitgliedHinzufuegen(mitglied1);
        bibliothek.mitgliedHinzufuegen(mitglied2);
    }
}