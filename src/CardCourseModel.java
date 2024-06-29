
import java.util.ArrayList;
public class CardCourseModel {
    private ArrayList<CardCourseView> cardCourse;
    public CardCourseModel(){
        cardCourse = new ArrayList<CardCourseView>();
    }
    public ArrayList<CardCourseView> getCardCourse(){
        return cardCourse;
    }
}
