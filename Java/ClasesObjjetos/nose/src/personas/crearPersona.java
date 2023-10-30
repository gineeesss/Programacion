package personas;
import java.util.Scanner;

public class crearPersona {
    Scanner scr = new Scanner(System.in);
    private String nombre;
    private int edad;
    private float peso;
    private String genero;
    private float recorrido;

    void nacer(Scanner scr){
        crearNombre();
    }
    String crearNombre(){
        this.nombre = scr.nextLine();
        return  this.nombre;
    }

}
