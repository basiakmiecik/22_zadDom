import java.util.Collections;

public class Sort {
    GamesDatabes gd=new GamesDatabes();
    public void sortType(String type){
        gd.transferGamesBase();
        switch (type){
            case "1":
                GradeComparator gc=new GradeComparator();
                Collections.sort(gd.base(),gc);
                gd.showBase();
                break;
            case "2":
                AgeComparator ac=new AgeComparator();
                Collections.sort(gd.base(),ac);
                gd.showBase();
                break;
            case "3":
                PlayTimeComparator ptc=new PlayTimeComparator() ;
                Collections.sort(gd.base(),ptc);
                gd.showBase();
                break;
                default:
                    System.out.println("Nieprawidłowy wybór wybiersz ponownie");

        }

    }


}
