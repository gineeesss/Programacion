import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
Un programa que calcule el factorial de un número
Author: Ginés
Date: 16/10/2023
 */
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Introduce Numero para calcular su Factorial:");
        float numero = scr.nextFloat();
        float resultado = numero;
        //me falta poner la condiion para que no acepte numeros negativos
        if (numero != 0) {
           // System.out.printf("\nLa secuencia factoria de %.0f es:", numero);
            for (float i = numero - 1; i > 0; i--) {
                resultado = resultado * (i);
            }
        } else resultado = 1;
        System.out.printf("\nEl factorial de %.0f es: %.0f", numero, resultado);
    }
}