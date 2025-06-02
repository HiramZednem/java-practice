package AbsInterfaces;

public class ElectricCar extends Vehicle implements Electric{
    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void chargeBattery() {
        System.out.println("Cargando el vehiculo");
    }

    @Override
    public void drive() {
        System.out.println("Manejando el vehiculo`");

    }
}
