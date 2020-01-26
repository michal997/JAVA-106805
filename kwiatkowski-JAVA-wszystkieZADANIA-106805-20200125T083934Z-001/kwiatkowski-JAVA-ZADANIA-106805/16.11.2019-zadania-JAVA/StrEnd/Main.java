package StrEnd;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

for(;;) {
    System.out.println("Wpisuj parametry (na końcu zostaną wyświetlone) , aby zakończyc etap wpisywania -> wpisz 'end' ");
    Scanner scanner = new Scanner(System. in);
    String input = scanner. nextLine();
    System.out.println("Wpisałeś następujący parametr: " + input + " ");
    if(input.equals("end")){
        System.out.println("Koniec programu - wpisałeś end");
        return;
    }
}
    }
}
