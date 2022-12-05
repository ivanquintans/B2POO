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

    public Director(String nombre, Set<String> especialista,HashMap<String, Float> cache) {
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

    /**
     *
     * @return un Set con los generos con mas cache
     */

    public Set<String> generoMasCaro(){

        Set<String> generos = new HashSet<>();
        float maximo=0;

        //iteramos por la lista de generos en los que es especialista
        for(String genero: this.especialista){
            if(this.cache.get(genero) > maximo){
                maximo = this.cache.get(genero);
                //borramos el set para asegurarnos que esta vacio(cambiamos de maximo)
                generos.clear();
                generos.add(genero);
            //si hay algun valor igual al genero que ya tenemos, lo añadimos
            }else if(this.cache.get(genero) == maximo) generos.add(genero);

        }

        return generos;

    }

    /**
     *
     * @param minimo
     * @return un hash map con las peliculas que han tenido un beneficio mayor a una determinada cantidad
     */
    public HashMap<String,Pelicula> peliculasMasBeneficio(float minimo){

        HashMap<String,Pelicula> peliculasMas = new HashMap<>();

        //no puedo comprobar si el minimo es distint de null
        //devolvemos vacio el hashmap ya que no hay peliculas
        if(minimo<=0) return peliculasMas;

        for(Pelicula peli : this.peliculas){
            //como presupuesto es un float(tengo presupuesto como protected)
            if(peli.getPresupuesto()>minimo) peliculasMas.put(peli.getNombre(),peli);
        }

        return peliculasMas;
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
        final Director nuevo = (Director) obj;
        //Si los nombres de las peliculas no son iguales
        if (!this.nombre.equals(nuevo.nombre)){
            return false;
        }
        return true;
    }

    private String imprimirPeliculas() { //funcion que me permite imprimir las peliculas en el to string
        String dato = "[";

        //controlar la coma
        boolean flag=false;

        for (Pelicula i :this.peliculas) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + i.getNombre() + "\"";
            flag=true;
        }
        dato += "]";
        return dato;
    }

    private String imprimirespecialista() { //funcion que me permite imprimir las peliculas en el to string
        String dato = "[";

        //controlar la coma
        boolean flag=false;

        for (String  especialista :this.especialista) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + especialista + "\"";
            flag=true;
        }
        dato += "]";
        return dato;
    }
    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.nombre!=null ? " \"nombre\" : \"" +  this.nombre + "\",\n" : "")
                + (!this.cache.isEmpty() ? " \"cache\" : \"" +  this.cache + "\",\n" : "")
                + (!this.peliculas.isEmpty() ? " \"peliculas\" : " +  imprimirPeliculas() + ",\n" : "")
                + (!this.especialista.isEmpty() ? " \"especialista\" : \"" +  imprimirespecialista() + "\",\n" : "")
                + "}";
    }
}
