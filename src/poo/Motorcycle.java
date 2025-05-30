package poo;

public class Motorcycle extends Vehicle{
    private boolean hasSideCard;

    public Motorcycle(String brand, String model, int year, boolean hasSideCard) {
        super(brand, model, year);
        this.hasSideCard = hasSideCard;
    }

    @Override
    public void start() {
        System.out.println("La moto esta encendida");
    }

    public void doWheelie() {
        System.out.println("La moto esta haciendo caballito");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSideCard=" + hasSideCard +
                '}' + super.toString();
    }
}
