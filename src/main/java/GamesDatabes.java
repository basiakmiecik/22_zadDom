import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GamesDatabes {
    List<Games> gamesSQL=new ArrayList<>();
    List<Games> games=new ArrayList<>();

    public List<Games> gamesSQL() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/computer_games?characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "basia11kmiecik";
        Connection connection = DriverManager.getConnection(url, username, password);//... connection.close();

        Statement statement = connection.createStatement();
        String query = "select* from computer_games.games";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            gamesSQL.add(new Games(resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3),resultSet.getInt(4),
                    resultSet.getInt(5),resultSet.getDouble(6) ));
        }
        connection.close();
    return gamesSQL;}

    public void transferGamesBase() {
        try {
            games = gamesSQL();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Games> base(){
        return games; }

    public void showBase(){
        for (Games game : games) {
            System.out.println(game);
        }

    }

    public void showGrade(double grade){
        for (Games games1 :  games) {
            if(games1.getGrade()>=grade){
                System.out.println(games1.toString());
            }
        }
    }
    public void sort(){
        GradeComparator gc=new GradeComparator();
        Collections.sort(games,gc);
    }

}
