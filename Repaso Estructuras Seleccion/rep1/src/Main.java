import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        horabuenas(scr);
    }
    public static void horabuenas(Scanner scr){
        System.out.print("Hola, introduce la hora de tu sistema:");
        float hora = scr.nextFloat(); // se declara y se da valor a la variable directamente por teclado
        switch((int)hora){
            case 6,7,8,9,10,11,12:
                System.out.println("Hola, buenos días");
            break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Hola, buenas tardes");
            break;
            case 21,22,23,0,1,2,3,4,5:
                System.out.println("Hola, buenas noches");
            break;
            default:
                System.out.println("Por favor introduce una hora correcta");
                horabuenas(scr);
        }
    }
}