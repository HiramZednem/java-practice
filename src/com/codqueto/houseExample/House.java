package houseExample;

public class House {
    private int windows;
    private int doors;
    private double length;
    private double width;

    public House(int windows, int doors, double length, double width) {
        this.windows = windows;
        this.doors = doors;
        this.length = length;
        this.width = width;
    }

    public void openHouse() {
        System.out.println("The house was opened");
    }

    public double getArea() {
       return this.length * this.width;
    }
}

