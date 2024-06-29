
import java.io.Serializable;

public class Quiz implements Serializable{
    private int No;
    private String Question;
    private String Answer;
    private String Type;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
    
}
