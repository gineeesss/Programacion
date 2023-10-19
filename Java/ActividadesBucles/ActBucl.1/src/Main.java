/*
Un programa que muestre los números del 1 al 200, en orden decreciente y de 15 en 15.
 */
public class Main {
    public static void main(String[] args) {
    int num = 200;
    while(num>0){
        System.out.println(num);
        num = num -15;
    }
    }
}