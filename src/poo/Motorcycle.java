package poo;

public class Motorcycle extends Vehicle{
    private boolean hasSideCard;

    public Motorcycle(String brand, String model, int year, boolean hasSideCard) {
        super(brand, model, year);
        this.hasSideCard = hasSideCard;
    }

    public void doWheelie() {
        System.out.println("La moto esta haciendo caballito");
    }
}
