import java.io.Serializable;
public class Submitted implements Serializable{
    private String name;
    private int score;
    private String date;
    public Submitted(){
        this("", 0, "");
    }
    public Submitted(String name, int score, String date){
        this.name = name;
        this.score = score;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getDate() {
        return date;
    }
    
}
