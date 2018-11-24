import java.sql.SQLException;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    public void startBoard(){
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);
        GamesDatabes gd= new GamesDatabes();
        gd.transferGamesBase();
        String option;
        do {
            System.out.println("Wybierz odpowiednią opcję (jeżeli koniec wpisz 'end'): " +
                    "\na: Wyświetl wszystkie gry" +
                    "\nb: Wyświetl powyżej podanej oceny " +
                    "\nc: Wyświetl gry według oceny");
            option = scanner.nextLine();
            switch (option) {
                case "a":
                    gd.showBase();
                    break;
                case "b":
                    System.out.println("Podaj ocenę: ");
                    double grade=scanner.nextDouble();
                    scanner.nextLine();
                    gd.showGrade(grade);
                    break;
                case "c":
                    System.out.println("Podaj jak chcesz posortować gry:" +
                            "\n'1': według oceny (malejąco)" +
                            "\n'2': według limitu wieku (rosnąco)" +
                            "\n'3': według czasu gry (malejąco)");
                    Sort sort= new Sort();
                    String option2=scanner.nextLine();
                    sort.sortType(option2);
                    break;
                case "end":
                    break;
                default:
                    System.out.println("Wybrałeś złą opcję, wybierz ponownie");
            }
        }while (!(option.equals("end")));
    }

}
