/*
 * Nombre del Programa: Ejercicio 2 Estreucturas Seleccion
 * Autor: Gines GS
 * Fecha de Creación: 9 de Octubre de 2023
 * Descripción: Este programa responde comprueba si un examen está aprobado o no. Primero de todo comprueba
 * si la nota tiene sentido (está entre el 0 y 10), en caso de que  no el modulo se reitera, y se clasifica simplemente con un if.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Qué desea consultar:\nMedia examen: 1\nOtra cosa: 2");
        float seleccion = scr.nextFloat();
        switch ((int)seleccion){
            case 1:
                Media(scr);
            break;
            case 2:
                Hola(scr);
            break;
        }
    }
    public static void Media(Scanner scr) {
        System.out.println("Menu\n\nMedia:1\nVolver al inicio:2");
        float seleccion = scr.nextFloat();
        switch ((int)seleccion){
            case 1:
                System.out.print("Introduce la nota del exémen:");
                float examen = scr.nextFloat();
                if (examen>=0 && examen <= 10){
                if (examen >= 5) {
                    System.out.println("Aprobado");
                } else System.out.println("Suspenso");
                }
                else {
                System.out.println("\nPor favor intruduce una nota valida\n");
                Media(scr);
                }
            break;
            case 2: main(new String[0]);
            break;
            default: Media(scr);
        }

    }
    public static void Hola(Scanner scr) {
        System.out.println("Que pasa nen");
        Hola(scr);
    }
}
