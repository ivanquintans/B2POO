package B4E1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public interface IActor extends IParticipante{

    /*SETTERS*/

    void setCache(float cache);
    void setDeseos(ArrayList<String> deseos);

    /*GETTERS*/

    ArrayList<String> getDeseos();

    String getNombre();

    HashMap<String, IPelicula> getPeliculas();

    float getCache();

    /*METODOS*/

    /**
     *
     * @param genero
     * @return devuelve un set con todas las peliculas con el genero que indiquemos en las que haya participado el actor
     */
    Set<IPelicula> peliculasDeGenero(String genero);

    /**
     *
     * @param genero
     * @return un arraylist de peliculas que hayan sido un fracaso
     */
    ArrayList<IPelicula> peliculasFracaso(String genero);

    /**
     *
     * @param tipoParticipacion
     * @return devuelve el numero de veces que el actor participo con el tipo especificado
     */
    int importancia(String tipoParticipacion);

    /**
     *
     * @return el total de ganancias = numero de peliculas por cache de actor
     */
    public float totalGanancias();

    /**
     *
     * @return un set con los deseos de actor que no han sido cumplidos
     */
    Set<String> deseosNoCumplidos();

    /*METODOS ESTATICOS*/

    /**
     * comprueba si la pelicula tiene el actor o no
     * @param nombre
     * @param pelicula
     * @return boolean
     */
    static boolean participa(String nombre,Pelicula pelicula){

        if (nombre==null || pelicula == null) return false;

        for (String tipo  : pelicula.getActores().keySet()){
            if(pelicula.getActores().get(tipo).containsKey(nombre)) return true;
        }

        return false;

    }
}
