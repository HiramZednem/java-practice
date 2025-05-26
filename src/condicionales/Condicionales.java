package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        final byte edad = 10;

        if(edad <= 0) {
            System.out.println("Tu edad no es valida");
        } else if (edad > 18) {
            System.out.println("Eres mayor de edad");
        } else if ( edad == 18 ) {
            System.out.println("Tienes 18 anios");
        } else {
            System.out.println("eres menor de edad");
        }
    }
}
