import java.util.Scanner;

/*
Un programa que intente adivinar un "número misterioso" entre 1 y 30. El programa irá dando oportunidades para acertarlo, y en caso de no acertar nos
dará la pista de si el "número misterioso" es mayor o menor que el introducido. Así hasta acertar el número correcto.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Numero misterioso entre el [1 - 30]:");
        int misterio = scr.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        if (misterio<1||misterio>30){
            System.out.println("Por favor, introducir un numero entre el 1 y 30");
            return;
        }
        int intento = 0;
        for(int i=0;intento!=misterio;i++){
            System.out.printf("\n%dªOportuidad:",i+1);
            intento=scr.nextInt();
            if (intento==misterio){
                System.out.printf("¡HAS ACERTADO, EL NUMERO MISTERIOSO ERA:%d!",misterio);
            }
            else if (intento>misterio) {
                System.out.printf("\nNuero introducido: %d \nEl numero secreto es menor", intento);
            }
            else System.out.printf("\nNuero introducido: %d \nEl numero secreto es mayor", intento);
            }
        }
    }