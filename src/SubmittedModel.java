
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class SubmittedModel {
    private ArrayList<Submitted> submitted;
    public SubmittedModel(){
        submitted = new ArrayList<>();
    }
    public SubmittedModel(int courseId){
        submitted = new ArrayList<>();
        createSubmitted(courseId);
    }

    public ArrayList<Submitted> getSubmitted() {
        return submitted;
    }
    public void createSubmitted(int submittedId){
        File f = new File("submitted/"+submittedId+".JQuiz");
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(submitted);
        } catch (Exception i) {
            
        }
    }
    public ArrayList<Submitted> loadData(int submittedId){
        System.out.println("ID SUBMITTED " + submittedId);
        File f = new File("submitted/"+submittedId+".JQuiz");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f);
                ObjectInputStream in = new ObjectInputStream(fin);){
                submitted = (ArrayList<Submitted>) in.readObject();
                System.out.println("Load Data to " + submittedId + " Submitted");
                return submitted;
            } catch (Exception i) {
                System.out.println("NULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLlll");
                return null;
            }
        }
        return null;
    }
    public void deleteData(int submittedId){
        System.out.println(submittedId);
        File myObj = new File("submitted/"+submittedId+".JQuiz"); 
        if (myObj.delete()) {
            System.out.println("Delete File : Submitted " + submittedId);
        }
    }
    public boolean saveData(int submittedId, ArrayList<Submitted> submitted){
        File f = new File("submitted/"+submittedId+".JQuiz");
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(submitted);
            System.out.println("Save Quiz " +submittedId);
            return true;
        } catch (Exception i) {
            return false;
        }
    }
}
