package ProyectoFinalABSI;

public class Main {
    public static void main(String[] args) {
        Vehicle myElectricCar = new ElectricCar(5, "BYD", 2002, Color.PLATA);
        myElectricCar.encender();
        myElectricCar.apagar();

        ((ElectricCar)myElectricCar).chargeBattery();
    }
}
