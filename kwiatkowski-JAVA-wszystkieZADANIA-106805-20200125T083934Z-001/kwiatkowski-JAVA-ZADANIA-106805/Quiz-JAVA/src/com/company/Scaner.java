package com.company;

import java.util.Scanner;

public class Scaner {

    public char Answer() {
        System.out.println("Podaj odpowiedz : (a , b , c , d ) - pojedyncze znaki !");
        Scanner scan = new Scanner(System.in);
        char answer = scan.next().charAt(0);
        return answer;
    }
}
