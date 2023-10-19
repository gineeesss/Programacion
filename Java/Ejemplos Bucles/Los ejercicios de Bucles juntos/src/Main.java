import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JTextArea resultadoTextArea;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        crearInterfaz(scr);
    }
    public static void crearInterfaz(Scanner scr){
        JFrame win = new JFrame("Interfaz");
        win.setSize(700, 250);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton but1 = new JButton("Sucesion Fibonacci");
        but1.setBounds(50, 70, 200,50);
        but1.setBackground(Color.RED);

        JButton but2 = new JButton("Escalera Asteriscos");
        but2.setBounds(250, 70, 200,50);
        but2.setBackground(Color.GREEN);

        JButton but3 = new JButton("Contador Negativos y Positivos");
        but3.setBounds(450, 70, 200,50);
        but3.setBackground(Color.BLUE);

        JButton but4 = new JButton("Factorial de un Numero");
        but4.setBounds(50, 120, 200,50);
        but4.setBackground(Color.YELLOW);

        JButton but5 = new JButton("Tabla de Multiplicar");
        but5.setBounds(250, 120, 200,50);
        but5.setBackground(Color.PINK);

        resultadoTextArea = new JTextArea();
        resultadoTextArea.setBounds(50, 150, 550, 200);
        resultadoTextArea.setEditable(false);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\"Sucesión Fibonacci\"");
                fibo(scr);

            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\"Escalera\"");
                escalera(scr);

            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\"Contador Negativos y Positivos\"");
                conNegPos(scr);

            }
        });
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\"Factorial de Numero\"");
                factorial(scr);

            }
        });
        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\"Tabla de Multiplicar\"");
                tabla(scr);

            }
        });


        win.add(but1);
        win.add(but2);
        win.add(but3);
        win.add(but4);
        win.add(but5);
        panel.add(resultadoTextArea);

        win.add(panel);
        win.setLayout(null);
        win.setVisible(true);
    }
    public static void fibo(Scanner scr){
        int e=0;
        int fib = 0;
        int fab = 1;
        int con ;
        while (e<20){
            //resultadoTextArea.append(String.format("\n%dº Número: %d", e + 1, fib));
            System.out.printf("\n%dº Número: %d", e + 1, fib);
            con = fib + fab;
            fib = fab;
            fab = con;
            e++;
        }
    }
    public static void escalera(Scanner scr) {
        System.out.print("Elige cuántos peldaños quieres que tenga la escalera de *:");
        int peld= scr.nextInt();
        if(peld>0) {
            String a = "*";
            String ases = a;
            for (int i = peld; i > 0; i--) {
                System.out.printf("\n%s", ases);
                ases = (ases + a);
            }
        }
        else System.out.println("Por favor introduce un numero correcto");
    }
    public static void conNegPos(Scanner scr) {
        System.out.println("Introduce 10 Número Enteros para contar la cantidad de Positvos y Negativos");
        int negativos = 0;
        int positivos = 0;
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
    public static void factorial(Scanner scr) {
        System.out.print("Introduce Numero para calcular su Factorial:");
        float numero = scr.nextFloat();
        float resultado = numero;
        if (numero != 0) {
            // System.out.printf("\nEl factorial de %.0f es:", numero);
            for (float i = numero - 1; i > 0; i--) {
                resultado = resultado * (i);
            }
        } else resultado = 1;
        System.out.printf("\nEl factorial de %.0f es:%.0f", numero, resultado);
    }
    public static void tabla(Scanner scr) {
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