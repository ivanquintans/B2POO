package B3E1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Actor {

    private String nombre;

    private ArrayList<String> deseos;

    private HashMap<String,Pelicula> peliculas;

    private float cache;

    /*Constructores*/

    public Actor(String nombre,ArrayList<String> deseos,float cache){

        //inicializamos los deseos

        setDeseos(deseos);

        //inicializamos el cache

        setCache(cache);

        if(nombre!=null) {
            this.nombre=nombre;
        }

        //inicializamos los atributos restantes

        this.peliculas=new HashMap<>();
    }

    public Actor(String nombre,float cache){

        //inicializamos los deseos

        this.deseos=new ArrayList<>();

        //inicializamos el cache

        setCache(cache);

        if(nombre!=null) {
            this.nombre=nombre;
        }

        //inicializamos los atributos restantes

        this.peliculas=new HashMap<>();

    }

    /*Setters*/

    public void setCache(float cache) {

        //si la cache es mayor que cero
        if(cache>0){
            this.cache=cache;
        }
    }

    public void setDeseos(ArrayList<String> deseos) {

        //deseos puede ser null

        this.deseos= new ArrayList<>(deseos);
    }

    /*Getters*/

    public ArrayList<String> getDeseos() {
        return deseos;
    }

    public float getCache() {
        return cache;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, Pelicula> getPeliculas() {
        return peliculas;
    }

    /*Metodos funcionales*/

    public Set<Pelicula> peliculasDeGenero(String genero){


    }
}
