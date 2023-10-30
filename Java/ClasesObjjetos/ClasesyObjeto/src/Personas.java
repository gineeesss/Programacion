class Personas {
    //Propiedades

    private String nombre;
    private int edad;
    private float peso;
    private String genero;

    //metodos
    void nacer(){
        edad = 0;
        nombre = "Laura";
        peso = 3.5f;
        genero = "Femenino";
    }
    float dormir(){
    engordar(3);
    return this.peso;
    }
    float engordar(float peso){
        this.peso = this.peso + peso;
        return this.peso;
    }
    String devNombre(){
        return this.nombre;
    };
    float devPeso(){
        return  this.peso;
    }
}
