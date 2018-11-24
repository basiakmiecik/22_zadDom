import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToCSV {

    public void save(List<Games> gamesList) throws IOException {
        //gamesDatabes.transferGamesBase();
        FileWriter fileWriter= new FileWriter("gameBase.csv");
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write("ID;NAZWA;TYP;CZAS_GRY;WIEK;OCENA");
        bufferedWriter.newLine();
        for (Games games : gamesList) {
        String line= games.getId()+";"+games.getName()+";"+
                    games.getType()+";"+games.getPlayTime()+";"+games.getAgeLevel()+
                    ";"+games.getGrade();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.err.println("Dane zostały zapisane");

    }
}
