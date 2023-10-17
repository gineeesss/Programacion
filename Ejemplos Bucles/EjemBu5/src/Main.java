/*
    Un programa que muestra los veinte primeros números de la serie de Fibonacci (la serie de Fibonacci es una serie numérica en la que
    cada número es igual a la suma de los dos números anteriores de la serie, siendo los dos primeros números de la serie el 0 y el 1)
 */
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int e=0;
        int fib = 0;
        int fab = 1;
        int con ;
        while (e<20){
                System.out.printf("\n%dº Número: %d", e + 1, fib);
                con = fib + fab;
                fib = fab;
                fab = con;
            e++;
            }
  }
}