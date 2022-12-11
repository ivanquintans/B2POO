package B4E1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public interface IDirector extends IParticipante{

    /*SETTERS*/

    void setNombre(String nombre);
    void setCache(HashMap<String, Float> cache);
    void setEspecialista(Set<String> especialista);

    /*GETTERS*/

    String getNombre();

    HashMap<String, Float> getCache();

    ArrayList<IPelicula> getPeliculas();

    Set<String> getEspecialista();

    /*METODOS*/

    /**
     *
     * @param actor
     * @return devuelve el numero de veces que un director ha dirigido a un actor
     */
    int dirigirActor(String actor);

    /**
     *
     * @return un Set con los generos con mas cache
     */

    public Set<String> generoMasCaro();

    /**
     *
     * @param minimo
     * @return un hash map con las peliculas que han tenido un beneficio mayor a una determinada cantidad
     */
    public HashMap<String,IPelicula> peliculasMasBeneficio(float minimo);
}
