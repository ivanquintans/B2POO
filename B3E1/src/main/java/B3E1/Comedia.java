package B3E1;

public class Comedia extends Pelicula {

    public Comedia(String nombre, Integer anho, Integer duracion, String director, float recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }

    public float presupuesto(){

        this.presupuesto = super.presupuesto()*1.2f;

        return presupuesto;
    }
}
