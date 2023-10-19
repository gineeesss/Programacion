import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ComPar(scr);
    }
    public static void ComPar(Scanner scr) {
        System.out.print("\n \n \n Introduce numero:");
        float num = scr.nextFloat();
        if ((num % 1) == 0)
            if (num % 2 == 0) {
                System.out.printf("\nEl numero entero %d es Par", (int)num);
            } else {
                System.out.printf("\nEl numero entero %d es Impar", (int)num);
            }

        else {
            System.out.println("\n \n \n Numero decimal detectado, por favor intrudicir numero entero\n" +
                    "[PULSAR UNA TECLA + ENTER PARA CONTINUAR]");
            scr.next(); // hace una interacción más suave en la interfaz, haciendo una pausa en la recursion
            ComPar(scr);
        }
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Introduce numero:");
        Scanner scr = new Scanner(System.in);
        float num = scr.nextFloat();
        if ((num % 1) != 0)
            System.out.printf("Introduce un numero entero %f");
        else {
            if (num % 2 == 0) {
                System.out.printf("\nEl numero entero %d es Par", (int)num);
            } else System.out.printf("\nEl numero entero %d es Impar", (int)num);
        }
    }
}
*/