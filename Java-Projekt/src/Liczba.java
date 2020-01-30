package uksw;

public class Liczba implements Comparable<Liczba>{
    public boolean ujemna = false;
    public boolean pierwsza = false;
    public int value;

    @Override
    public int compareTo(Liczba liczba) {
        return liczba.value < this.value ? 1 :(liczba.value > this.value ? -1 : 0);
    }
}