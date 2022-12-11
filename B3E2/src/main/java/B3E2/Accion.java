package B3E2;

import java.util.HashMap;

public abstract class Accion extends Pelicula {


    public Accion(String nombre, Integer anho, Integer duracion, Director director, HashMap<String, Float> recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }

    public boolean exito(){

        //llamamos al metodo presupuesto
        if(this.recaudacionTotal()>2.5*this.getPresupuesto() && this.getRecaudacion().get("EE.UU")>1.3*this.getPresupuesto()){
            return true;
        }

        return false;
    }

    @Override
    public float presupuesto() {
        //el presupuesto en caso de que sea comedia el 110% mas
        //utilizamos el super para utilizar el metodo presupuesto
        this.presupuesto=super.presupuesto()*2.1f;

        return this.presupuesto;
    }
}
