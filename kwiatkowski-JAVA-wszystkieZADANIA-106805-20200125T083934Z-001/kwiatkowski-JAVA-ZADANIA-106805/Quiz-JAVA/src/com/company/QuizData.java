package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizData {
    List<QuizModel> list;
    QuizData(){
        list = new ArrayList<QuizModel>();
        CreateData();
    }

    public void CreateData() {
        File file =
                new File("C:\\Users\\michal.kwiatkowski\\IdeaProjects\\JAVA-Quiz-107121-Michal-Kwiatkowski\\src\\com\\company\\quiz.txt");
        Scanner sc;

        {
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("Brak takiego pliku ze ścieżką " + e.getLocalizedMessage());
                System.out.println("Koniec programu");
                return;
            }
        }
         int count = 0;
        while (sc.hasNextLine()) {
            count++;
            String line = sc.nextLine();
            String[] lineArray = line.split("\\|");
            if(lineArray.length != 6){
                System.out.println("Nie uzupełniłeś wszystkich opcji w linii " + count);
                System.out.println("Koniec programu ! Popraw plik tekstowy z którego jest wczytywana treść quizu");
                return;
            }
                QuizModel question = new QuizModel(lineArray[0],lineArray[1],lineArray[2],lineArray[3],lineArray[4],lineArray[5].charAt(0),count);
                list.add(question);
        }

    }
}
