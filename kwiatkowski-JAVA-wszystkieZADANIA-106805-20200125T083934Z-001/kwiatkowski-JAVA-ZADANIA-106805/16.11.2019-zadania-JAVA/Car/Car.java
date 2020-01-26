package Car;

public abstract class Car {
    private String _name;
    public int _power;

    public Car(String name , int power ){
             this._name = name;
             this._power = power;
    }

    private void PrintSmthAbstract(){
        System.out.println("Wywolanie z metody prywatnej z klasy abstrakcyjnej");
    }

    public void UsePrivateFromAbstract(){
        PrintSmthAbstract();
    }

    public void ChangeNameOfCar(String newName){
        this._name = newName;
        System.out.println("Zmieniełeś nazwa na " + newName);
    }
}
