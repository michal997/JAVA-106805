package Car;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Mercedes samochodzik = new Saab("samochodSaab",1,"9-3");
        String nazwa = JOptionPane.showInputDialog("Podaj nową nazwe dla Saab ");
        samochodzik.ChangeNameOfCar(nazwa);
        samochodzik.UsePrivateFromAbstract();
    }
}
