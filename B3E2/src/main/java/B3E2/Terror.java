package B3E2;

public class Terror extends Pelicula{

    public Terror(String nombre, Integer anho, Integer duracion, String director, float recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }

    @Override
    public float presupuesto() {

        //el presupuesto en caso de que sea comedia el 70% mas
        //utilizamos el super para utilizar el metodo presupuesto
        this.presupuesto = super.presupuesto()*1.7f;

        return presupuesto;
    }
}
