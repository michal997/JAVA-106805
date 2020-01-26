package Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Początek programu");
             Student student = new Student(18 , "Mateusz");
        System.out.println("Imie studenta to " + student.GetName());
             student.SetName("Adrian");
        System.out.println("Imie studenta to " + student.GetName());
        Teacher teacher = new Teacher(30 , "Jerzy" , "537-323-955");
        System.out.println("Kontakt nauczyciela to " + teacher.GetContactNumber());
        System.out.println("Imie nauczyciela to " + teacher.GetName());
        teacher.SetName("Marzena");
        System.out.println("Imie nauczyciela to " + teacher.GetName());
        //ustawiam wiek nauczyciela
        teacher.SetAge(100);
    }
}
