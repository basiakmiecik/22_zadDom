import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    public void startBoard() throws IOException {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);
        SaveToCSV saveToCSV= new SaveToCSV();
        GamesDatabes gd= new GamesDatabes();
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
                    saveToCSV.save(gd.base());
                    break;
                case "b":
                    System.out.println("Podaj ocenę: ");
                    double grade=scanner.nextDouble();
                    scanner.nextLine();
                    saveToCSV.save(gd.showGrade(grade));
                    break;
                case "c":
                    System.out.println("Podaj jak chcesz posortować gry:" +
                            "\n'1': według oceny (malejąco)" +
                            "\n'2': według limitu wieku (rosnąco)" +
                            "\n'3': według czasu gry (malejąco)");
                    Sort sort= new Sort();
                    String option2=scanner.nextLine();
                    saveToCSV.save(sort.sortType(option2));
                    break;
                case "end":
                    break;
                default:
                    System.out.println("Wybrałeś złą opcję, wybierz ponownie");
            }
        }while (!(option.equals("end")));
    }

}
