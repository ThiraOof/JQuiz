
public class Choice extends Quiz{
    private String ChoiceA, ChoiceB, ChoiceC, ChoiceD;
    public Choice(){
        this(0, "", "", "", "", "", "", "Choice");
    }
    public Choice(int No, String Question, String ChoiceA, String ChoiceB, String ChoiceC, String ChoiceD, String Answer, String Type){
        setNo(No);
        setQuestion(Question);
        setChoiceA(ChoiceA);
        setChoiceB(ChoiceB);
        setChoiceC(ChoiceC);
        setChoiceD(ChoiceD);
        setAnswer(Answer);
        setType("Choice");
    }

    public String getChoiceA() {
        return ChoiceA;
    }

    public void setChoiceA(String ChoiceA) {
        this.ChoiceA = ChoiceA;
    }

    public String getChoiceB() {
        return ChoiceB;
    }

    public void setChoiceB(String ChoiceB) {
        this.ChoiceB = ChoiceB;
    }

    public String getChoiceC() {
        return ChoiceC;
    }

    public void setChoiceC(String ChoiceC) {
        this.ChoiceC = ChoiceC;
    }

    public String getChoiceD() {
        return ChoiceD;
    }

    public void setChoiceD(String ChoiceD) {
        this.ChoiceD = ChoiceD;
    }
    
}
