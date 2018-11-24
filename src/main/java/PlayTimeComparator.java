import java.util.Comparator;

public class PlayTimeComparator implements Comparator<Games> {
    @Override
    public int compare(Games g1, Games g2) {
        if (g1.getPlayTime() > g2.getPlayTime())
            return -1;
        else if (g1.getPlayTime() == g2.getPlayTime())
            return 0;
        else
            return 1;
    }
}
