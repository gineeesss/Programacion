/*
 * Nombre del Programa: Ejercicio 4 Estreucturas Seleccion
 * Autor: Gines GS
 * Fecha de Creación: 9 de Octubre de 2023
 * Descripción: Este programa imprime por pantalla un test cuyas preguntas se respondrán una a una y se guardará
 * el valor en una variable para luego comparar las respuestas y otorgar una puntuación final
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int res1, res2, res3, res4, res5;
        float negativo = 0;
        float positivo = 0;

        System.out.println("BIENVENIDO AL TEST SOBRE JAVA\n");

        System.out.println("1.- ¿Cuál de los siguientes tipos de datos en Java se utiliza para almacenar números enteros?\n" + "A. float\n" + "B. int\n" + "C. String");
        System.out.println("\nItroduce respuesta [1-2-3]");
        res1 = scr.nextInt();

        System.out.println("¿Qué palabra clave se utiliza para declarar una variable constante en Java?\n" + "A. final\n" + "B. static\n" + "C. constante");
        System.out.println("\nItroduce respuesta [1-2-3]");
        res2 = scr.nextInt();

        System.out.println("¿Cuál es la forma correcta de comparar dos valores de cadena (String) en Java?\n" + "A. x == y\n" + "B. x.equals(y)\n" + "C. x.compare(y)");
        System.out.print("\nItroduce respuesta [1-2-3]");
        res3 = scr.nextInt();

        System.out.println("¿Qué estructura condicional se utiliza para ejecutar un bloque de código si una condición es verdadera y otro bloque si es falsa?\n" + "A. if-else\n" + "B. switch\n" + "C. while");
        System.out.println("\nItroduce respuesta [1-2-3]");
        res4 = scr.nextInt();

            System.out.println("¿Cuál de los siguientes operadores lógicos representa \"O lógico\" en Java?\n" + "A. &&\n" + "B. ||\n" + "C. !");
        System.out.println("\nItroduce respuesta [1-2-3]");
        res5 = scr.nextInt();

        if (res1 == 2) {        //respouesta 1
            positivo++;
        } else {
            negativo -= 0.5;
        }
        if (res2 == 1) {        //respouesta 2
            positivo++;
        } else {
            negativo -= 0.5;
        }
        if (res3 == 2) {        //respouesta 3
            positivo++;
        } else {
            negativo -= 0.5;
        }
        if (res4 == 1) {        //respouesta 4
            positivo++;
        } else {
            negativo -= 0.5;
        }
        if (res5 == 2) {        //respouesta 5
            positivo++;
        } else {
            negativo -= 0.5;
        }

        float resultado = negativo + positivo;
        if(resultado<=0){
        System.out.println("La nota final del test es: 0");     //Como es una calificación no tiene sentido que tenga menos de 0 puntos el resultado
    }
    else
        System.out.printf("La nota final desl test es %.2f",resultado);
    }
}