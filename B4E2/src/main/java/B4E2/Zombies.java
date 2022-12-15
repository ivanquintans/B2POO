package B4E2;

import java.util.HashMap;

public final class Zombies extends Terror{


    public Zombies(String nombre, Integer anho, Integer duracion, IDirector director, HashMap<String, Float> recaudacion) throws ExcepcionPelicula {
        super(nombre, anho, duracion, director, recaudacion);
    }
}
