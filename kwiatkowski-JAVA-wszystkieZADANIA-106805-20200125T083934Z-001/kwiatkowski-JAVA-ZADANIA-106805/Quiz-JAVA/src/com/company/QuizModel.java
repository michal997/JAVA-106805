package com.company;

public class QuizModel {
    public String question;
    public String answerA;
    public String answerB;
    public String answerC;
    public String answerD;
    public char rightAnswer;
    public char userAnswer;
    public int questionNumber;

    QuizModel(String question , String answerA , String answerB ,
              String answerC , String answerD , char rightAnswer , int questionNumber){
        this.answerA = answerA;
        this.question = question;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.rightAnswer =rightAnswer;
        this.questionNumber =questionNumber;
    }
}
