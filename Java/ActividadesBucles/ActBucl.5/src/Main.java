import java.util.Scanner;
/*
Math.random(); --> (0,1) --> para alargar el rango --> Math.random()*n --> (0,n) rango exacto Math.random()*n+1 --> (1,n+1)  --> convertir en entero --> (int)Math.random()*n+1;
 */
/*
Modifica el programa anterior para que haya un número limitado de cinco oportunidades para acertar.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Numero misterioso entre el [1 - 30]:");
        int intento = 0;
//        int misterio = scr.nextInt();
        double misterioD= Math.random()*30+1;
        int misterio = (int)misterioD;
//      int misterio = (int)Math.random()*30+1;
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        if (misterio<1||misterio>30){
            System.out.println("Por favor, introducir un numero entre el 1 y 30");
            return;
        }
        for(int i=0;i<5&&intento!=misterio;i++){
            System.out.printf("\n%dªOportuidad:",i+1);
            intento=scr.nextInt();
           if (intento>misterio) {
                System.out.printf("\nNuero introducido: %d \nEl numero secreto es menor", intento);
            }
            else System.out.printf("\nNuero introducido: %d \nEl numero secreto es mayor", intento);
        }
        if (intento==misterio){
            System.out.printf("¡HAS ACERTADO, EL NUMERO MISTERIOSO ERA:%d!",misterio);
        }
        else System.out.println("No quedan nº de intentos.");
    }
}