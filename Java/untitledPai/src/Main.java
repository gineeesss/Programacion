import java.util.Scanner;

/*
1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).




public class Main {
    public static void main(String[] args) {
    int hola = 10;
    int adios = 5;
    int suma = hola+adios;
    int resta = hola+adios;
    int multiplicacion = hola*adios;
    int division = hola/adios;
        System.out.println("La multiplicacion entre "+hola+ " y "+adios+" = "+multiplicacion);
        System.out.println("La division entre "+hola+" y "+adios+" = "+division);
        System.out.println("La suma entre "+hola+" y "+adios+" = "+suma);
        System.out.println("La resta entre "+hola+ " y "+adios+" = "+resta);
    }

*/
/*
2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

public class Main {
    public static void main(String[] args){

    int hola = 24;
    int adios = 31;
    if (hola>adios){
        System.out.println(hola+" es mayor que "+adios);
    }
        else if (adios>hola) {
            System.out.println(adios+ " es mayor que "+hola);
        }
        else System.out.println("Son iguales");
    }
}
*/
/*
3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

public class Main {
    public static void main (String[] args){
    String nombre = "Fernando";
        System.out.printf("Bienvenido %s", nombre);
    }
}
*/
/*
4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
public class Main {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String nombre = scr.next();
        System.out.printf("Bienvenido %s",nombre);
    }
}
*/
/*
5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
public class Main {
    public static void  main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduce radio del circulo");
        float radio = scr.nextFloat();
        float area = 3.14f*radio*radio;
        System.out.println(area);
    }
}