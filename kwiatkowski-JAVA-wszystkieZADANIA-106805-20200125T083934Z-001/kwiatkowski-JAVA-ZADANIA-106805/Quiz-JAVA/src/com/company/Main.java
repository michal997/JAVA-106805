package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witamy w quizie ! ");
        QuizData data = new QuizData();
        int wynik = 0;
       for(QuizModel a : data.list){
           System.out.println("Pytanie numer : " + a.questionNumber);
           System.out.println(a.question);
           System.out.println("a): " + a.answerA);
           System.out.println("b): " + a.answerB);
           System.out.println("c): " + a.answerC);
           System.out.println("d): " + a.answerD);
           Scaner scan = new Scaner();
           char answer = scan.Answer();
           if(answer == 'q'){
               System.out.println("Przedwczesne zakończenie programu ! Twój wynik to : " + wynik);
               return;
           }
           System.out.println(a.rightAnswer);
           if(answer == a.rightAnswer){
               System.out.println("Dobra odpowiedź !");
               wynik++;
           }
           else{
               System.out.println("Zła odpowiedź !");
           }
           System.out.println("Twój wynik to : " + wynik);

           if(a.questionNumber != data.list.size()) {
               System.out.println("Jeśli chcesz zakończyć działanie programu podaj jako odpowiedź q");
           }

           if(a.questionNumber == data.list.size()){
               System.out.println("Koniec Quizu twój wynik to : " + wynik);
               return ;
           }
       }
    }
}
