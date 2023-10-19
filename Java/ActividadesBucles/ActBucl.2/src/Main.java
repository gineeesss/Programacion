import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
        System.out.println("1 numero");
        int numero1 = scr.nextInt();
        System.out.println("1 numero");
        int numero2 = scr.nextInt();
        System.out.println("Incremento");
        int incremento = scr.nextInt();

        int mayor, menor;

        if (numero2>numero1){
            mayor = numero2;
            menor = numero1;
        }
        else {
            mayor = numero1;
            menor = numero2;
        }
        while(mayor>menor){
            System.out.println(mayor);
            mayor= mayor-incremento;
        }
    }
}