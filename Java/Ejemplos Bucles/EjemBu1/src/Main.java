import java.util.Scanner;
/*
Un programa que muestre la tabla de multiplicar de un número entre 1 y 20 introducido por teclado
Author: Ginés
 */
public class Main {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
        System.out.print("Tabla de multipliar del numero:");
        float numero= scr.nextByte();
        if(numero>0 && numero<=20){
            for(int i=1;i<=10;i++){
                System.out.printf("\n %.0f x %d = %.0f",numero,i, numero*i);
            }
        }
        else {
            System.out.println("Por favor introduce un numero entre el 1 y 20");
        }
    }
}