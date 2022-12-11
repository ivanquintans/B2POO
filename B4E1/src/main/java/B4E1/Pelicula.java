package B4E1;

import java.util.*;

public abstract class Pelicula {

    private String nombre;

    private Integer anho;

    private Integer duracion;

    //depende de la clave buscamos si es en el hash map de catores principales o de actores s
    private HashMap<String,HashMap<String,Actor>> actores;

    private Director director;

    protected float presupuesto;

    private HashMap<String,Float> recaudacion;



    /*Constructores*/

    public Pelicula(String nombre,Integer anho,Integer duracion,Director director,HashMap<String,Float> recaudacion){

        //comprobamos el año

        setAnho(anho);

        //comprobamos la duracion de la peli

        setDuracion(duracion);

        //comprobamos la recaudacion

        setRecaudacion(recaudacion);

        //comprobamos el director

        if(director!=null){
            this.director= new Director(director.getNombre(),director.getEspecialista(),director.getCache());
            //no funciona porq la pelicula está a medio crear
            //director.introducirPelicula(this);
        }

        //comprobamos el nombre de la pelicula

        if(nombre!=null){
            this.nombre=nombre;
        }

        //inicializamos el resto de atributos


        this.actores= new HashMap<>();

        //inicializamos el
        this.actores.put("principal",new HashMap<>());
        this.actores.put("secundario",new HashMap<>());

        this.presupuesto=presupuesto();

    }

    /*Setters*/

    public void setAnho(Integer anho) {

        if (anho>=1985 && anho<=2022){
            this.anho=anho;
        }

    }

    public void setDuracion(Integer duracion) {
        //como no es primitivo tenemos que comprobar
        if(duracion!=null) {
            if (duracion > 5) {
                this.duracion = duracion;
            }
        }

    }

    public void setRecaudacion(HashMap<String,Float> recaudacion) {
        this.recaudacion = new HashMap<>();
        if(recaudacion!=null){
            //mete todos los elememntos
            //comprobamos que el valor sea mayor que 5
            for (String pais: recaudacion.keySet()){
                if(recaudacion.get(pais) > 5f){
                    this.recaudacion.put(pais,recaudacion.get(pais));
                }
            }
        }

    }

    /*Getters*/

    public String getNombre() {
        return nombre;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public HashMap<String,Float> getRecaudacion() {
        return recaudacion;
    }

    public Integer getAnho() {
        return anho;
    }

    public HashMap<String, HashMap<String, Actor>> getActores() {
        return actores;
    }

    public Director getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    /*Metodos Funcionales*/

    /**
     * damos de alta los actores en una pelicula
     * @param rol
     * @param actores
     * @return true si se introducen correctamente
     */
    public boolean darAlta(String rol, ArrayList<Actor> actores) {

        if (actores!=null && actores.isEmpty()){
            return false;
        }

        boolean flag=true; //comprobador
        if (rol != null) {
            if (rol.equals("principal") || rol.equals("secundario")) {
                //recorremos el array list

                //si es null no añadimos nada.
                for (Actor actor : actores) {
                    for (String tipo : this.actores.keySet()) {
                        //controlamos que el actor no este en el rol diferente
                        if (this.actores.get(tipo).containsKey(actor.getNombre())) {
                            return false;
                        }
                    }
                    //debemos de introducirle la pelicula al actor
                    actor.introducirPelicula(this);
                    //añadimos en el tipo que queremos los actores al hashmap
                    this.actores.get(rol).put(actor.getNombre(), actor);
                    //comprobamos si se añadio correctamente algun elemento
                    if(!this.actores.get(rol).containsKey(actor.getNombre())){
                        //si hay algun valor que no lo añade bien,devolvemos false
                        flag=false;
                    }


                }
            }
        }
        //actualizamos el presupuesto
        this.presupuesto=this.presupuesto();

        return flag;
    }

    /**
     * devuelve los actores dirigidos por un actor
     * @param director
     * @return un Hashmap con los actores dirgidos por el actor
     */
    public HashMap<String, Actor> actoresDirigidos(Director director){

        HashMap<String,Actor> devuelto = new HashMap<>();

        //control sonbre el director
        if(director==null){
            return devuelto;
        }

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
                    nombrePeli = peliculas.next();
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

    /**
     * comprueba que sea exito la pelicula o no
     * @return true si la recaudacion es tres veces mayor que el presupuesto
     */
    public abstract boolean exito();

    /**
     *
     * @return un set con los actores que participaron en peliculas que no fueron un exito
     */
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

                    //si no tuvieron exito las peliculsa
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

    /**
     * cambio de tipo de la funcion y el atributo pasa a ser protected en vez de private(profesora)
     * @return el valor del presupuesto
     */
    public float presupuesto(){

        //recorremos los actores

        float presupuesto=0;

        for(HashMap<String,Actor> actores: this.actores.values()){
            for(Actor actor : actores.values()){
                //sumamos el cache de cada actor
                presupuesto+=actor.getCache();
            }
        }
        //añadimos el presupuesto del director dependiendo de la clase en la que se encuentre
        if (this.director.getCache().get(getClass().getSimpleName())!=null) {
            presupuesto += this.director.getCache().get(getClass().getSimpleName());
        }
        this.presupuesto=presupuesto;
        return presupuesto;

    }

    /**
     * es final para que no sea sobrescrito en las clases
     * @return la recaudacion total
     */
    public final float recaudacionTotal(){

        float valor=0;

        for(Float recaudacion : this.getRecaudacion().values()){
            valor+=recaudacion;
        }
        return valor;
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
        final Pelicula nuevo = (Pelicula) obj;
        //Si los nombres de las peliculas no son iguales
        if (!this.nombre.equals(nuevo.nombre)){
                return false;
        }
        return true;
    }

    /**
     * funcion auxiliar
     * @param tipo
     * @return  imprime los actores de forma optipa(toString)
     */
    private String imprimirActores(String tipo) { //funcion auxiliar que nos permite imprimir los actores
        String cadena = "";
        boolean flag = false;

        cadena += "\n\t{"+"\" "+tipo+"\": [ ";
        for(String nombre : this.actores.get(tipo).keySet()){
            //controlamos la coma
            if (flag) {
                cadena += ",\"" + this.actores.get(tipo).get(nombre).getNombre() + "\"";
            }else{
                cadena += "\"" + this.actores.get(tipo).get(nombre).getNombre()+ "\"";
                flag=true;
            }
        }
        cadena += " ] },";
        return cadena;
    }

    private String imprimirRecaudacion() { //funcion que me permite imprimir las peliculas en el to string
        String dato = "";

        for (String pais : this.recaudacion.keySet()){
            dato+="\t{ "+"\""+pais+"\""+", "+"\""+this.recaudacion.get(pais)+"\" },\n";
        }
        return dato;
    }

    @Override
    public String toString(){
        String imprimir= "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.nombre!=null ? " \"nombre\" : \"" +  this.nombre + "\",\n" : "")
                + (this.anho>=1985 && this.anho<=2022 ? " \"anho\" : \"" +  this.anho + "\",\n" : "")
                + (this.duracion!=null && this.duracion>5  ? " \"duracion\" : \"" +  this.duracion + "\",\n" : "")
                + (this.director!=null ? " \"director\" : " +  this.director.getNombre() + ",\n" : "")
                + (!this.recaudacion.isEmpty() ? " \"recaudacion\" : \"" +  this.recaudacion + "\",\n" : "")
                + (this.presupuesto>0 ? " \"recaudacion\" : \"" +  this.recaudacion + "\",\n" : "");
                boolean flag = false;
                for(String tipo : this.actores.keySet()) {
                    if (this.actores.get(tipo).isEmpty()) {
                        //si ambos hash maps estan vacios devolvemos el imprimir
                        if(flag){
                            return imprimir;
                        }
                        flag=true;
                    }
                }
                imprimir+=" \"actores\" :  [";
                for(String tipo : this.actores.keySet()){
                    if(!this.actores.get(tipo).isEmpty()){
                        imprimir+=( imprimirActores(tipo));
                    }
                }
                imprimir+="\n"+" ]"+"\n"+"}";

                return imprimir;
    }










}
