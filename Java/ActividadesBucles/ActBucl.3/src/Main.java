import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Introduce un numerito entre el 1 y el 100:");
        float secret = scr.nextFloat();
        if ((secret <= 0) || (secret % 1 != 0)) { //CONTROL DE NUMERO ENTERO POSITIVO
            System.out.println("Por favor introducir un numero entero positivo");
        }
        else if(secret>100){
            System.out.println("Por favor introducir un numero menor que 100");
        }else {
            float resto;
            int count = 0;
            boolean esprimo = true;
            for (int i = 1; i <= secret; i++) {  //DESDE EL NUMERO INTRODUCIDO SE DIVIDE CON TODOS LOS NUMEROS NATURALES HASTA EL 1
                resto = secret % i;
                if (resto == 0) { //CUANDO UNA DIVISION DE COMO RESTO 0, ENTONCES SE SUMA UNO AL CONTADOR
                    count++;
                }
            }
            if (count > 2) { //CUANDO SE ACABE LAS DIVISIONES SE COMPRUEBA SI EL NUMERO DE COCIENTES = 0 HA SIDO MAYOR DE 2 PARA DETERMINAR QUE NO ES PRIMO
                esprimo = false;
            }
            System.out.printf("¿Es primo el numero %.0f? %b%n", secret, esprimo);
        }
    }
}