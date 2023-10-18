/*
Un programa que pida 10 números enteros (positivos y negativos) y me determine
cuántos números eran positivos y cuántos números eran negativos.
Author: Ginés
Date: 16/10/2023
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduce 10 Número Enteros para contar la cantidad de Positvos y Negativos");
        int negativos = 0;
        int positivos = 0;
        //for(int i =0; i<10; i++){
        int i = 0;
        while(i<10){
            System.out.printf("\nIntroducir Nº %d:",i+1);
            int a = scr.nextInt();
            if(a<0){
                positivos +=1;
                i++;
            }
            else if (a>0) {
                negativos +=1;
                i++;
            }
            else{
                System.out.println("Introduce un Valor !=0");
            }
        }
        System.out.printf("Contador Negativos:%d \nContador Positivos:%d",negativos,positivos);

    }
}