package Figure;

public class Square extends Figure implements Resetable {
    Square(int numberOfSides) {
        super(numberOfSides);

        System.out.println("Klasa kwadrat");
    }

    public void resetAllAttributes() {
        System.out.println("Resetujemy wszystko !");
        super.Reset();
    }
}
