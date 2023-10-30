package personas;

public class mercedes {
    private String nombre;
    private int edad;
    private float peso;
    private String genero;
    private float recorrido;
    void nacerMercedes(){
        nombre = "Mercedes";
        edad = 41;
        peso = 58;
        genero = "Femenino";
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
    float devPeso(){
    return this.peso;
    }
    float devRecorrid(){
        return this.recorrido;
    }

}
