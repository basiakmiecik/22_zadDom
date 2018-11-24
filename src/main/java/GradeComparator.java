import java.util.Comparator;

public class GradeComparator implements Comparator<Games> {
    @Override
    public int compare(Games g1, Games g2) {
        if (g1.getGrade() > g2.getGrade())
            return -1;
        else if (g1.getGrade() == g2.getGrade())
            return 0;
        else
            return 1;
    }
}
