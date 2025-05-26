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

        final byte day = 0;

        switch (day) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("No valido!!");
        }


        // Esto nunca lo habia pensado xd, hay una forma muy chida
        // de hacer que los condicionales sean mas facil de entender para otros desarrolladores...
        final byte grade = 4;
        final boolean isValid = grade >= 0 && grade <= 10;
        final boolean isApproved = grade >= 6;

        if ( isValid && isApproved ) {
            System.out.println("Has pasado");
        } else if (isValid) {
            System.out.println("No has pasado el curso");
        } else {
            System.out.println("nota no valida");
        }

    }
 }
