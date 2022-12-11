package B4E1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public interface IAPelicula {

    /*Metodos*/
    /**
     * damos de alta los actores en una pelicula
     * @param rol
     * @param actores
     * @return true si se introducen correctamente
     */
    boolean darAlta(String rol, ArrayList<IActor> actores);
    /**
     * devuelve los actores dirigidos por un actor
     * @param director
     * @return un Hashmap con los actores dirgidos por el actor
     */
    HashMap<String, IActor> actoresDirigidos(IDirector director);
    /**
     *
     * @return un set con los actores que participaron en peliculas que no fueron un exito
     */
    Set<IActor> actoresFracaso();
}
