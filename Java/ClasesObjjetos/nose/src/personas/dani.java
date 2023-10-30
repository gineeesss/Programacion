package personas;

public class dani {
    private String nombre;
    private int edad;
    private float peso;
    private String genero;
    private float recorrido;

    void nacerDani(){
        nombre = "Dani";
        edad = 15;
        peso = 51;
        genero = "Maculino";
        recorrido = 0;
    }

    float caminar(float distancia) {
        this.recorrido = this.recorrido + distancia;
        return recorrido;
    }
    float engordar(float peso){
        this.peso = this.peso + peso;
        return this.peso;
    }

    String devNombre(){
        return  this.nombre;
    }
    float devRecorrid(){
        return this.recorrido;
    }
}
