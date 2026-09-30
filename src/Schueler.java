public class Schueler extends Person {

    private double schulnote;

    public Schueler(String name, int geburtsjahr, double schulnote) {
        super(name, geburtsjahr);
        this.schulnote = schulnote;
    }

    public Schueler(String name, int geburtsjahr) {
        super(name, geburtsjahr);
    }

    public double getSchulnote() {
        return schulnote;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + ", Geburtsjahr: " + getGeburtsjahr()
                + ", Schulnote: " + schulnote;
    }
}