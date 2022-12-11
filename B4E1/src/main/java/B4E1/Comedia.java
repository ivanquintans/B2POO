package B4E1;

import java.util.HashMap;

public abstract class Comedia extends Pelicula {

    public Comedia(String nombre, Integer anho, Integer duracion, IDirector director, HashMap<String, Float> recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }

    public float presupuesto(){
        //el presupuesto en caso de que sea comedia el 20% mas
        //utilizamos el super para utilizar el metodo presupuesto
        this.presupuesto = super.presupuesto()*1.2f;

        return presupuesto;
    }

    public boolean exito(){

        //llamamos al metodo presupuesto
        if(this.recaudacionTotal()>this.presupuesto()){
            return true;
        }

        return false;
    }
}
