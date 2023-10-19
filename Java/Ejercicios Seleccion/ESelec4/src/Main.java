import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Clasificacion(scr);
    }
    public static void Clasificacion(Scanner scr){

        System.out.print("Introducir Calificación:");
        float nota = scr.nextFloat();
        switch ((int) nota) {
            case 0:
                System.out.println("La nota es Insuficiente");
                break;
            case 1:
                System.out.println("La nota es Insuficiente");
                break;
            case 2:
                System.out.println("La nota es Insuficiente");
                break;
            case 3:
                System.out.println("La nota es Insuficiente");
                break;
            case 4:
                System.out.println("La nota es Insuficiente");
                break;
            case 5:
                System.out.println("La nota es Aprobado");
                break;
            case 6:
                System.out.println("La nota es Aprobado");
                break;
            case 7:
                System.out.println("La nota es Notable");
                break;
            case 8:
                System.out.println("La nota es Notable");
                break;
            case 9:
                System.out.println("La nota es Sobresaliente");
                break;
            case 10:
                System.out.println("La nota es Sobresaliente");
                break;
            default:
                System.out.println("Porfavor Introduce una nota entre en el rango [0,10]");
                Clasificacion(scr);
        }
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Introducir Calificación:");
        float nota = scr.nextFloat();
        switch ((int) nota) {
            case 0:
                System.out.println("La nota es Insuficiente");
                break;
            case 1:
                System.out.println("La nota es Insuficiente");
                break;
            case 2:
                System.out.println("La nota es Insuficiente");
                break;
            case 3:
                System.out.println("La nota es Insuficiente");
                break;
            case 4:
                System.out.println("La nota es Insuficiente");
                break;
            case 5:
                System.out.println("La nota es Aprobado");
                break;
            case 6:
                System.out.println("La nota es Aprobado");
                break;
            case 7:
                System.out.println("La nota es Notable");
                break;
            case 8:
                System.out.println("La nota es Notable");
                break;
            case 9:
                System.out.println("La nota es Sobresaliente");
                break;
            case 10:
                System.out.println("La nota es Sobresaliente");
                break;
            default:
        }
    }
}
 */