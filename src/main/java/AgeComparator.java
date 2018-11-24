import java.util.Comparator;

public class AgeComparator implements Comparator<Games> {
    @Override
    public int compare(Games g1, Games g2) {
        if (g1.getAgeLevel() > g2.getAgeLevel())
            return 1;
        else if (g1.getAgeLevel() == g2.getAgeLevel())
            return 0;
        else
            return -1;
    }
}
