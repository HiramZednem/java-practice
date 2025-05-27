package bucles;

public class Bucle {
    public static void main(String[] args) {

        final byte MAX_COUNT = 5;
        for(byte currentNumber = 0; currentNumber < MAX_COUNT; currentNumber++){
            System.out.println("Hola soy el numero: " + currentNumber);
        }

        byte counter = 0;
        while (counter < 10) {
            System.out.println("Conter: " + counter);
            counter++;
        }

        do {
            System.out.println("Al menos me ejecuto una vez");
            System.out.println(counter);
        } while (counter == 0);
    }
}
