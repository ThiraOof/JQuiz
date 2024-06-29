
import java.util.Date;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuizController implements ActionListener, KeyListener, WindowListener, MouseListener {

    private ArrayList<Course> course = new ArrayList<>();
    private SendEmail sendEmail = new SendEmail();
    private LoginView loginView = new LoginView();
    private AdminModel adminModel = new AdminModel();
    private StudentModel studentModel = new StudentModel();
    private RegView regView = new RegView();
    private MainView mainView = new MainView();
    private CourseModel courseModel = new CourseModel();
    private CardCourseModel cardCourse = new CardCourseModel();
    private AdminMainView adminMainView = new AdminMainView();
    private AllQuizView allQuizView = new AllQuizView();
    private AddCourseView addCourseView = new AddCourseView();
    private QuizModel quizModel = new QuizModel();
    private CourseView courseView = new CourseView();
    private AddQuizView addQuizView = new AddQuizView();
    private CardQuizModel cardQuiz = new CardQuizModel();
    private QuizView quizView = new QuizView();
    private AllUserView allUserView = new AllUserView();
    private SubmittedModel submittedModel = new SubmittedModel();
    private ScoreView scoreView = new ScoreView();
    private ExportExcel exportExcel = new ExportExcel();
    private ExportCSV exportCSV = new ExportCSV();
    private RePasswordView rePasswordView = new RePasswordView();
    private int courseIdCurrent = 0;
    private int courseIndexCurrent = 0;
    private int lastCourseId = 0;
    private int lastUserId = 0;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private String userRoleCurrent = "Student";
    private String userNameCurrent = "NOT FOUND CURRENT USER";
    private String state = "btnNull";
    private int checkEvent = 0;

    public QuizController() {
        con = Connect.ConnectDB();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
//        add event
        courseView.getLbAllQuiz().addMouseListener(this);
        courseView.getLbAttend().addMouseListener(this);
        courseView.getLbCourseScore().addMouseListener(this);
        scoreView.addWindowListener(this);
        quizView.getBtnCourse().addActionListener(this);
        addCourseView.addWindowListener(this);
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
        loginView.getBtnLogin().addMouseListener(this);
        regView.addWindowListener(this);
        regView.getTfEmail().addKeyListener(this);
        mainView.addWindowListener(this);
        adminMainView.addWindowListener(this);
        adminMainView.getBtnAddCourse().addActionListener(this);
        addCourseView.getBtnCreateCourse().addActionListener(this);
        adminMainView.getBtnCourse().addActionListener(this);
        mainView.getBtnCourse().addActionListener(this);
        courseView.getBtnCourse().addActionListener(this);
        courseView.getBtnAllQuiz().addActionListener(this);
        courseView.addWindowListener(this);
        allQuizView.getBtnAddQuiz().addActionListener(this);
        addQuizView.addWindowListener(this);
        addQuizView.getBtnSave1().addActionListener(this);
        addQuizView.getBtnSave2().addActionListener(this);
        addQuizView.getBtnSave3().addActionListener(this);
        allQuizView.getBtnCourse().addActionListener(this);
        quizView.getBtnSubmit().addActionListener(this);
        allQuizView.addWindowListener(this);
        courseView.getBtnCourseScore().addActionListener(this);
        scoreView.getBtnCourse().addActionListener(this);
        scoreView.getBtnExportExcel().addActionListener(this);
        scoreView.getBtnExportCSV().addActionListener(this);
        adminMainView.getBtnUser().addActionListener(this);
        allUserView.getBtnDel().addActionListener(this);
        allUserView.getBtnEdit().addActionListener(this);
        allUserView.getBtnAdd().addActionListener(this);
        allUserView.getBtnSave().addActionListener(this);
        allUserView.getBtnCancel().addActionListener(this);
        allUserView.getBtnAdd().addActionListener(this);
        loginView.getBtnForgot().addActionListener(this);
        rePasswordView.getBtnSubmit().addActionListener(this);
        adminMainView.addWindowListener(this);
        quizView.addWindowListener(this);
        courseView.getBtnAttend().addActionListener(this);
    }

    public static void main(String[] args) {
        new QuizController();
    }
//    re admin

    public void reAdminMainView() {
        adminMainView.getCardPanel().removeAll();
        adminMainView.getCardPanel().repaint();
        courseModel.load(quizModel);
        course = courseModel.getCourse();
        cardCourse.getCardCourse().clear();
        for (int i = 0; i < course.size(); i++) {
            int x = i;
            if (course.get(i).getCourseID() > lastCourseId) {
                lastCourseId = course.get(i).getCourseID();
            }
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),
                    course.get(i).getCourseName(),
                    course.get(i).getCourseScore(),
                    course.get(i).getCourseRelease(),
                    course.get(i).getCourseExpire(),
                    course.get(i).getCourseOwner()));
            adminMainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    adminMainView.setVisible(false);
                    courseView.setVisible(true);
                    courseView.setLocationRelativeTo(null);
                    courseView.getLbCourseName().setText(course.get(x).getCourseName());
                    courseView.getLbUserName().setText(userNameCurrent);
                    state = "btnEnter";
                    courseIdCurrent = course.get(x).getCourseID();
                    System.out.println(course.get(x).getCourseID());
                    courseIndexCurrent = x;
                    checkEvent = 1;
                    if (userRoleCurrent.equals("Admin")) {
                        reAdminMainView();
                    }

                }
            });
            cardCourse.getCardCourse().get(i).getBtnRemove().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ArrayList<CardCourseView> tmp = new ArrayList<>(cardCourse.getCardCourse());
                    int j = JOptionPane.showConfirmDialog(null, "Are you sure to delete this course", "choose one", JOptionPane.YES_NO_OPTION);
                    if (j == 0) {
                        tmp.remove(cardCourse.getCardCourse().get(x));
                        courseModel.delete(course.get(x).getCourseID());
                        quizModel.deleteData(course.get(x).getCourseID());
                        state = "btnRemove";
                        submittedModel.deleteData(course.get(x).getCourseID());
                    }
                    checkEvent = 1;
                    reAdminMainView();
                    System.out.println("RePaint");
                    adminMainView.repaint();
                    adminMainView.setVisible(true);
                }
            });

        }
        if (!state.equals("btnEnter")) {
            adminMainView.setLocationRelativeTo(null);
            adminMainView.setVisible(true);
        }

    }
//    re quiz

    public void reQuiz() {
        quizView.getCardPanel().removeAll();
        quizView.getCardPanel().repaint();
        ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
        cardQuiz.getCardQuiz().clear();
        for (int i = 0; i < allQuiz.size(); i++) {
            switch (allQuiz.get(i).getType()) {
                case "Choice":
                    Choice choice = ((Choice) allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new ChoiceView(((Choice) allQuiz.get(i)).getQuestion(),
                            choice.getChoiceA(),
                            choice.getChoiceB(),
                            choice.getChoiceC(),
                            choice.getChoiceD(),
                            choice.getAnswer()));
                    quizView.getCardPanel().add(((ChoiceView) cardQuiz.getCardQuiz().get(i)));
                    quizView.getCardPanel().setVisible(true);
                    break;
                case "MultipleChoice":
                    MultipleChoice multiChoice = ((MultipleChoice) allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new MultiChoiceView(((MultipleChoice) allQuiz.get(i)).getQuestion(),
                            multiChoice.getChoiceA(),
                            multiChoice.getChoiceB(),
                            multiChoice.getChoiceC(),
                            multiChoice.getChoiceD(),
                            multiChoice.getAnswer()));
                    quizView.getCardPanel().add(((MultiChoiceView) cardQuiz.getCardQuiz().get(i)));
                    quizView.getCardPanel().setVisible(true);
                    break;
                default:
                    FillAnswer fillAnswer = ((FillAnswer) allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new FillAnswerView(((FillAnswer) allQuiz.get(i)).getQuestion(),
                            fillAnswer.getAnswer()));
                    quizView.getCardPanel().add(((FillAnswerView) cardQuiz.getCardQuiz().get(i)));
                    quizView.getCardPanel().setVisible(true);
                    break;
            }
        }
        quizView.setVisible(true);
    }
// re adminQuiz

    public void reAdminQuiz() {
        System.out.println("readminQuiz");
        allQuizView.getCardPanel().removeAll();
        allQuizView.getCardPanel().repaint();
        System.out.println("Will Load " + courseIdCurrent);
        ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
        cardQuiz.getCardQuiz().clear();
        for (int i = 0; i < allQuiz.size(); i++) {
            switch (allQuiz.get(i).getType()) {
                case "Choice":
                    Choice choice = ((Choice) allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new EditChoiceView(((Choice) allQuiz.get(i)).getQuestion(),
                            choice.getChoiceA(),
                            choice.getChoiceB(),
                            choice.getChoiceC(),
                            choice.getChoiceD(),
                            choice.getAnswer()));
                    EditChoiceView editChoiceView = ((EditChoiceView) cardQuiz.getCardQuiz().get(i));
                    editChoiceView.getBtnEditQuiz().addActionListener(this);
                    editChoiceView.getBtnDelQuiz().addActionListener(this);
                    switch (choice.getAnswer()) {
                        case "A":
                            editChoiceView.getRbtnA().setSelected(true);
                            break;
                        case "B":
                            editChoiceView.getRbtnB().setSelected(true);
                            break;
                        case "C":
                            editChoiceView.getRbtnC().setSelected(true);
                            break;
                        case "D":
                            editChoiceView.getRbtnD().setSelected(true);
                            break;
                        default:
                            break;
                    }
                    allQuizView.getCardPanel().add(((EditChoiceView) cardQuiz.getCardQuiz().get(i)));
                    allQuizView.getCardPanel().setVisible(true);
//            MultipleChoice Fetch
                    break;
                case "MultipleChoice":
                    MultipleChoice multiChoice = ((MultipleChoice) allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new EditMultiChoiceView(((MultipleChoice) allQuiz.get(i)).getQuestion(),
                            multiChoice.getChoiceA(),
                            multiChoice.getChoiceB(),
                            multiChoice.getChoiceC(),
                            multiChoice.getChoiceD(),
                            multiChoice.getAnswer()));
                    EditMultiChoiceView editMultiChoiceView = ((EditMultiChoiceView) cardQuiz.getCardQuiz().get(i));
                    editMultiChoiceView.getBtnEditQuiz().addActionListener(this);
                    editMultiChoiceView.getBtnDelQuiz().addActionListener(this);
                    if (multiChoice.getAnswer().contains("A")) {
                        editMultiChoiceView.getCbA().setSelected(true);
                    }
                    if (multiChoice.getAnswer().contains("B")) {
                        editMultiChoiceView.getCbB().setSelected(true);
                    }
                    if (multiChoice.getAnswer().contains("C")) {
                        editMultiChoiceView.getCbC().setSelected(true);
                    }
                    if (multiChoice.getAnswer().contains("D")) {
                        editMultiChoiceView.getCbD().setSelected(true);
                    }
                    allQuizView.getCardPanel().add(((EditMultiChoiceView) cardQuiz.getCardQuiz().get(i)));
                    allQuizView.getCardPanel().setVisible(true);
//                FileAnswer Fetch
                    break;
                default:
                    FillAnswer fillAnswer = ((FillAnswer) allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new EditFillAnswerView(((FillAnswer) allQuiz.get(i)).getQuestion(),
                            fillAnswer.getAnswer()));
                    EditFillAnswerView editFillAnswerView = ((EditFillAnswerView) cardQuiz.getCardQuiz().get(i));
                    editFillAnswerView.getBtnEditQuiz().addActionListener(this);
                    editFillAnswerView.getBtnDelQuiz().addActionListener(this);
                    allQuizView.getCardPanel().add(((EditFillAnswerView) cardQuiz.getCardQuiz().get(i)));
                    allQuizView.getCardPanel().setVisible(true);
                    break;
            }
        }
        allQuizView.setVisible(true);
        allQuizView.setLocationRelativeTo(null);
    }

    public void reMainView() {
        mainView.getCardPanel().removeAll();
        courseModel.load(quizModel);
        course = courseModel.getCourse();
        for (int i = 0; i < course.size(); i++) {
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(), course.get(i).getCourseName(), course.get(i).getCourseScore(), course.get(i).getCourseRelease(), course.get(i).getCourseExpire(), course.get(i).getCourseOwner()));
            mainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnRemove().setVisible(false);
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
            mainView.setVisible(true);
            mainView.setLocationRelativeTo(null);
        }

    }
//    fetch User

    public void reAllUserView() {
        allUserView.getCardUser().removeAll();
        allUserView.getCardUser().repaint();
        adminModel.load();
        ArrayList<Admin> admin = adminModel.getAdmin();
        for (int i = 0; i < admin.size(); i++) {
            if (admin.get(i).getId() > lastUserId) {
                lastUserId = admin.get(i).getId();
            }
            int x = i;
            JPanel jpBtn = new JPanel(new BorderLayout());
            jpBtn.setSize(200, 40);
            JButton btnUser = new JButton();
            btnUser.setBackground(new java.awt.Color(153, 255, 153));
            btnUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            btnUser.setForeground(new java.awt.Color(0, 0, 0));
            btnUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            btnUser.setMargin(new java.awt.Insets(0, 0, 0, 0));
            btnUser.setMaximumSize(new java.awt.Dimension(200, 40));
            btnUser.setMinimumSize(new java.awt.Dimension(200, 40));
            btnUser.setPreferredSize(new java.awt.Dimension(195, 40));
            btnUser.setText(admin.get(i).getUsername());
            jpBtn.add(btnUser);
            btnUser.addActionListener((ActionEvent e) -> {
                allUserView.getTfId().setText(String.valueOf(admin.get(x).getId()));
                allUserView.getTfUsername().setText(admin.get(x).getUsername());
                allUserView.getTfPassword().setText(admin.get(x).getPassword());
                allUserView.getTfFullname().setText(admin.get(x).getFullname());
                allUserView.getTfEmail().setText(admin.get(x).getEmail());
                allUserView.getJcbRole().setSelectedItem(admin.get(x).getRole());
                allUserView.getBtnEdit().setEnabled(true);
                allUserView.getBtnDel().setEnabled(true);
                allUserView.getBtnAdd().setEnabled(true);
                allUserView.getBtnSave().setVisible(false);
                allUserView.getBtnCancel().setVisible(false);
            });
            allUserView.getCardUser().add(jpBtn);
        }
        studentModel.load();
        ArrayList<Student> student = studentModel.getStudent();
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId() > lastUserId) {
                lastUserId = student.get(i).getId();
            }
            int x = i;
            JPanel jpBtn = new JPanel(new BorderLayout());
            jpBtn.setSize(200, 40);
            JButton btnUser = new JButton();
            btnUser.setBackground(new java.awt.Color(204, 204, 255));
            btnUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            btnUser.setForeground(new java.awt.Color(0, 0, 0));
            btnUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            btnUser.setMargin(new java.awt.Insets(0, 0, 0, 0));
            btnUser.setMaximumSize(new java.awt.Dimension(200, 40));
            btnUser.setMinimumSize(new java.awt.Dimension(200, 40));
            btnUser.setPreferredSize(new java.awt.Dimension(195, 40));
            btnUser.setText(student.get(i).getUsername());
            jpBtn.add(btnUser);
            btnUser.addActionListener((ActionEvent e) -> {
                allUserView.getTfId().setText(String.valueOf(student.get(x).getId()));
                allUserView.getTfUsername().setText(student.get(x).getUsername());
                allUserView.getTfPassword().setText(student.get(x).getPassword());
                allUserView.getTfFullname().setText(student.get(x).getFullname());
                allUserView.getTfEmail().setText(student.get(x).getEmail());
                allUserView.getJcbRole().setSelectedItem(student.get(x).getRole());
                allUserView.getBtnEdit().setEnabled(true);
                allUserView.getBtnDel().setEnabled(true);
                allUserView.getBtnAdd().setEnabled(true);
                allUserView.getBtnSave().setVisible(false);
                allUserView.getBtnCancel().setVisible(false);
            });
            allUserView.getCardUser().add(jpBtn);
            allUserView.getCardUser().repaint();
        }
        allUserView.setVisible(true);
    }
//    Press BTN

    @Override
    public void actionPerformed(ActionEvent e) {
//      Button Attend

        if (e.getSource().equals(courseView.getBtnAttend())) {
            ArrayList<Submitted> submitted = submittedModel.loadData(courseIdCurrent);
            double allScore = 0;
            int highestScore = 0;
            int yourFirstScore = 0;
            int yourLastScore = 0;
            int count = 0;
            if (submitted.size() != 0) {
                for (Submitted i : submitted) {
                    allScore += i.getScore();
                    if (i.getScore() >= highestScore) {
                        highestScore = i.getScore();
                    }
                    if (i.getName().equals(userNameCurrent)) {
                        if (count == 0) {
                            yourFirstScore = i.getScore();
                        }
                        yourLastScore = i.getScore();
                        count++;
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "Your First Submit: " + yourFirstScore
                        + "\nYour Last Submit: " + yourLastScore
                        + "\nHighest Score: " + highestScore
                        + "\nAverage Score: " + allScore / submitted.size()
                        + "\nSubmitted Time: " + submitted.size(),
                        "All Score!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "It's no Submit yet.", "Can't Find Score", JOptionPane.WARNING_MESSAGE);
            }

        }
//      Export
        if (e.getSource().equals(scoreView.getBtnExportExcel())) {
            System.out.println("Excel");
            System.out.println("Show");
            JFileChooser fc = new JFileChooser();
            int event = fc.showOpenDialog(scoreView);
            File f = fc.getSelectedFile();
            System.out.println(f);
            System.out.println(event);
            if (exportExcel.exportExcel(courseIdCurrent, submittedModel.loadData(courseIdCurrent), f + "") && event == 0) {
                JOptionPane.showMessageDialog(null, "Export Excel File Success!", "Export Excel Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Export Excel File Fail!", "Export Excel Success", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (e.getSource().equals(scoreView.getBtnExportCSV())) {
            System.out.println("CSV");
            JFileChooser fc = new JFileChooser();
            int event = fc.showOpenDialog(scoreView);
            File f = fc.getSelectedFile();
            System.out.println(f);
            System.out.println(event);
            if (exportCSV.exportCSV(courseIdCurrent, submittedModel.loadData(courseIdCurrent), f + "") && event == 0) {
                JOptionPane.showMessageDialog(null, "Export CSV File Success!", "Export CSV Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Export CSV File Fail!", "Export CSV Success", JOptionPane.WARNING_MESSAGE);
            }
        }
//        Show AddCourse
        if (e.getSource().equals(adminMainView.getBtnAddCourse())) {
//            adminMainView.setEnabled(false);
            addCourseView.setVisible(true);
            addCourseView.setLocationRelativeTo(null);
        }
        ArrayList<Course> data = courseModel.getCourse();
        ArrayList<Submitted> submitted = submittedModel.getSubmitted();
//            Create Course
        if (e.getSource().equals(addCourseView.getBtnCreateCourse())) {
            System.out.println("Test");

            Instant instant1 = addCourseView.getDpRelease().getValue().toInstant();
            Instant instant2 = addCourseView.getDpExpire().getValue().toInstant();
            LocalDate localDate1 = instant1.atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDate2 = instant2.atZone(ZoneId.systemDefault()).toLocalDate();
            ZoneId defaultZoneId = ZoneId.systemDefault();
            LocalDate localDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
            Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

            try {
                System.out.println(addCourseView.getTfCourseScore().getText() + " | 1");
                int score = Integer.parseInt(addCourseView.getTfCourseScore().getText());
                System.out.println(score + " | 2");
                data.add(new Course(lastCourseId + 1,
                        addCourseView.getTfCourseName().getText(),
                        Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                        localDate1 + "",
                        localDate2 + "",
                        userNameCurrent,
                        new QuizModel(lastCourseId + 1).getQuiz()));
                courseModel.save(addCourseView.getTfCourseName().getText(),
                        Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                        localDate1 + "",
                        localDate2 + "",
                        userNameCurrent);
                new SubmittedModel(lastCourseId + 1).getSubmitted();
                submittedModel.saveData(lastCourseId + 1, submitted);
                reAdminMainView();
                addCourseView.dispose();
                adminMainView.setEnabled(true);
                addCourseView.getTfCourseName().setText("");
                addCourseView.getTfCourseScore().setText("");
                addCourseView.getDpRelease().setValue(date);
                addCourseView.getDpExpire().setValue(date);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Score invalid input, Please number only");
            }

        }
//        Login WIth User
        if ((this.userRoleCurrent.equals("Student"))
                && (!e.getSource().equals(adminMainView.getBtnAddCourse()))
                && (!e.getSource().equals(adminMainView.getBtnCourse()))
                && (!e.getSource().equals(courseView.getBtnAllQuiz()))
                && (!e.getSource().equals(courseView.getBtnCourse()))
                && (!e.getSource().equals(allQuizView.getBtnAddQuiz()))
                && (!e.getSource().equals(addQuizView.getBtnSave1()))
                && (!e.getSource().equals(addQuizView.getBtnSave2()))
                && (!e.getSource().equals(loginView.getBtnReg()))
                && (!e.getSource().equals(courseView.getBtnAllQuiz()))
                && (!e.getSource().equals(rePasswordView.getBtnSubmit()))
                && (!e.getSource().equals(addQuizView.getBtnSave3()))
                && (!e.getSource().equals(adminMainView.getBtnUser()))
                && (!e.getSource().equals(loginView.getBtnForgot()))
                && (!e.getSource().equals(regView.getBtnReg()))
                && (!e.getSource().equals(addCourseView.getBtnCreateCourse()))) {
            for (int i = 0; i < cardCourse.getCardCourse().size(); i++) {
                if (e.getSource().equals(cardCourse.getCardCourse().get(i).getBtnEnter())) {
                    mainView.setVisible(false);
                    courseView.setVisible(true);
                    courseView.setLocationRelativeTo(null);
                    courseView.getLbCourseName().setText(course.get(i).getCourseName());
                    courseView.getLbUserName().setText(userNameCurrent);
                    courseIdCurrent = course.get(i).getCourseID();
                    courseIndexCurrent = i;
                    mainView.setVisible(false);
                }
            }
        }
//        Login With Admin
        if ((this.userRoleCurrent.equals("Admin"))
                && (!e.getSource().equals(adminMainView.getBtnAddCourse()))
                && (!e.getSource().equals(adminMainView.getBtnCourse()))
                && (!e.getSource().equals(allQuizView.getBtnCourse()))
                && (!e.getSource().equals(loginView.getBtnForgot()))
                && (!e.getSource().equals(rePasswordView.getBtnSubmit()))
                && (!e.getSource().equals(loginView.getBtnReg()))
                && (!e.getSource().equals(courseView.getBtnAllQuiz()))
                && (!e.getSource().equals(courseView.getBtnCourse()))
                && (!e.getSource().equals(courseView.getBtnAttend()))
                && (!e.getSource().equals(allQuizView.getBtnAddQuiz()))
                && (!e.getSource().equals(addQuizView.getBtnSave1()))
                && (!e.getSource().equals(addQuizView.getBtnSave2()))
                && (!e.getSource().equals(addQuizView.getBtnSave3()))
                && (!e.getSource().equals(adminMainView.getBtnUser()))
                && (!e.getSource().equals(courseView.getBtnCourseScore()))
                && (!e.getSource().equals(scoreView.getBtnCourse()))
                && (!e.getSource().equals(scoreView.getBtnExportCSV()))
                && (!e.getSource().equals(scoreView.getBtnExportExcel()))
                && (!e.getSource().equals(allUserView.getBtnDel()))
                && (!e.getSource().equals(allUserView.getBtnAdd()))
                && (!e.getSource().equals(allUserView.getBtnEdit()))
                && (!e.getSource().equals(allUserView.getBtnSave()))
                && (!e.getSource().equals(allUserView.getBtnEdit()))
                && (!e.getSource().equals(allUserView.getBtnCancel()))
                && (!e.getSource().equals(regView.getBtnReg()))
                && (!e.getSource().equals(addCourseView.getBtnCreateCourse()))) {
            checkEvent = 0;
            state = "btnNull";
//&&

            switch (state) {
                case "btnRemove":
                    cardCourse.getCardCourse().clear();
//                    cardCourse.getCardCourse().addAll(tmp);
                    reAdminMainView();
                    break;
                case "btnNull":
                    break;
                default:
                    adminMainView.setVisible(false);
                    break;
            }

            if (checkEvent == 0) {
                ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
                ArrayList<Quiz> allQuizTmp = new ArrayList<>(allQuiz);
                for (int i = 0; i < allQuiz.size(); i++) {
                    if (allQuiz.get(i).getType().equals("Choice")) {
                        EditChoiceView editChoiceView = ((EditChoiceView) cardQuiz.getCardQuiz().get(i));
                        Choice choice = ((Choice) allQuiz.get(i));
                        if (e.getSource().equals(((EditChoiceView) cardQuiz.getCardQuiz().get(i)).getBtnDelQuiz())) {
                            allQuizTmp.remove(i);
                        }
                        String answer = "null";
                        if (e.getSource().equals(((EditChoiceView) cardQuiz.getCardQuiz().get(i)).getBtnEditQuiz())) {
                            if (editChoiceView.getRbtnA().isSelected()) {
                                answer = "A";
                            } else if (editChoiceView.getRbtnB().isSelected()) {
                                answer = "B";
                            } else if (editChoiceView.getRbtnC().isSelected()) {
                                answer = "C";
                            } else if (editChoiceView.getRbtnD().isSelected()) {
                                answer = "D";
                            }
                            allQuizTmp.set(i, new Choice(i + 1,
                                    editChoiceView.getTfQuestion().getText(),
                                    editChoiceView.getTfChoiceA().getText(),
                                    editChoiceView.getTfChoiceB().getText(),
                                    editChoiceView.getTfChoiceC().getText(),
                                    editChoiceView.getTfChoiceD().getText(),
                                    answer,
                                    "Choice"));
                        }
                    }
                    if (allQuiz.get(i).getType().equals("MultipleChoice")) {
                        EditMultiChoiceView editMultiChoiceView = ((EditMultiChoiceView) cardQuiz.getCardQuiz().get(i));
                        if (e.getSource().equals(((EditMultiChoiceView) cardQuiz.getCardQuiz().get(i)).getBtnDelQuiz())) {
                            allQuizTmp.remove(i);
                        }
                        if (e.getSource().equals(((EditMultiChoiceView) cardQuiz.getCardQuiz().get(i)).getBtnEditQuiz())) {
                            String answer = "";
                            if (editMultiChoiceView.getCbA().isSelected()) {
                                answer += "A";
                            }
                            if (editMultiChoiceView.getCbB().isSelected()) {
                                answer += "B";
                            }
                            if (editMultiChoiceView.getCbC().isSelected()) {
                                answer += "C";
                            }
                            if (editMultiChoiceView.getCbD().isSelected()) {
                                answer += "D";
                            }
                            allQuizTmp.set(i, new MultipleChoice(i + 1,
                                    editMultiChoiceView.getTfQuestion().getText(),
                                    editMultiChoiceView.getTfCBA().getText(),
                                    editMultiChoiceView.getTfCBB().getText(),
                                    editMultiChoiceView.getTfCBC().getText(),
                                    editMultiChoiceView.getTfCBD().getText(),
                                    answer,
                                    "MultipleChoice"));
                        }
                    }
                    if (allQuiz.get(i).getType().equals("FillAnswer")) {
                        EditFillAnswerView editFillAnswerView = ((EditFillAnswerView) cardQuiz.getCardQuiz().get(i));
                        if (e.getSource().equals(((EditFillAnswerView) cardQuiz.getCardQuiz().get(i)).getBtnDelQuiz())) {
                            allQuizTmp.remove(i);
                        }
                        if (e.getSource().equals(((EditFillAnswerView) cardQuiz.getCardQuiz().get(i)).getBtnEditQuiz())) {
                            allQuizTmp.set(i, new FillAnswer(i + 1, editFillAnswerView.getTfQuestion().getText(), editFillAnswerView.getTfAnswer().getText(), "FillAnswer"));
                        }
                    }
                }

                quizModel.saveData(courseIdCurrent, allQuizTmp);
                reAdminQuiz();

            }

        }
//        Save user
        if (e.getSource().equals(allUserView.getBtnSave())) {
            System.out.println("test");
            if (allUserView.getJcbRole().getSelectedItem().equals("Admin")) {
                adminModel.save(allUserView.getTfUsername().getText(),
                        allUserView.getTfPassword().getText(),
                        allUserView.getTfFullname().getText(),
                        allUserView.getTfEmail().getText(),
                        allUserView.getJcbRole().getSelectedItem() + "");
                reAllUserView();
            } else if (allUserView.getJcbRole().getSelectedItem().equals("Student")) {
                studentModel.save(allUserView.getTfUsername().getText(),
                        allUserView.getTfPassword().getText(),
                        allUserView.getTfFullname().getText(),
                        allUserView.getTfEmail().getText(),
                        allUserView.getJcbRole().getSelectedItem() + "");
                reAllUserView();
                allUserView.getBtnEdit().setEnabled(true);
                allUserView.getBtnDel().setEnabled(true);
                allUserView.getBtnAdd().setEnabled(true);
                allUserView.getBtnCancel().setVisible(false);
                allUserView.getBtnSave().setVisible(false);
            }

        }
//        Cancel User
        if (e.getSource().equals(allUserView.getBtnCancel())) {
            allUserView.getBtnEdit().setEnabled(true);
            allUserView.getBtnDel().setEnabled(true);
            allUserView.getBtnAdd().setEnabled(true);
            allUserView.getBtnCancel().setVisible(false);
            allUserView.getBtnSave().setVisible(false);
            allUserView.getBtnEdit().setEnabled(false);
            allUserView.getBtnDel().setEnabled(false);
            allUserView.getTfId().setText("");
            allUserView.getTfUsername().setText("");
            allUserView.getTfPassword().setText("");
            allUserView.getTfFullname().setText("");
            allUserView.getTfEmail().setText("");
            allUserView.getJcbRole().setSelectedIndex(0);
        }
//        Add User
        if (e.getSource().equals(allUserView.getBtnAdd())) {
            allUserView.getTfId().setText(String.valueOf(lastUserId + 1));
            allUserView.getTfUsername().setText("");
            allUserView.getTfPassword().setText("");
            allUserView.getTfFullname().setText("");
            allUserView.getTfEmail().setText("");
            allUserView.getJcbRole().setSelectedIndex(0);
            allUserView.getBtnEdit().setEnabled(false);
            allUserView.getBtnDel().setEnabled(false);
            allUserView.getBtnAdd().setEnabled(false);
            allUserView.getBtnCancel().setVisible(true);
            allUserView.getBtnSave().setVisible(true);
            allUserView.getBtnEdit().setEnabled(false);
            allUserView.getBtnDel().setEnabled(false);
            reAllUserView();
        }
//        Register Login View
        if (e.getSource().equals(loginView.getBtnReg())) {
            loginView.setVisible(false);
            regView.setVisible(true);
            regView.setLocationRelativeTo(null);
        }
//        Submit Register View
        if (e.getSource().equals(regView.getBtnReg())) {
            String username = regView.getTfUsername().getText();
            String password = regView.getTfPassword().getText();
            String fullname = regView.getTfFirstname().getText() + " " + regView.getTfLastname().getText();
            String email = regView.getTfEmail().getText();
            String findSql = "SELECT userName, userPassword FROM user WHERE userName = '" + username + "' OR userEmail = '" + email + "'";
            String insertSql = "INSERT INTO user (userName, userPassword, userFullname, UserEmail, userRole) VALUES (?, ?, ?, ?, ?)";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next() == true) {
                    JOptionPane.showMessageDialog(null, "Already User Or Email", "Duplicate Information", JOptionPane.WARNING_MESSAGE);
                } //                  Valid input check By toenTeen
                else if ("".equals(username) || "".equals(password) || "".equals(fullname) || "".equals(email)) {
                    JOptionPane.showMessageDialog(null, "Empty Informatin !!", "Empty Information", JOptionPane.WARNING_MESSAGE);
                } else if (!regView.getTfEmail().getText().contains("@")) {
                    JOptionPane.showMessageDialog(null, "Invalid Email Information !!", "Invalid Email", JOptionPane.WARNING_MESSAGE);
                } else {
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
        if (e.getSource().equals(allQuizView.getBtnCourse())) {  //แก้เปิดหน้าซ้อน
            allQuizView.dispose();
            /*reAdminMainView();
            adminMainView.setVisible(true);*/
        }
//        Login

        if (e.getSource().equals(adminMainView.getBtnCourse())) {
            reAdminMainView();
            adminMainView.repaint();
            adminMainView.setVisible(true);
        }
        if (e.getSource().equals(mainView.getBtnCourse())) {
            reMainView();
        }
        if (e.getSource().equals(courseView.getBtnCourse())) {
            courseView.setVisible(false);
            if (userRoleCurrent.equals("Admin")) {
                adminMainView.setVisible(true);
                adminMainView.setLocationRelativeTo(null);
            } else {
                mainView.setVisible(true);
                mainView.setLocationRelativeTo(null);
            }
        }
//        Add Quiz
        if (e.getSource().equals(allQuizView.getBtnAddQuiz())) {
//            allQuizView.setEnabled(false);
            addQuizView.setVisible(true);
            addQuizView.setLocationRelativeTo(null);
        }
        if (e.getSource().equals(courseView.getBtnAllQuiz())) {
            if (userRoleCurrent.equals("Admin")) {
                allQuizView.setVisible(true);
                allQuizView.setLocationRelativeTo(null);
                courseView.setVisible(false);
                allQuizView.getLbUsername().setText(userNameCurrent);
                scoreView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
                scoreView.getLbUserName().setText(userNameCurrent);
                reAdminQuiz();
            } else {
                quizView.setVisible(true);
                quizView.setLocationRelativeTo(null);
                courseView.setVisible(false);
                quizView.getLbUserName().setText(userNameCurrent);
                quizView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
                scoreView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
                scoreView.getLbUserName().setText(userNameCurrent);
                reQuiz();
            }

        }
//        Add Quiz
        if (e.getSource().equals(addQuizView.getBtnSave1())) {
            courseModel.load(quizModel);
            Choice quiz = new Choice(course.get(courseIndexCurrent).getQuiz().size() + 1,
                    addQuizView.getTfQuestion1().getText(),
                    addQuizView.getTfChoiceA().getText(),
                    addQuizView.getTfChoiceB().getText(),
                    addQuizView.getTfChoiceC().getText(),
                    addQuizView.getTfChoiceD().getText(),
                    addQuizView.getBtngChoice().getSelection().getActionCommand(),
                    "Choice");
            course.get(courseIndexCurrent).getQuiz().add(quiz);
            quizModel.saveData(courseIdCurrent, course.get(courseIndexCurrent).getQuiz());
        }
        if (e.getSource().equals(addQuizView.getBtnSave2())) {
            courseModel.load(quizModel);
            String answer = "";
            if (addQuizView.getCbMCA().isSelected()) {
                answer += "A";
            }
            if (addQuizView.getCbMCB().isSelected()) {
                answer += "B";
            }
            if (addQuizView.getCbMCC().isSelected()) {
                answer += "C";
            }
            if (addQuizView.getCbMCD().isSelected()) {
                answer += "D";
            }
            if (answer.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Select at least one Answer");
            } else {
                MultipleChoice quiz = new MultipleChoice(course.get(courseIndexCurrent).getQuiz().size() + 1,
                        addQuizView.getTfQuestion2().getText(),
                        addQuizView.getMultiChoiceA().getText(),
                        addQuizView.getMultiChoiceB().getText(),
                        addQuizView.getMultiChoiceC().getText(),
                        addQuizView.getMultiChoiceD().getText(),
                        answer,
                        "MultipleChoice");
                course.get(courseIndexCurrent).getQuiz().add(quiz);
                quizModel.saveData(courseIdCurrent, course.get(courseIndexCurrent).getQuiz());
            }

        }
        if (e.getSource().equals(addQuizView.getBtnSave3())) {
            if (!addQuizView.getTfAnswer().getText().equals("") && (!addQuizView.getTfQuestion3().getText().equals(""))) {
                courseModel.load(quizModel);
                FillAnswer quiz = new FillAnswer(course.get(courseIndexCurrent).getQuiz().size() + 1,
                        addQuizView.getTfQuestion3().getText(),
                        addQuizView.getTfAnswer().getText(),
                        "FillAnswer");
                course.get(courseIndexCurrent).getQuiz().add(quiz);
                quizModel.saveData(courseIdCurrent, course.get(courseIndexCurrent).getQuiz());
            } else {
                JOptionPane.showMessageDialog(null, "Please input Question and Answer");
            }

        }
        if (e.getSource().equals(addQuizView.getBtnSave1())
                || e.getSource().equals(addQuizView.getBtnSave2())
                || e.getSource().equals(addQuizView.getBtnSave3())) {
            addQuizView.setVisible(false);
            allQuizView.setEnabled(true);
            reAdminQuiz();
        }
//        submitted
        if (e.getSource().equals(quizView.getBtnSubmit())) {
            ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
            double score = 0.0;
            int error = 0;
            for (int i = 0; i < allQuiz.size(); i++) {
                String correct = allQuiz.get(i).getAnswer();
                if (allQuiz.get(i).getType().equals("Choice")) {
                    try {
                        if (correct.equals(((ChoiceView) cardQuiz.getCardQuiz().get(i)).getButtonGroup1().getSelection().getActionCommand())) {
                            score += course.get(courseIndexCurrent).getCourseScore() * 1.0 / allQuiz.size();
                        }
                    } catch (NullPointerException ne) {
                        error = 1;
                    }

                }
                if (allQuiz.get(i).getType().equals("MultipleChoice")) {
                    String answer = "";
                    if (((MultiChoiceView) cardQuiz.getCardQuiz().get(i)).getCbA().isSelected()) {
                        answer += "A";
                    }
                    if (((MultiChoiceView) cardQuiz.getCardQuiz().get(i)).getCbB().isSelected()) {
                        answer += "B";
                    }
                    if (((MultiChoiceView) cardQuiz.getCardQuiz().get(i)).getCbC().isSelected()) {
                        answer += "C";
                    }
                    if (((MultiChoiceView) cardQuiz.getCardQuiz().get(i)).getCbD().isSelected()) {
                        answer += "D";
                    }
                    if (correct.equals(answer)) {
                        score += course.get(courseIndexCurrent).getCourseScore() * 1.0 / allQuiz.size();
                    }
                    if (answer.equals("")) {
                        error = 1;
                    }
                }
                if (allQuiz.get(i).getType().equals("FillAnswer")) {
                    if (correct.equals(((FillAnswerView) cardQuiz.getCardQuiz().get(i)).getTfAnswer().getText())) {
                        score += course.get(courseIndexCurrent).getCourseScore() * 1.0 / allQuiz.size();
                    }
                }

            }
            //                    Send To Submitted 
            if (error == 0) {
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
                String formattedDateTime = currentDateTime.format(formatter);
                Submitted sendSubmit = new Submitted(userNameCurrent, (int) Math.round(score), formattedDateTime);
                submittedModel.loadData(courseIdCurrent);
                submitted = submittedModel.getSubmitted();
                submitted.add(sendSubmit);
                submittedModel.saveData(courseIdCurrent, submitted);
                JOptionPane.showMessageDialog(null,
                        "Your Score Is " + (int) Math.round(score) + "/" + course.get(courseIndexCurrent).getCourseScore() + "\nPercentage " + (int) Math.round(score) * 100 / course.get(courseIndexCurrent).getCourseScore() + "%",
                        "Your Score",
                        JOptionPane.INFORMATION_MESSAGE);
                quizView.setVisible(false);
                courseView.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please input All Question");
            }

        }
        if (e.getSource().equals(quizView.getBtnCourse())) {
            quizView.dispose();
            courseView.setVisible(true);
        }
        if (e.getSource().equals(courseView.getBtnCourseScore())) {
            scoreView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
            scoreView.getLbUserName().setText(userNameCurrent);
            courseView.setVisible(false);
            scoreView.setVisible(true);
            while (scoreView.getTableModel().getRowCount() > 0) {
                scoreView.getTableModel().removeRow(0);
            }
            scoreView.getTbScore().repaint();
            submittedModel.loadData(courseIdCurrent);
            scoreView.getTbScore().setModel(scoreView.getTableModel());
            submitted = submittedModel.getSubmitted();
            for (int i = 0; i < submitted.size(); i++) {
                Object[] objs = {submitted.get(i).getName(), (int) Math.round(submitted.get(i).getScore()), submitted.get(i).getDate()};
                scoreView.getTableModel().addRow(objs);
            }
            scoreView.setVisible(true);

        }
        if (e.getSource().equals(scoreView.getBtnCourse())) {
            scoreView.setVisible(false);
            courseView.setVisible(true);
        }
        if (e.getSource().equals(adminMainView.getBtnUser())) {
            allUserView.getBtnAdd().setEnabled(true);
            allUserView.setVisible(true);
            adminModel.load();
            reAllUserView();
            allUserView.getBtnCancel().setVisible(false);
            allUserView.getBtnSave().setVisible(false);
        }
//        del User

        if (e.getSource().equals(allUserView.getBtnDel())) {
            if (allUserView.getJcbRole().getSelectedItem().equals("Admin")) {
                int j = JOptionPane.showConfirmDialog(null, "Are you sure to delete this course", "choose one", JOptionPane.YES_NO_OPTION);
                if (j == 0) {
                    adminModel.delete(Integer.parseInt(allUserView.getTfId().getText()));
                    allUserView.getBtnDel().setEnabled(false);
                    allUserView.getBtnEdit().setEnabled(false);
                }
            } else if (allUserView.getJcbRole().getSelectedItem().equals("Student")) {
                int j = JOptionPane.showConfirmDialog(null, "Are you sure to delete this course", "choose one", JOptionPane.YES_NO_OPTION);
                if (j == 0) {
                    studentModel.delete(Integer.parseInt(allUserView.getTfId().getText()));
                    allUserView.getBtnDel().setEnabled(false);
                    allUserView.getBtnEdit().setEnabled(false);
                }
            }
            reAllUserView();
        }
//        Edit
        if (e.getSource().equals(allUserView.getBtnEdit())) {
            if (allUserView.getJcbRole().getSelectedItem().equals("Admin")) {
                int j = JOptionPane.showConfirmDialog(null, "Are you sure to Edit this course", "Are You Sure?", JOptionPane.YES_NO_OPTION);
                if (j == 0) {
                    adminModel.edit(Integer.parseInt(allUserView.getTfId().getText()),
                            allUserView.getTfUsername().getText(),
                            allUserView.getTfPassword().getText(),
                            allUserView.getTfFullname().getText(),
                            allUserView.getTfEmail().getText(),
                            allUserView.getJcbRole().getSelectedItem() + "");
                }
                reAllUserView();
            } else if (allUserView.getJcbRole().getSelectedItem().equals("Student")) {
                int j = JOptionPane.showConfirmDialog(null, "Are you sure to Edit this course", "choose one", JOptionPane.YES_NO_OPTION);
                if (j == 0) {
                    studentModel.edit(Integer.parseInt(allUserView.getTfId().getText()),
                            allUserView.getTfUsername().getText(),
                            allUserView.getTfPassword().getText(),
                            allUserView.getTfFullname().getText(),
                            allUserView.getTfEmail().getText(),
                            allUserView.getJcbRole().getSelectedItem() + "");
                }
                reAllUserView();
            }
        }
        if (e.getSource().equals(loginView.getBtnForgot())) {
            rePasswordView.getTfEmail().setText("");
            rePasswordView.getTfFullname().setText("");
            rePasswordView.getTfUsername().setText("");
            rePasswordView.setVisible(true);
        }
        if (e.getSource().equals(rePasswordView.getBtnSubmit())) {
            String username = rePasswordView.getTfUsername().getText();
            String email = rePasswordView.getTfEmail().getText();
            String fullname = rePasswordView.getTfFullname().getText();
            String selectSql = "SELECT userName, userEmail, userFullname, userPassword FROM user WHERE userName=? AND userEmail=? AND userFullname=?";
            try {
                pst = con.prepareStatement(selectSql);
                pst.setString(1, username);
                pst.setString(2, email);
                pst.setString(3, fullname);
                rs = pst.executeQuery();
                if (rs.next()) {
                    sendEmail.sendEmail(rs.getString("userEmail"), rs.getString("userPassword"));
                    JOptionPane.showMessageDialog(null, "Your password send to your email Please Check your email", "", JOptionPane.INFORMATION_MESSAGE);
                    rePasswordView.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Not found user Please Check Username Fullname and Email", "", JOptionPane.ERROR_MESSAGE);
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
        if (!regView.getTfEmail().getText().contains("@")) {
            regView.getLbEmail().setText("Email Invalid");
        } else {
            regView.getLbEmail().setText("");
        }
    }
//    windowevent

    @Override
    public void windowOpened(WindowEvent we) {

        if (we.getSource().equals(allQuizView)) {
            reAdminQuiz();
        }

        if (we.getSource().equals(mainView)) {
            reMainView();
        }
        if (we.getSource().equals(adminMainView)) {
            reAdminMainView();
            adminMainView.repaint();
            adminMainView.setVisible(true);
        }

    }

    @Override
    public void windowClosing(WindowEvent we) {

    }

    @Override
    public void windowClosed(WindowEvent we) {
        if (we.getSource().equals(mainView)) {
            loginView.setVisible(true);
        }
        if (we.getSource().equals(addCourseView)) {
            adminMainView.setEnabled(true);
        }
        if (we.getSource().equals(addQuizView)) {
            allQuizView.setEnabled(true);
        }
        if (we.getSource().equals(regView)) {
            loginView.setVisible(true);
        }
        if (we.getSource().equals(adminMainView)) {
            adminMainView.dispose();
            loginView.setVisible(true);
            loginView.getTfUserPassword().setText("");
            allUserView.dispose();
            addCourseView.dispose();
        }
        if (we.getSource().equals(courseView)) {
            System.out.println("CourseView Close");
            if (userRoleCurrent.equals("Admin")) {
                adminMainView.setVisible(true);
            } else {
                mainView.setVisible(true);
            }
        }
        if (we.getSource().equals(scoreView)) {
            scoreView.dispose();
            courseView.setVisible(true);
        }
        if (we.getSource().equals(quizView)) {
            quizView.dispose();
            courseView.setVisible(true);
        }
        if (we.getSource().equals(allQuizView)) {
            allQuizView.dispose();
            courseView.setVisible(true);
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
        if (me.getSource().equals(courseView.getLbAllQuiz())) {
            if (userRoleCurrent.equals("Admin")) {
                allQuizView.setVisible(true);
                allQuizView.setLocationRelativeTo(null);
                courseView.setVisible(false);
                allQuizView.getLbUsername().setText(userNameCurrent);
                scoreView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
                scoreView.getLbUserName().setText(userNameCurrent);
                reAdminQuiz();
            } else {
                quizView.setVisible(true);
                quizView.setLocationRelativeTo(null);
                courseView.setVisible(false);
                quizView.getLbUserName().setText(userNameCurrent);
                quizView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
                scoreView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
                scoreView.getLbUserName().setText(userNameCurrent);
                reQuiz();
            }
        }
        if (me.getSource().equals(courseView.getLbAttend())) {
            ArrayList<Submitted> submitted = submittedModel.loadData(courseIdCurrent);
            double allScore = 0;
            int highestScore = 0;
            int yourFirstScore = 0;
            int yourLastScore = 0;
            int count = 0;
            if (!submitted.isEmpty()) {
                for (Submitted i : submitted) {
                    allScore += i.getScore();
                    if (i.getScore() >= highestScore) {
                        highestScore = i.getScore();
                    }
                    if (i.getName().equals(userNameCurrent)) {
                        if (count == 0) {
                            yourFirstScore = i.getScore();
                        }
                        yourLastScore = i.getScore();
                        count++;
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "Your First Submit: " + yourFirstScore
                        + "\nYour Last Submit: " + yourLastScore
                        + "\nHighest Score: " + highestScore
                        + "\nAverage Score: " + allScore / submitted.size()
                        + "\nSubmitted Time: " + submitted.size(),
                        "All Score!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "It's no Submit yet.", "Can't Find Score", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (me.getSource().equals(courseView.getLbCourseScore())) {
            submittedModel.loadData(courseIdCurrent);
            ArrayList<Submitted> submitted = submittedModel.loadData(courseIdCurrent);
            scoreView.getLbCourseName().setText(course.get(courseIndexCurrent).getCourseName());
            scoreView.getLbUserName().setText(userNameCurrent);
            courseView.setVisible(false);
            scoreView.setVisible(true);
            while (scoreView.getTableModel().getRowCount() > 0) {
                scoreView.getTableModel().removeRow(0);
            }
            scoreView.getTbScore().repaint();
            submittedModel.loadData(courseIdCurrent);
            scoreView.getTbScore().setModel(scoreView.getTableModel());
            submitted = submittedModel.getSubmitted();
            for (int i = 0; i < submitted.size(); i++) {
                Object[] objs = {submitted.get(i).getName(), (int) Math.round(submitted.get(i).getScore()), submitted.get(i).getDate()};
                scoreView.getTableModel().addRow(objs);
            }
            scoreView.setVisible(true);
        }
        if (me.getSource().equals(loginView.getBtnLogin())) {
            String username = loginView.getTfUsername().getText();
            String userPassWord = loginView.getTfUserPassword().getText();
            String findSql = "SELECT userName, userPassword, userRole FROM user WHERE userName = '" + username + "' AND userPassword = '" + userPassWord + "'";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    adminMainView.getLbUsername().setText(rs.getString("userName"));
                    mainView.getLbUsername().setText(rs.getString("userName"));
                    this.userNameCurrent = rs.getString("userName");
                    if (rs.getString("userRole").equals("Admin")) {
                        loginView.setVisible(false);
                        adminMainView.setVisible(true);
                        adminMainView.setLocationRelativeTo(null);
                        this.userRoleCurrent = "Admin";
                        reAdminMainView();
                    } else {
                        loginView.setVisible(false);
                        mainView.setVisible(true);
                        mainView.setLocationRelativeTo(null);
                        this.userRoleCurrent = "Student";
                        reMainView();
                    }
                } else {
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
