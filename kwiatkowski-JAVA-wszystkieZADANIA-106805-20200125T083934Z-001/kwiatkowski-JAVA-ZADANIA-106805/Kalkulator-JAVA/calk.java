package Kalkulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

  public static void main(String[] args) throws IOException {
	 System.out.println("Kalkulator obsługuje operacje: dodawania(+), odejmowania(-), mnozenia(*) oraz dzielenia(/).\n");
    Calculator calculator = new Calculator();

    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Podaj pierwsza liczbe: ");
    String aValue = consoleReader.readLine();
    double a = Double.parseDouble(aValue);

    System.out.println("Podaj druga liczbe: ");
    String bValue = consoleReader.readLine();
    double b = Double.parseDouble(bValue);

    System.out.println("Podaj operacje:");
    String operation = consoleReader.readLine();

    if ("+".equals(operation)) {
      System.out.println("Rezultat: " + calculator.sum(a, b));
    } else if ("-".equals(operation)) {
      System.out.println("Rezultat: " + calculator.subtract(a, b));
    } else if ("*".equals(operation)) {
      System.out.println("Rezultat: " + calculator.multiply(a, b));
    } else if ("/".equals(operation)) {
      System.out.println("Rezultat: " + calculator.divide(a, b));
    }
  }


  private double sum(double a, double b) {
    return a + b;
  }

  private double subtract(double a, double b) {
    return a - b;
  }

  private double multiply(double a, double b) {
    return a * b;
  }

  private double divide(double a, double b) {
    return a / b;
  }
}