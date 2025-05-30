package poo;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("El carro esta encendido");
    }

    public void openDoor() {
        System.out.println("Abriendo puerto");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}' + super.toString();
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
