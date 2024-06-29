import java.sql.*;
public class Connect {
//    interface Connection
    public static Connection ConnectDB(){
        try{
//            find Driver
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/JQuiz";
//            connect database with url user password
            Connection con = DriverManager.getConnection(url, "root", "");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
