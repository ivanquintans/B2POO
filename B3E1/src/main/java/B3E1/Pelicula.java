package B3E1;

import java.util.*;

public class Pelicula {

    private String nombre;

    private Integer anho;

    private Integer duracion;

    //depende de la clave buscamos si es en el hash map de catores principales o de actores s
    private HashMap<String,HashMap<String,Actor>> actores;

    private String director;

    protected float presupuesto;

    private float recaudacion;



    /*Constructores*/

    public Pelicula(String nombre,Integer anho,Integer duracion,String director,float recaudacion){

        //comprobamos el año

        setAnho(anho);

        //comprobamos la duracion de la peli

        setDuracion(duracion);

        //comprobamos la recaudacion

        setRecaudacion(recaudacion);

        //comprobamos el director

        if(director!=null){
            this.director=director;
        }

        //comprobamos el nombre de la pelicula

        if(nombre!=null){
            this.nombre=nombre;
        }

        //inicializamos el resto de atributos

        this.presupuesto=0;
        this.actores= new HashMap<>();

        //inicializamos el
        this.actores.put("principal",new HashMap<>());
        this.actores.put("secundario",new HashMap<>());

    }

    /*Setters*/

    public void setAnho(Integer anho) {

        if (anho>=1985 && anho<=2022){
            this.anho=anho;
        }

    }

    public void setDuracion(Integer duracion) {

        if(duracion>5){
            this.duracion=duracion;
        }

    }

    public void setRecaudacion(float recaudacion) {

        if(recaudacion>=0){
            this.recaudacion=recaudacion;
        }

    }

    /*Getters*/

    public String getNombre() {
        return nombre;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public float getRecaudacion() {
        return recaudacion;
    }

    public Integer getAnho() {
        return anho;
    }

    public HashMap<String, HashMap<String, Actor>> getActores() {
        return actores;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    /*Metodos Funcionales*/

    public boolean darAlta(String rol, ArrayList<Actor> actores) {

        boolean flag=true; //comprobador
        if (rol != null) {
            if (rol.equals("principal") || rol.equals("secundario")) {
                //recorremos el array list

                for (Actor actor : actores) {
                    for (String tipo : this.actores.keySet()) {
                        //añadimos en el tipo que queremos los actores al hashmap
                        this.actores.get(tipo).put(actor.getNombre(), actor);
                        //comprobamos si se añadio correctamente algun elemento
                        if(!this.actores.get(tipo).containsKey(actor.getNombre())){
                            //si hay algun valor que no lo añade bien,devolvemos false
                            flag=false;
                        }
                    }
                }
            }
        }

        return flag;
    }
    public HashMap<String, Actor> actoresDirigidos(String director){

        HashMap<String,Actor> devuelto = new HashMap<>();

        Iterator<String> iterador = this.actores.keySet().iterator();
        String tipo;

        while (iterador.hasNext()){
            tipo= iterador.next(); //guardamos el valor que queremos
            //tenemos si son principales o secundarios
            //ahora debemos de recorrer el conjunto de actores iterando por el nombre de los actores
            Iterator<String> actores = this.actores.get(tipo).keySet().iterator();
            String nombre;

            while ((actores.hasNext())){
                nombre=actores.next();
                //debemos pillar las peliculas que realizaron nuestros actores
                Iterator<String> peliculas = this.actores.get(tipo).get(nombre).getPeliculas().keySet().iterator();
                String nombrePeli;

                while ((peliculas.hasNext())) {
                    nombrePeli = actores.next();
                    //debemos pillar el directores de las peliculas
                    //si el director de estas peliculas es el mismo que el que pasamos
                    if(this.actores.get(tipo).get(nombre).getPeliculas().get(nombrePeli).getDirector().equals(director)){
                        //añadimos el actor al hash map con el nombre como clave
                        devuelto.put(this.actores.get(tipo).get(nombre).getNombre(),this.actores.get(tipo).get(nombre));
                    }
                }
            }
        }
        return devuelto;
    }

    /*Metodo presupuesto o atributo*/
    public boolean exito(){

        //llamamos al metodo presupuesto
        if(this.recaudacion>3*this.presupuesto()){
            return true;
        }

        return false;
    }

    public Set<Actor> actoresFracaso(){

        Set<Actor> solucion = new HashSet<>();

        Iterator<HashMap<String,Actor>> iterador = this.actores.values().iterator();
        HashMap<String,Actor> actores;

        while (iterador.hasNext()){
            actores=iterador.next();
            Iterator<Actor> actorIterator = actores.values().iterator();
            Actor actor;

            while (actorIterator.hasNext()) {
                actor = actorIterator.next();
                Iterator<Pelicula> iteratorPeli = actor.getPeliculas().values().iterator();
                Pelicula pelicula;

                while (iteratorPeli.hasNext()){
                    pelicula= iteratorPeli.next();

                    //si no tuvieron exito
                    if(!pelicula.exito()){
                        //añadimos el actor
                        solucion.add(actor);
                    }
                }
            }
        }
        return solucion;
    }

    //para poder aplicar la herencia debemos de cambiar el tipo del metodo para que retorne algo
    public float presupuesto(){

        //recorremos los actores

        for(String tipo : this.actores.keySet()){

        }


    }










}
