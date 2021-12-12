import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuizController implements ActionListener, KeyListener, WindowListener, MouseListener{
    private ArrayList<Course> course = new ArrayList<>();
    private LoginView loginView = new LoginView();
    private RegView regView = new RegView();
    private MainView mainView = new MainView();
    private CourseModel courseModel = new CourseModel();
    private CardCourseModel cardCourse = new CardCourseModel();
    private AdminMainView adminMainView = new AdminMainView();
    private AllQuizView allQuizView = new AllQuizView();
    private AddCourseView addCourseView = new AddCourseView();
    private QuizModel quizModel = new QuizModel();
    private CourseView courseView = new CourseView();
    private CardCourseView cardCourseView = new CardCourseView();
    private AddQuizView addQuizView = new AddQuizView();
    private int lastestId = 0;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private String userRoleCurrent = "Student";
    private String userNameCurrent = "NOT FOUND CURRENT USER";
    public void ShowDataToForm(){
        String selectSql = "SELECT * FROM course";
        try {
            pst = con.prepareStatement(selectSql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public QuizController(){
        con = Connect.ConnectDB();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
//        addevent
        addCourseView.addWindowListener(this);
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
        loginView.getBtnLogin().addMouseListener(this);
        regView.getTfEmail().addKeyListener(this);
        mainView.addWindowListener(this);
        adminMainView.addWindowListener(this);
        adminMainView.getBtnAddCourse().addActionListener(this);
        addCourseView.getBtnCreateCourse().addActionListener(this);
        adminMainView.getBtnCourse().addActionListener(this);
        mainView.getBtnCourse().addActionListener(this);
        courseView.getBtnCourse().addActionListener(this);
        courseView.getBtnAllQuiz().addActionListener(this);
        allQuizView.getBtnAddQuiz().addActionListener(this);
        addQuizView.addWindowListener(this);
        addQuizView.getBtnSave1().addActionListener(this);
        addQuizView.getBtnSave2().addActionListener(this);
        addQuizView.getBtnSave3().addActionListener(this);
        
    }   
    public static void main(String[] args) {
        new QuizController();
    }
    public void reAdminMainView(){
        adminMainView.getCardPanel().removeAll();
        adminMainView.getCardPanel().repaint();
        courseModel.load();
        course = courseModel.getCourse();
        cardCourse.getCardCourse().clear();
        for (int i=0; i < course.size(); i++){
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),
                    course.get(i).getCourseName(),
                    course.get(i).getCourseScore(),
                    course.get(i).getCourseRelease(),
                    course.get(i).getCourseExpire(),
                    course.get(i).getCourseOwner()));
            adminMainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
            cardCourse.getCardCourse().get(i).getBtnRemove().addActionListener(this);
            if (course.get(i).getCourseID() > lastestId){
                lastestId = course.get(i).getCourseID();
            }
        }
        adminMainView.setVisible(true);
        adminMainView.setLocationRelativeTo(null);
    }
    public void reMainView(){
        mainView.getCardPanel().removeAll();
        courseModel.load();
        course = courseModel.getCourse();
        for (int i=0; i<course.size(); i++){
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),course.get(i).getCourseName(), course.get(i).getCourseScore(), course.get(i).getCourseRelease(), course.get(i).getCourseExpire(), course.get(i).getCourseOwner()));
            mainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnRemove().setVisible(false);
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
            mainView.setVisible(true);
            mainView.setLocationRelativeTo(null);
        }
        
    }
//    Press BTN
    @Override
    public void actionPerformed(ActionEvent e) {
//        Show AddCourse
        if (e.getSource().equals(adminMainView.getBtnAddCourse())){
            adminMainView.setEnabled(false);
            adminMainView.setAlwaysOnTop(false);
            addCourseView.setVisible(true);
            addCourseView.setLocationRelativeTo(null);
        }
            ArrayList<Course> data = courseModel.getCourse();
//            Create Course
        if (e.getSource().equals(addCourseView.getBtnCreateCourse())){
            
            data.add(new Course(lastestId+1, 
                    addCourseView.getTfCourseName().getText(),
                    Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                    addCourseView.getTfCourseRelease().getText(), 
                    addCourseView.getTfCourseExpire().getText(),
                    userNameCurrent,
                    new QuizModel(lastestId+1).getQuiz()));
            courseModel.save(addCourseView.getTfCourseName().getText(), 
                    Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                    addCourseView.getTfCourseRelease().getText(),
                    addCourseView.getTfCourseExpire().getText(),
                    userNameCurrent);
                    reAdminMainView();
                    addCourseView.dispose();
                    adminMainView.setEnabled(true);
                    adminMainView.setAlwaysOnTop(true);
        }
//        Login WIth User
        if (this.userRoleCurrent.equals("Student")){
            for (CardCourseView i: cardCourse.getCardCourse()){
                if (e.getSource().equals(i.getBtnEnter())){
//                    System.out.println(cardCourse.getCardCourse().indexOf(i)+1);
                }
            }
        }
//        Login With Admin
        if ((this.userRoleCurrent.equals("Admin")) && 
                (!e.getSource().equals(adminMainView.getBtnAddCourse())) && 
                (!e.getSource().equals(adminMainView.getBtnCourse())) &&
                (!e.getSource().equals(courseView.getBtnAllQuiz())) &&
                (!e.getSource().equals(allQuizView.getBtnAddQuiz()))){
            String state = "btnNull";
//&&           
            ArrayList<CardCourseView> tmp = new ArrayList<>(cardCourse.getCardCourse());
            for (int i=0; i < cardCourse.getCardCourse().size(); i++){

                if (e.getSource().equals(cardCourse.getCardCourse().get(i).getBtnEnter())){
                    courseView.setVisible(true);
                    courseView.setLocationRelativeTo(null);
                    courseView.getLbCourseName().setText(course.get(i).getCourseName());
                    courseView.getLbUserName().setText(userNameCurrent);
                    state = "btnEnter";
                }
                if (e.getSource().equals(cardCourse.getCardCourse().get(i).getBtnRemove())){
                    int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete this course", "choose one", JOptionPane.YES_NO_OPTION);
                    if (x == 0){
                        tmp.remove(cardCourse.getCardCourse().get(i));
                        courseModel.delete(course.get(i).getCourseID());
                        quizModel.deleteData(course.get(i).getCourseID());
                        state = "btnRemove";
                    }
                    
                }
            }
            cardCourse.getCardCourse().clear();
            cardCourse.getCardCourse().addAll(tmp);
            if (state.equals("btnNull") || (state.equals("btnRemove"))){
                reAdminMainView();
            }else{
                adminMainView.setVisible(false);
            }
            
        }
        
//        Register Login View
        if (e.getSource().equals(loginView.getBtnReg())){
            loginView.setVisible(false);
            regView.setVisible(true);
            regView.setLocationRelativeTo(null);
        }
//        Submit Register View
        if (e.getSource().equals(regView.getBtnReg())){
            String username = regView.getTfUsername().getText();
            String password = regView.getTfPassword().getText();
            String fullname = regView.getTfFirstname().getText()+" "+regView.getTfLastname().getText();
            String email = regView.getTfEmail().getText();
            String findSql = "SELECT userName, userPassword FROM user WHERE userName = '"+username+"' OR userEmail = '"+email+"'";
            String insertSql = "INSERT INTO user (userName, userPassword, userFullname, UserEmail, userRole) VALUES (?, ?, ?, ?, ?)";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next() == true){
                    JOptionPane.showMessageDialog(null, "Already User Or Email", "Duplicate Information", JOptionPane.WARNING_MESSAGE);
                }
                //                  Valid input check By toenTeen
                else if("".equals(username) || "".equals(password) || "".equals(fullname) || "".equals(email)){
                    JOptionPane.showMessageDialog(null, "Empty Informatin !!", "Empty Information", JOptionPane.WARNING_MESSAGE);
                }
                else if(!regView.getTfEmail().getText().contains("@")){
                    JOptionPane.showMessageDialog(null, "Invalid Email Information !!", "Invalid Email", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    pst = con.prepareStatement(insertSql);
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.setString(3, fullname);
                    pst.setString(4, email);
                    pst.setString(5, "Student");
                    pst.execute();
                    loginView.setVisible(true);
                    loginView.setLocationRelativeTo(null);
                    regView.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        Login
        
        if (e.getSource().equals(adminMainView.getBtnCourse())){
            reAdminMainView();
        }
        if (e.getSource().equals(mainView.getBtnCourse())){
            reMainView();
        }
        if (e.getSource().equals(courseView.getBtnCourse())){
            courseView.setVisible(false);
            if (userRoleCurrent.equals("Admin")){
                adminMainView.setVisible(true);
                adminMainView.setLocationRelativeTo(null);
            }else{
                mainView.setVisible(true);
                mainView.setLocationRelativeTo(null);
            }
        }
//        Add Quiz
        if (e.getSource().equals(allQuizView.getBtnAddQuiz())){
            allQuizView.setAlwaysOnTop(false);
            allQuizView.setEnabled(false);
            addQuizView.setVisible(true);
            addQuizView.setLocationRelativeTo(null);
        }
        if (e.getSource().equals(addQuizView.getBtnSave1()) ||
                e.getSource().equals(addQuizView.getBtnSave2()) ||
                e.getSource().equals(addQuizView.getBtnSave3())){
            addQuizView.setVisible(false);
            allQuizView.setEnabled(true);
            allQuizView.setAlwaysOnTop(true);
            
        }
        if (e.getSource().equals(courseView.getBtnAllQuiz())){
            allQuizView.setVisible(true);
            allQuizView.setLocationRelativeTo(null);
            courseView.setVisible(false);
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
        if(!regView.getTfEmail().getText().contains("@")){
            regView.getLbEmail().setText("Email Invalid");
        }
        else{
            regView.getLbEmail().setText("");
        }
    }
//    windowevent
    @Override
    public void windowOpened(WindowEvent we) {
        
        if (we.getSource().equals(mainView)){
            
        }
        if (we.getSource().equals(adminMainView)){
            reAdminMainView();
        }
    }
    @Override
    public void windowClosing(WindowEvent we) {
    }
    @Override
    public void windowClosed(WindowEvent we) {
        if (we.getSource().equals(addCourseView)){
            adminMainView.setEnabled(true);
            adminMainView.setAlwaysOnTop(true);
        }
        if (we.getSource().equals(addQuizView)){
            allQuizView.setEnabled(true);
            allQuizView.setAlwaysOnTop(true);
        }
    }
    @Override
    public void windowIconified(WindowEvent we) {
    }
    @Override
    public void windowDeiconified(WindowEvent we) {
    }
    @Override
    public void windowActivated(WindowEvent we) {
    }
    @Override
    public void windowDeactivated(WindowEvent we) {
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource().equals(loginView.getBtnLogin())){
            String username = loginView.getTfUsername().getText();
            String userPassWord = loginView.getTfUserPassword().getText();
            String findSql = "SELECT userName, userPassword, userRole FROM user WHERE userName = '"+username+"' AND userPassword = '"+userPassWord+"'";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next()){
                    this.userNameCurrent = rs.getString("userName");
                    if (rs.getString("userRole").equals("Admin")){
                        loginView.setVisible(false);
                        adminMainView.setVisible(true);
                        adminMainView.setLocationRelativeTo(null);
                        this.userRoleCurrent = "Admin";
                    }else{
                        loginView.setVisible(false);
                        mainView.setVisible(true);
                        mainView.setLocationRelativeTo(null);
                        this.userRoleCurrent = "Student";
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username or Password Incorrect", "Invalid Information", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent me) {
    }
    @Override
    public void mouseReleased(MouseEvent me) {
    }
    @Override
    public void mouseEntered(MouseEvent me) {
    }
    @Override
    public void mouseExited(MouseEvent me) {
    }
}
