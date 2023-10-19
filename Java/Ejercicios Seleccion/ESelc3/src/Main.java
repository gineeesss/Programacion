/*
 * Nombre del Programa: Ejercicio 1 Estreucturas Seleccion
 * Autor: Gines GS
 * Fecha de Creación: 9 de Octubre de 2023
 * Descripción: Este programa dice si se está capacitado para trabajar a partir del numero (edad) introducido , primeramente comprueba
 * que está en un rango lógico de edades y en el caso de estarlo devuelve su situación, en caso de estar fuera el programa muestra un error
 * de fallo y se vuelve a inciar(1º Versión) o se cierra (2ºVersion)
 * Versión 1º--> Esta version tiene un modulo reiterativo que en caso de introducir un valor fuera del intervalo, se vuelve a inciar
 * Versión 2º--> Esta es la versión base que se ajusta con el temario de clase.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Edad(scr);
    }
    public static void Edad(Scanner scr){
        System.out.print("Intoducir edad:");
        float edad = scr.nextFloat();
        if(edad>=0 && edad<=120){
            if(edad>=18){
                System.out.println("Es mayor de edad");
            }
            else if(edad>=16 && edad<18){
                System.out.println("Es menor de edad pero con edad legal para trabajar");
            }
            else System.out.println("Es menor de edad y tampoco puede trabajar");
        }
        else {
            System.out.println("\nPor favor introduce una edad real\n");
            Edad(scr);
        }
        }
}

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Intoducir edad:");
        float edad = scr.nextFloat();
        if (edad >= 0 && edad <= 120) {
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else if (edad >= 16 && edad < 18) {
                System.out.println("Es menor de edad pero con edad legal para trabajar");
            } else System.out.println("Es menor de edad y tampoco puede trabajar");
        } else {
            System.out.println("\nPor favor introduce una edad real\n");
        }
    }
}
*/