import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Introduce horas trabajadas durante 1 semana:");
        int horas = scr.nextInt();
        int paga1 = horas * 12;
        int paga2 = horas * 16;
        if(horas<40){
            System.out.printf("El salario Semanal por cumplir %d horas es de: %d €",horas, paga1);
        }
        else System.out.printf("El salario Semanal por cumplir %d horas es de: %d €",horas, paga2);
    }
}