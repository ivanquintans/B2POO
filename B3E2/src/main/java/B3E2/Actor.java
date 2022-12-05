package B3E2;

import java.util.*;

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

    /**
     * añadimos una nueva pelicula al actor
     * @param pelicula
     */
    public void introducirPelicula(Pelicula pelicula){

        //si la pelicula que le pasamos es una pelicula valida
        if(pelicula!=null){
            //añdimos la pelicula
            this.peliculas.put(pelicula.getNombre(),pelicula);
        }
    }

    /**
     *
     * @param genero
     * @return devuelve un set con todas las peliculas con el genero que indiquemos en las que haya participado el actor
     */
    public Set<Pelicula> peliculasDeGenero(String genero){

        Set<Pelicula> solucion = new HashSet<>();

        if (genero==null){
            return solucion;
        }

        for (Pelicula pelicula : this.peliculas.values()) {
            //si el nombre de la clase a la que pertence pelicula es igual al genero
            if (pelicula.getClass().getSimpleName().equals(genero)) {
                //añadimos la pelicula
                solucion.add(pelicula);
            }
        }

        return solucion;
    }

    /**
     *
     * @param genero
     * @return un arraylist de peliculas que hayan sido un fracaso
     */
    public ArrayList<Pelicula> peliculasFracaso(String genero) {

        ArrayList<Pelicula> peliculas = new ArrayList<>();

        if(genero==null){
            return peliculas;
        }
        //con la funcion que creamos anteriormente obtenemos un set formado por las peliculas del genero que se le pasa por argumento
        Set<Pelicula> peliculasdeGenero = this.peliculasDeGenero(genero);
        // recorremos este array para ver cuales de este peli han sido un fracaso

        for(Pelicula pelicula : peliculasdeGenero){
            //si las peliculas no fueron un exito añadimoos estas al array list.
            if(!pelicula.exito()){
                peliculas.add(pelicula);
            }
        }
        return peliculas;
    }

    /**
     *
     * @param tipoParticipacion
     * @return devuelve el numero de veces que el actor participo con el tipo especificado
     */
    public int importancia(String tipoParticipacion) {

        //debemos recorrer las peliculas del actor
        int contador = 0;

        //SI EL TIPO DE PARTICIPACION ES NULO ENVIAMOS UN VALOR NEGATIVO QUE CONTROLA QUE ES UN VALOR NO VALIDO

        if (tipoParticipacion == null) {
            contador = Integer.MIN_VALUE;
            return contador;
        }

        //recorremos las peliculas en las que participo el actor
        for (Pelicula peliculas : this.peliculas.values()) {
            //vemos los actores que han participado en las peliculas.
            //recorremos los actores de la pelicula con el tipo que pasamos
            for (Actor actor : peliculas.getActores().get(tipoParticipacion).values()) {
                if (actor.equals(this)) {
                    //si el actor esta en la pelicula como actor de ese tipo aumentamos el contador.
                    contador++;
                }
            }
        }

        return contador;
    }

    /**
     *
     * @return el total de ganancias = numero de peliculas por cache de actor
     */
    public float totalGanancias(){

        //debemos recorrer las peliculas que hizo el actor
        //y recorrer el presupuesto de estas

        //declaramos el contador
        int contadorPeliculas=0;
        float ganancias=0f;

        Map.Entry<String,Pelicula> peliculas;

        Iterator<Map.Entry<String,Pelicula>> iterador = this.peliculas.entrySet().iterator();

        while (iterador.hasNext()){
            peliculas=iterador.next();
            //contamos el numero de peliculas que realiza el actor
            contadorPeliculas+=1;

        }
        //lo que cobra el actor por cada pelicula
        ganancias=contadorPeliculas*this.getCache();

        //ganancia total
        return ganancias;
    }

    /**
     *
     * @return un set con los deseos de actor que no han sido cumplidos
     */
    public Set<String> deseosNoCumplidos(){



        Set<String> noCumplidos = new HashSet<>();
        for(String deseo : this.deseos) {
            //si en todas las peliculas que recorremos no esta el director lo ñadimos
            boolean flag =true;
            for (Pelicula pelicula : this.peliculas.values()) {
                if (deseo.equals(pelicula.getDirector())) flag=false;

            }
            if (flag) noCumplidos.add(deseo);
        }
        return noCumplidos;
    }

    @Override
    public int hashCode(){
        int valor=1;
        final int primo = 67;
        if(this.nombre.equals("NOT-VALID-NAME"))return 0;
        return primo*valor + this.nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) { //metodo equals para paquete

        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        final Actor nuevo = (Actor) obj;
        //Si los nombres de las peliculas no son iguales
        if (!this.nombre.equals(nuevo.nombre)){
            return false;
        }
        return true;
    }

    /**
     *
     * @return  imprime las peliculas de forma optipa(toString)
     */
    private String imprimirPeliculas() { //funcion que me permite imprimir las peliculas en el to string
        String dato = "[";

        //controlar la coma
        boolean flag=false;

        for (Pelicula i :this.peliculas.values()) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + i.getNombre() + "\"";
            flag=true;
        }
        dato += "]";
        return dato;
    }

    /**
     *
     * @return  imprime los deseos de forma optipa(toString)
     */
    private String imprimirDesesos() { //funcion que me permite imprimir las peliculas en el to string
        String dato = "[";

        //controlar la coma
        boolean flag=false;

        for (String  nombre :this.deseos) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + nombre + "\"";
            flag=true;
        }
        dato += "]";
        return dato;
    }

    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.nombre!=null ? " \"nombre\" : \"" +  this.nombre + "\",\n" : "")
                + (this.cache>0 ? " \"cache\" : \"" +  this.cache + "\",\n" : "")
                + (!this.deseos.isEmpty() ? " \"deseos\" : \"" +  imprimirDesesos() + "\",\n" : "")
                + (!this.peliculas.isEmpty() ? " \"peliculas\" : " +  imprimirPeliculas() + ",\n" : "")
                + "}";
    }

}
