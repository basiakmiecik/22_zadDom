public class Games{
    private int id;
    private String name;
    private String type;
    private int playTime;
    private int ageLevel;
    private double grade;

    public Games() {
    }

    public Games(int id, String name, String type, int playTime, int ageLevel, double grade) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.playTime = playTime;
        this.ageLevel = ageLevel;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public int getAgeLevel() {
        return ageLevel;
    }

    public void setAgeLevel(int ageLevel) {
        this.ageLevel = ageLevel;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", Nazwa: " + name  +
                ", Typ: '" + type  +
                ", Czas gry [godz.] : " + playTime +
                ", Wiek gry: " + ageLevel +
                ", Ocena [1-5]: " + grade;
    }
}
