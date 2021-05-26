import java.util.ArrayList;

public class Student {
    private ArrayList<Double> wiskundeCijfers;
    private ArrayList<Double> natuurkundeCijfers;
    private ArrayList<Double> OPTCijfers;
    private String naam;

    public Student(String naam, ArrayList<Double> wiskundeCijfers, ArrayList<Double> OPTCijfers, ArrayList<Double> natuurkundeCijfers) {
        this.natuurkundeCijfers = natuurkundeCijfers;
        this.wiskundeCijfers = wiskundeCijfers;
        this.OPTCijfers = OPTCijfers;
        this.naam = naam;
    }

    public boolean cijferCheck(ArrayList<Double> cijfers, Integer aantalToetsen) {
        double gemiddelde = 0.0;
        for (Double c : cijfers) {
            gemiddelde += c;
            if (c < 4.5) {
                return false;
            }
        }
        gemiddelde /= cijfers.size();
        if (gemiddelde < 5.5) {
            return false;
        }
        if (cijfers.size() != aantalToetsen) {
            return false;
        }
        return true;
    }
}
