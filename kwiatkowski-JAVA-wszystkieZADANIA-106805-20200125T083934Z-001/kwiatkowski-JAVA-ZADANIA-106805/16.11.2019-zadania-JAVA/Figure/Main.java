package Figure;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       Square kwadrat = new Square(4);
       kwadrat.printSidesNumber();
       kwadrat.resetAllAttributes();
       kwadrat.printSidesNumber();
    }
}
