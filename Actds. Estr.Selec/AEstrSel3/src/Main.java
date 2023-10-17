import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Introduce numeros a ordenar\n[1º + ENTER, 2º + ENTER, 3º + ENTER]\n \n:");
        float a = scr.nextFloat();
        float b = scr.nextFloat();
        float c = scr.nextFloat();
        if (a>b && a>c){
            if(b>c){
                System.out.printf("El orden descendiente es: %.2f, %.2f, %.2f",a ,b ,c);
            }
            else
                System.out.printf("El orden descendiente es: %.2f, %.2f, %.2f",a ,c ,b);
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.printf("El orden descendiente es: %.2f, %.2f, %.2f",b ,a ,c);
            }
            else
                System.out.printf("El orden descendiente es: %.2f, %.2f, %.2f",b ,c ,a);
        }
        else if(c>a&& c>b){
            if(b>a){
                System.out.printf("El orden descendiente es: %.2f, %.2f, %.2f",c ,b ,a);
            }
            else
                System.out.printf("El orden descendiente es: %.2f, %.2f, %.2f",c ,a ,b);
        }
    }
}