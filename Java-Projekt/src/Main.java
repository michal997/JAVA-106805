package uksw;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Liczba> naszaKolekcjaLiczb = new ArrayList<>();
        for (; ; ) {
            System.out.println("Wpisuj liczby , jeśli będziesz chciał skończyć to wpisz N");
            String choosedNumbers = JOptionPane.showInputDialog("Wybierz liczbę");
            String inputWithoutSpaces = choosedNumbers.replaceAll("\\s+", "");
            char[] inputAsCharArr = inputWithoutSpaces.toCharArray();

            if(inputAsCharArr[0] == 'N'){
                System.out.println("Koniec wpisywania");
                System.out.println("Oto posortowane wyniki:");

                Collections.sort(naszaKolekcjaLiczb);
                for(Liczba x : naszaKolekcjaLiczb){
                    if(x.ujemna){
                     System.out.println("Liczba ujemna | " + x.value);
                     continue;
                    }
                    if(x.pierwsza){
                        System.out.println("Liczba pierwsza | " + x.value);
                        continue;
                    }
                   System.out.println("Liczba dodatnia | " + x.value);
                }
                System.out.println("Koniec programu");

                return;
            }

            String inputPoWalidacji = Walidacja(inputAsCharArr);
            if(inputPoWalidacji == null){
                continue;
            }
            Liczba liczba = StworzLiczbe(inputPoWalidacji);
            naszaKolekcjaLiczb.add(liczba);
        }
    }

    public static String  Walidacja(char[] input) {
        ArrayList<Character> tempList = new ArrayList<Character>();
        boolean flag = false;
        boolean minus = false;

        if(input[0] == '-'){
            minus = true;
        }

        for (char ch : input) {
            if(minus){
                tempList.add(ch);
                minus = false;
                continue;
            }
            if (Character.isDigit(ch)) {
                tempList.add(ch);
            } else {
                System.out.println(ch + " to nie jest liczba! (wpis z tym znakiem zostanie pominięty!). Jeśli to minus to proszę go podać na początku następnym razem !");
                flag = true;
            }
            if (flag) {
                return null;
            }
        }

        return getStringRepresentation(tempList);
    }

    private static Liczba StworzLiczbe(String value){
        Liczba liczba = new Liczba();
        char[] characters = value.toCharArray();
        if(characters[0] == '-'){
            liczba.ujemna = true;
        }
        ArrayList<Character> temp = new ArrayList<>();
       for(char ch : characters){
           temp.add(ch);
       }
       liczba.value = Integer.parseInt(getStringRepresentation(temp));
       if(!liczba.ujemna)
       {
       int czyPierwsza = liczba.value;
       liczba.pierwsza = czy_pierwsza(czyPierwsza);
       }
       return liczba;
    }

    private static boolean czy_pierwsza(int n)
    {
        if(n<2){
            return false; //gdy liczba jest mniejsza niż 2 to nie jest pierwszą
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false; //gdy znajdziemy dzielnik, to dana liczba nie jest pierwsza
            }
        }
        return true;
    }

    public static String getStringRepresentation(ArrayList<Character> list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}