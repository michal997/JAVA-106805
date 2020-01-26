package Car;

public class Saab extends Car {
    private String _type;

    public Saab(String name, int power , String type) {
        super(name, power);

        this._type = type;
    }

    @Override
    public void ChangeNameOfCar(String newName) {
        System.out.println("Zmiana nazwy Saaba " + newName);
        QuickMerc();
        super.ChangeNameOfCar(newName);
    }

    private void QuickMerc(){
        System.out.println("Fast Saab");
    }
}
