package poo;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    public void openDoor() {
        System.out.println("Abriendo puerto");
    }
}
