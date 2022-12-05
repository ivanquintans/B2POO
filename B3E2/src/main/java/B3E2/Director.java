package B3E2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Director {

    private String nombre;

    private HashMap<String,Float> cache;

    private ArrayList<Pelicula> peliculas;

    private Set<String> especialista;


    /*Constructor*/

    public Director(String nombre, HashMap<String, Float> cache, Set<String> especialista) {
        setNombre(nombre);
        setCache(cache);
        setEspecialista(especialista);
        this.peliculas=new ArrayList<>();
    }

    /*Setters*/

    public void setNombre(String nombre) {
        if(nombre!=null){
            this.nombre = nombre;
        }
    }

    public void setCache(HashMap<String, Float> cache) {
        if(cache!=null){
            this.cache = new HashMap<>(cache);
        }

    }

    public void setEspecialista(Set<String> especialista) {

        if(especialista!=null){
            this.especialista = new HashSet<>(especialista);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, Float> getCache() {
        return cache;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public Set<String> getEspecialista() {
        return especialista;
    }

    /*Mertodos funcionales*/

    /**
     * introduce la pelicula en el director
     * necesario si es especialista en ese genero
     * @param pelicula
     */
    public void introducirPelicula(Pelicula pelicula){

        if(pelicula!=null){
            //si el genero coincide con alguno en el que sea especialista añadimos
            if(this.especialista.contains(pelicula.getClass().getSimpleName())){
                //añadimos la pelicula
                this.peliculas.add(pelicula);
            }
        }
    }

    /**
     *
     * @param actor
     * @return devuelve el numero de veces que un director ha dirigido a un actor
     */
    public int dirigirActor(String actor){

        int contador=0;
        if(actor==null) {
            contador=Integer.MIN_VALUE;
            return contador;
        }

        for(Pelicula pelicula : this.peliculas){
            //devolvemos
            if(pelicula.actoresDirigidos(this.getNombre()).containsKey(actor)){
                contador++;
            }
        }

        return contador;


    }
}
