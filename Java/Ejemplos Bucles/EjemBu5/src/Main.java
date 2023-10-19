/*
    Un programa que muestra los veinte primeros números de la serie de Fibonacci (la serie de Fibonacci es una serie numérica en la que
    cada número es igual a la suma de los dos números anteriores de la serie, siendo los dos primeros números de la serie el 0 y el 1)
 */
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            crearInterfaz(scr);
           // fibo(scr);
        }
        public static void crearInterfaz(Scanner scr){
            JFrame win = new JFrame("Interfaz");
            win.setSize(300, 200);
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton but = new JButton("Sucesion Fibonacci");
            but.setBounds(100, 70, 100,30);



            but.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("\"Sucesión Fibonacci\"");
                    fibo(scr);
                }
            });


            win.add(but);
            win.setVisible(true);
        }
        public static void fibo(Scanner scr){
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

















/*

    Un programa que muestra los veinte primeros números de la serie de Fibonacci (la serie de Fibonacci es una serie numérica en la que
    cada número es igual a la suma de los dos números anteriores de la serie, siendo los dos primeros números de la serie el 0 y el 1)

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
 */