package day36lambda;

public class Course {
/*
 İçinde
 1)private variable lar
2)parametreli ve parametresiz constructerlar
3)gettelar
4)setterlar
5)to String methodu barındıran classlara POJO class denir>> (plain old Java Object)
 */
    private String season;
    private String courseName;

    private int avarageScore;

    private int numberOfStudent;

    public Course() {
    }

    public Course(String season, String courseName, int avarageScore, int numberOfStudent) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudent = numberOfStudent;
    }

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
