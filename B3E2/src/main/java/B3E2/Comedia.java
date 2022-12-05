package B3E2;

public class Comedia extends Pelicula {

    public Comedia(String nombre, Integer anho, Integer duracion, String director, float recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }

    public float presupuesto(){
        //el presupuesto en caso de que sea comedia el 20% mas
        //utilizamos el super para utilizar el metodo presupuesto
        this.presupuesto = super.presupuesto()*1.2f;

        return presupuesto;
    }
}
