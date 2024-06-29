import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JTextField;
public class Course {
    private int CourseID;
    private String CourseName;
    private int CourseScore;
    private String CourseRelease;
    private String CourseExpire;
    private String CourseOwner;
    private ArrayList<Quiz> Quiz;
    public Course(){
    }
    public Course(int CourseID, String CourseName, int CourseScore, String CourseRelease, String CourseExpire, String CourseOwner, ArrayList<Quiz> Quiz){
        setCourseID(CourseID);
        setCourseName(CourseName);
        setCourseScore(CourseScore);
        setCourseRelease(CourseRelease);
        setCourseExpire(CourseExpire);
        setCourseOwner(CourseOwner);
        setQuiz(Quiz);
    }
    Course(int size, String text, int parseInt, String text0, JTextField tfCourseExpire, ArrayList<Quiz> quiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Course(int i, String text, int parseInt, LocalDate localDate1, LocalDate localDate2, String userNameCurrent, ArrayList<Quiz> quiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public int getCourseScore() {
        return CourseScore;
    }

    public void setCourseScore(int CourseScore) {
        this.CourseScore = CourseScore;
    }

    public String getCourseRelease() {
        return CourseRelease;
    }

    public void setCourseRelease(String CourseRelease) {
        this.CourseRelease = CourseRelease;
    }

    public String getCourseExpire() {
        return CourseExpire;
    }

    public void setCourseExpire(String CourseExpire) {
        this.CourseExpire = CourseExpire;
    }

    public String getCourseOwner() {
        return CourseOwner;
    }

    public void setCourseOwner(String CourseOwner) {
        this.CourseOwner = CourseOwner;
    }

    public ArrayList<Quiz> getQuiz() {
        return Quiz;
    }

    public void setQuiz(ArrayList<Quiz> Quiz) {
        this.Quiz = Quiz;
    }
    
}
