package B3E1;

public class Accion extends Pelicula {

    public Accion(String nombre, Integer anho, Integer duracion, String director, float recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }
    /*Override o no??*/
    //@Override
    public float presupuesto() {
        //el presupuesto en caso de que sea comedia el 110% mas
        //utilizamos el super para utilizar el metodo presupuesto
        this.presupuesto=super.presupuesto()*2.1f;

        return this.presupuesto;
    }
}
