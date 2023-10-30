public class Principal {
    public static void main(String[] args){
        Personas dam1 = new Personas();
        dam1.nacer();
        System.out.println(dam1.devNombre());;
        dam1.dormir();
        dam1.engordar(3);
        System.out.println(dam1.devPeso());;

        }
}
