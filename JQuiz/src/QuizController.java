import java.awt.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//management database table
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuizController implements ActionListener, KeyListener{
    private LoginView loginView = new LoginView();
    private RegView regView = new RegView();
    private MainView mainView = new MainView();
    private Connection con = null;
//    connection
    private ResultSet rs = null;
//    dataRespone
    private PreparedStatement pst = null;
//    Command Sql
    public void ShowDataToForm(){
        String selectSql = "SELECT * FROM course";
        try {
            pst = con.prepareStatement(selectSql);
            rs = pst.executeQuery();
            mainView.getTbCourse().setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public QuizController(){
        con = Connect.ConnectDB();
        ShowDataToForm();
        loginView.setVisible(true);
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
        loginView.getBtnLogin().addActionListener(this);
        regView.getTfEmail().addKeyListener(this);
    }
    public static void main(String[] args) {
        new QuizController();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginView.getBtnReg())){
            loginView.setVisible(false);
            regView.setVisible(true);
        }
        if (e.getSource().equals(regView.getBtnReg())){
            String username = regView.getTfUsername().getText();
            String password = regView.getTfPassword().getText();
            String fullname = regView.getTfFirstname().getText()+" "+regView.getTfLastname().getText();
            String email = regView.getTfEmail().getText();
            String findSql = "SELECT userName, userPassword FROM user WHERE userName = '"+username+"' OR userEmail = '"+email+"'";
            String insertSql = "INSERT INTO user (userName, userPassword, userFullname, UserEmail, userRole) VALUES ('"+username+"', '"+password+"', '"+fullname+"', '"+email+"', 'Student');";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next() == true){
                    JOptionPane.showMessageDialog(null, "Already User Or Email", "Duplicate Information", JOptionPane.WARNING_MESSAGE);
                }
                //                  Valid input check By toenTeen
                else if(username == "" || password == "" || fullname == "" || email == ""){
                    JOptionPane.showMessageDialog(null, "Empty Informatin !!", "Empty Information", JOptionPane.WARNING_MESSAGE);
                }
                else if(regView.getTfEmail().getText().indexOf("@") == -1){
                    JOptionPane.showMessageDialog(null, "Invalid Email Information !!", "Invalid Email", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    //pst = con.prepareStatement(insertSql);
                    //rs = pst.executeQuery();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
            loginView.setVisible(true);
            regView.setVisible(false);
        }
//        Login
        if (e.getSource().equals(loginView.getBtnLogin())){
            String username = loginView.getTfUsername().getText();
            String userPassWord = loginView.getTfUserPassword().getText();
            String findSql = "SELECT userName, userPassword FROM user WHERE userName = '"+username+"' AND userPassword = '"+userPassWord+"'";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next()){
                    loginView.setVisible(false);
                    mainView.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Username or Password Incorrect", "Invalid Information", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if(regView.getTfEmail().getText().indexOf("@") == -1){
            regView.getLbEmail().setText("Fuck Oof");
        }
        else{
            regView.getLbEmail().setText("");
        }
    }
    
}