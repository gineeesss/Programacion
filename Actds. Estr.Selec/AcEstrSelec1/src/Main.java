/*
 * Nombre del Programa: Ejercicio 1 Estreucturas Seleccion
 * Autor: Gines GS
 * Fecha de Creación: 9 de Octubre de 2023
 * Descripción: Este programa responde con un caso que corresponde a dias diferentes de la semana, segun el dia que se inserte.
 *              En caso de que no exista un dia muestra un mensaje de error y se cierra el programa
 * Versión 1º--> Esta version tiene un modulo reiterativo que en caso de introducir un valor fuera del intervalo, se vuelve a inciar
 * Versión 2º--> Esta es la versión base que se ajusta con el temario de clase.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Pregunta(scr);
    }
    public static void Pregunta(Scanner scr){
        System.out.print("Introduce dia de la semana para conocer su primera asignatura \n[1.Lunes 2.Martes 3.Miercoles 4.Jueves 5.Viernes]:");
        int dia = scr.nextInt();
        switch (dia){
            case 1:
                System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es BBDD",dia);
                break;
            case 2:
                System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es SSII",dia);
                break;
            case 3:
                System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es BBDD",dia);
                break;
            case 4:
                System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es SSII",dia);
                break;
            case 5:
                System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es BBDD",dia);
                break;
            default:
                System.out.println("Por favor introduce un numero entre el [1,5]\n");
                Pregunta(scr);
    }
    }
}



/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
        System.out.print("Introduce dia de la semana para conocer su primera asignatura \n[1.Lunes 2.Martes 3.Miercoles 4.Jueves 5.Viernes]:");
    int dia = scr.nextInt();
    switch (dia){
        case 1:
            System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es BBDD",dia);
            break;
        case 2:
            System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es SSII",dia);
            break;
        case 3:
            System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es BBDD",dia);
            break;
        case 4:
            System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es SSII",dia);
            break;
        case 5:
            System.out.printf("\nEl día %d la Asinatura que se imparte a primera hora es BBDD",dia);
            break;
        default:
            System.out.println("Por favor introduce un numero entre el [1,5]");
    }
    }
}
 */