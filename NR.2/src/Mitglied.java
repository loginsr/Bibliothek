import java.util.ArrayList;

public class Mitglied {
    private String name;
    private int mitgliednummer;
    private ArrayList<Buch> ausgelieheneBücher;

    // Konstruktor

    public Mitglied(String name, int mitgliednummer){
        this.name = name;
        this.mitgliednummer = mitgliednummer;
        this.ausgelieheneBücher = new ArrayList<>();
    }

    // Methode zum Ausleihen eines Buches

    public void buchZurueckgeben(Buch buch) {
        if (ausgelieheneBücher.contains(buch)) {
            buch.zurueckgeben();
            ausgelieheneBücher.remove(buch);
        } else {
            System.out.println(name + "hat" + buch.getTitel() + " nicht ausgeliehen.");
        }
    }

    // Methode zur Darstellung des Mitglieds als String

    public String toString() {
        return "Mitglied [Name=" + name +", Mitgliedsnummer=" + mitgliednummer +"]";
    }
}
