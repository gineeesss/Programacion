import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int dias = 2;
    int a=1;
    int b= 1;
    int c = 0;
    int suma = 0;
    int dinero = scr.nextInt();
    while (dinero>=suma){
        c =2*a+b;
        a=b;
        b=c;
        suma = suma + c;
        dias++;
    }
        System.out.println(dias);
    }
}