/*
Programa que pida por teclado un numero entero y sea capaz de dicr que digitos aparecen en el numero y que digitos no aparece,
Ejemplo: 459824
Salida: 4 5 8 9
 */

import java.util.Scanner;

/*
primero necesito saber la cantidad de digitos
cuando empieza a sacar los numero, necesito que no se repitan
hacer un bucle dividiendo por un numero entero
 hacer divison entera hasta que mede 0, cuando me de 0, adivino el numero de digitos
 */
public class GutierrezGines {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

/*        System.out.print("Introducir numero:");
        int numero = scr.nextInt();
        int i = 10;
        int div = 1;
        int digitos = 0;
        //    System.out.print("Digitos que aparecen en el número:  ");
        int a = 1;

        do {                        //Este bucle encuentra el numero de digitos del numero, hace una division entera entre 10 tantas veecs como numero stenga hasta que sea igual a 0
            div = numero / i;
            i = i * 10;
            digitos = digitos + 1;
            System.out.println(a + " cifra: " + div);
            System.out.println(a + " cifra: " + div);
            a += 1;
        } while (div != 0);
        System.out.println("cantidad digitos:" + digitos);

        System.out.println("\n\n\n");


        System.out.println(numero % 1);
        int cosa = 0;
        int mult = 1;
        int acu = 0;
        while (acu < digitos - 1) {
            mult = mult * 10;
            acu++;
        }
        System.out.println(mult);
        int hola;


        System.out.println(numero);
        System.out.print("Digitos: ");
        for (int o = 1; o <= digitos; o++) {
            cosa=numero%10;
            numero = numero/10;
            System.out.print(cosa+" ");
       }
        System.out.println("\n\n");

        */
        int number, i, rest,aux;
        boolean encontrado = false;
        String siaparece ="", noaparece="";
        System.out.println("Introduce un numero entero:");
        number = scr.nextInt();
        for (i=0;i<=9;i++){
            aux = number;
            encontrado =false   ;
            while(aux!=0 && encontrado==false){
                rest=aux%10;
                if(i==rest){
                    encontrado =true;
                }else{
                    aux=aux/10;
                }
            }
            if(encontrado==true){
                siaparece = siaparece +i+" ";
            }else {
                noaparece = noaparece +i+" ";
            }
        }
        System.out.println("Las cifras que si aparecen son: "+siaparece);
        System.out.println("Las cifras que no aparecen son: "+noaparece);
    }
}