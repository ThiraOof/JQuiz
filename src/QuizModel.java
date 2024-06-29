import java.util.*;
import java.io.*;

public class QuizModel{
    private ArrayList<Quiz> quiz;
    public QuizModel(){
        quiz = new ArrayList<Quiz>();
    }
    public QuizModel(int courseId){
        quiz = new ArrayList<Quiz>();
        createQuiz(courseId);
    }
    public void createQuiz(int quizId){
        File f = new File("quiz/"+quizId+".JQuiz");
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(quiz);
        } catch (Exception i) {
        }
    }
    public ArrayList<Quiz> loadData(int quizId){
        File f = new File("quiz/"+quizId+".JQuiz");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f);
                ObjectInputStream in = new ObjectInputStream(fin);){
                quiz = (ArrayList<Quiz>) in.readObject();
//                System.out.println("Load Data to" + quizId + " Quiz");
                return quiz;
            } catch (Exception i) {
                return null;
            }
        }
        return null;
    }
    public void deleteData(int quizId){
//        System.out.println(quizId);
        File myObj = new File("quiz/"+quizId+".JQuiz"); 
        if (myObj.delete()) {
//          System.out.println("Deleted the file: " + myObj.getName());
        }
    }
//    young miatongcum
    public boolean saveData(int quizId, ArrayList<Quiz> quiz){
        File f = new File("quiz/"+quizId+".JQuiz");
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(quiz);
//            System.out.println("Save Quiz " +quizId);
            return true;
        } catch (Exception i) {
            return false;
        }
    }
    
    public ArrayList<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Quiz> quiz) {
        this.quiz = quiz;
    }
    
    
}
