package B3E2;

import java.util.HashMap;

public final class Ficcion extends Accion{


    public Ficcion(String nombre, Integer anho, Integer duracion, Director director, HashMap<String, Float> recaudacion) {
        super(nombre, anho, duracion, director, recaudacion);
    }

    public boolean exito(){

        float cacheActores=0;
        //si no es cierto no tiene sentido que recorra
        if(this.recaudacionTotal()>4*this.getPresupuesto()){
            for(String tipo : this.getActores().keySet()){
                for(String nombre : this.getActores().get(tipo).keySet()){
                    cacheActores+=this.getActores().get(tipo).get(nombre).getCache();
                }
            }
            if(this.getRecaudacion().get("Francia")>0.2*cacheActores
                && this.getRecaudacion().get("Italia")>0.2*cacheActores
                && this.getRecaudacion().get("Alemania")>0.2*cacheActores
                && this.getRecaudacion().get("Reino Unido")>0.2*cacheActores){
                return true;
            }

        }

        return false;
    }
}
