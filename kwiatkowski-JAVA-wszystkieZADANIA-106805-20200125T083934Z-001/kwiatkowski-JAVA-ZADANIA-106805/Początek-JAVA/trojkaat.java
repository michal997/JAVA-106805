import javax.swing.*;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        double a=Integer.parseInt(JOptionPane.showInputDialog("Podaj a: "));
        double b=Integer.parseInt(JOptionPane.showInputDialog("Podaj b: "));
        double c=Integer.parseInt(JOptionPane.showInputDialog("Podaj c: "));
        double h=Integer.parseInt(JOptionPane.showInputDialog("Podaj h: "));
        Trojkat trojkat = new Trojkat(a,b,c , h);

        System.out.print("Pole trójkąta: "+poletr(trojkat));
        System.out.println("Sprawdzamy czy trojkąt jest prostokątny.");
        CzyProstokatny(trojkat._a , trojkat._b , trojkat._c);

        double[]  array = new double[3];
        array[0] = trojkat._a;
        array[1] = trojkat._b;
        array[2] = trojkat._c;

        sortowanie(array);

        CzyRozwartokatny(trojkat._a,trojkat._b,trojkat._c);

        System.out.println("Koniec programu.");
    }
    static void CzyProstokatny(double a,double b , double c)
    {
        double ap = pow(a,2);
        double bp = pow(b,2);
        double cp = pow(c,2);

        double x = ap+bp;
        if(x!=cp) {
            System.out.println("Trojkat nie jest prostokatny");
        }
        else {
            System.out.println("Trojkat jest prostokatny");
        }
    }

    static void CzyRozwartokatny(double a,double b , double c)
    {
        double checkC = pow(c,2);
        double checkB = pow(b,2);
        double checkA = pow(a,2);

       double sum = checkB + checkA;
        if(checkC < sum) {
            System.out.println("Trojkat jest rozwartokatny.");
        }
        else {
            System.out.println("Trojkat nie jest rozwartokatny");
        }
    }
    static double poletr(Trojkat a)
    {
        double trojkatA = a._a;
        double trojkatB = a._b;
        double trojkatC = a._c;
        double wysokosc = a._h;
        if((trojkatA+trojkatB>trojkatC)&&(trojkatA+trojkatC>trojkatB)&&(trojkatB+trojkatC>trojkatA))
        {
            double p=((trojkatA+trojkatB+trojkatC)/2);
            return (double)Math.sqrt(p*(p-trojkatA)*(p-trojkatB)*(p-trojkatC));
        }else return 0;
    }

     static void sortowanie(double tab[]){
        double temp;
        double zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        System.out.println("Posortowane boki:");
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }
}