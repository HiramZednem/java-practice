package AbsInterfaces;


public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void drive();

    public void start() {
        System.out.println("El vehiculo esta encendido");
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        final int currentYear = java.time.Year.now().getValue();
        if ( year < 1886 || year > currentYear + 2) {
            throw new IllegalArgumentException("Anio invalido");
        }

        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }
}
