/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */

public class FillAnswer extends Quiz{
    public FillAnswer(){
        this(0, "", "", "FillAnswer");
    }
    public FillAnswer(int No, String Question, String Answer, String Type){
        setNo(No);
        setQuestion(Question);
        setAnswer(Answer);
        setType("FillAnswer");
    }
}

