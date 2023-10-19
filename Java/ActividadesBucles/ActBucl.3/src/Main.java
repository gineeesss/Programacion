import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.print("Introduce un numerito entre el 1 y el 100:");
        float secret = scr.nextFloat();
        float prueba;
        boolean esprimo = false;
        for(float i=secret;i>0&&i<secret;i--){
            prueba = secret/i;
            if(prueba==0){
                esprimo = true;
                break;
            }
            System.out.println(prueba);
        }
        System.out.printf("¿Es primo el numero %f? %b%n",secret,esprimo);
    }
}