import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentModel {
    private ArrayList<Student> student;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    public StudentModel(){
        student = new ArrayList<>();
        con = Connect.ConnectDB();
    }
    public static void main(String[] args) {
        new StudentModel().load();
        new StudentModel().edit(5, "superoof", "superoof12", "test test", "superoof1200", "Admin");
        
    }
    public void load(){
        String selectSql = "SELECT * FROM user WHERE userRole = 'Student'";
        try {
            pst = con.prepareStatement(selectSql);
            rs = pst.executeQuery();
            student.clear();
            while (rs.next()){
                Student aStudent = new Student(Integer.parseInt(rs.getString("userId")),
                                                            rs.getString("userName"),
                                                            rs.getString("userPassword"),
                                                            rs.getString("userFullname"),
                                                            rs.getString("userEmail"),
                                                            rs.getString("userRole"));
                student.add(aStudent);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void save(String username, String password, String fullname, String email, String role){
        String selectSql = "INSERT INTO user (userName, userPassword, userFullname, userEmail, userRole) VALUES (?, ?, ?, ?, ?);";
        try {
            pst = con.prepareStatement(selectSql);   
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, fullname);
            pst.setString(4, email);
            pst.setString(5, role);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(int userId){
        String deleteSql = "DELETE FROM user WHERE userId='"+userId+"'";
        try {
            pst = con.prepareStatement(deleteSql);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void edit(int id, String username, String password, String fullname, String email, String role){
        String selectSql = "UPDATE user SET userName=?, userPassword=?, userFullname=?, userEmail=?, userRole=? WHERE userId=?;";
        try {
            pst = con.prepareStatement(selectSql);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, fullname);
            pst.setString(4, email);
            pst.setString(5, role);
            pst.setString(6, String.valueOf(id));
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }
    
}
