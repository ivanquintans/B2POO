package B4E1;

import java.util.HashMap;

public abstract class Terror extends Pelicula{

    public Terror(String nombre, Integer anho, Integer duracion, IDirector director, HashMap<String, Float> recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }
    public boolean exito(){

        float cacheActores=0;
        //recorro el cache de los actores
        for(String tipo : this.getActores().keySet()){
            for(String nombre : this.getActores().get(tipo).keySet()){
                cacheActores+=this.getActores().get(tipo).get(nombre).getCache();
            }
        }
        if(this.recaudacionTotal()>cacheActores){
            return true;
        }



        return false;
    }
    @Override
    public float presupuesto() {

        //el presupuesto en caso de que sea comedia el 70% mas
        //utilizamos el super para utilizar el metodo presupuesto
        this.presupuesto = super.presupuesto()*1.7f;

        return presupuesto;
    }
}
