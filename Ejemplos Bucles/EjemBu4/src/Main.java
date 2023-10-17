/*
Un programa que dibuje una escalera de asteriscos (la altura de la escalera se introduce por teclado). Por ejemplo si introducimos un 4 debería aparecer:
Author: Ginés
Date: 16/10/2023
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Elige cuántos peldaños quieres que tenga la escalera de *:");
        int peld= scr.nextInt();
        String a = "*";
        String ases = a;
        for (int i = peld; i>0;i--){
            System.out.printf("\n%s",ases);
            ases=(ases+a);
        }
    }
}