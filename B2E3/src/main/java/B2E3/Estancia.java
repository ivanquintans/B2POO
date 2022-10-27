package B2E3;

import java.util.*;

public class Estancia {

    private String nombre;

    private Planta planta;

    private HashMap<String,Sensor> sensores;

    private float coste;



    /* Constructores*/

    public Estancia(String nombre, Planta planta) {

        //debemos también declarar nuestro set mediante un hash set
        this.sensores = new HashMap<>();
        this.coste= 0f;

        if (nombre != null) {
            this.nombre = nombre;

        }else{
            this.nombre= "NOT-VALID-NAME";

        }
        //suponemos que la planta minima es un segundo garaje
        if(planta!=null) {
            this.planta = planta;

        }else{
            this.planta=null;

        }
    }


    /*Setters*/

    //no tenemos setter en este caso


    /*Getters*/

    public String getNombre() {

        return nombre;
    }

    public Planta getPlanta() {

        return planta;
    }

    public HashMap<String, Sensor> getSensores() {

        return sensores;
    }

    public float getCoste() {

        return coste;
    }

    /*Metodos funcionales*/


    /* NO SE QUE KEY METERLE*/
    public boolean darAlta(Sensor sensor) {

        if(sensor==null) return false;

        //pero si debemos comprobar si las ids son iguales
        if(sensores.containsKey(sensor.getId())) {
            return false;//no lo añadimos y devolvemos false
        }

        //en otro caso lo añadimos y devolvemos false
        this.sensores.put(sensor.getId(),sensor); //añadimos el sensor a sensores

        //calculamos el coste como la suma del precio de los sensores

        this.coste += sensor.getPrecio();


        return true;

    }

    /* CRITERIO DE IGUALDAD*/


    public boolean darAlta(String id, String tipo, float[] rango, float precio) {

        //si no tenemos una id que pueda identificar el sensor

        if(id==null) return false;

        Sensor nuevo = new Sensor(id, tipo, rango, precio);

        if(this.sensores.containsKey(nuevo.getId())) {
            return false;//no lo añadimos y devolvemos false
        }

        this.sensores.put(nuevo.getId(),nuevo); //añadimos el sensor a sensores
        return true;
    }

    public boolean nuevoDato(String id, float dato) {

        //se comprueba la id automaticamente dentro

        for(String key : this.sensores.keySet()){
            if(key.equals(id)){
                this.sensores.get(key).nuevoDato(dato);
            }
        }

        //despues de añadir el valor si la id esta contenida
        if(sensores.containsKey(id)){
            return true;
        }
        //si no hay ningun sensor con el mismo id que queremos
        return false;
    }

    public Set<Sensor> sensoresTipo(String tipo) {

        //si el tipo no es valido devuelvo vacio el set

        Set<Sensor> devuleto = new HashSet<Sensor>();

        Iterator<String> iterador = this.sensores.keySet().iterator();
        String llave;

        while (iterador.hasNext()){
            llave= iterador.next(); //guardamos el valor que queremos
            if(this.sensores.get(llave).getTipo().equals(tipo)){
                devuleto.add(this.sensores.get(llave));
            }
        }
        return devuleto;
    }

    /*Tengo que devolver un array de sensores*/
    /*Doble bucle*/

    public Sensor[] sensorMaxValor(String tipo) {

        //si el tipo no es valido devuelvo vacio el sensor[]

        ArrayList<Sensor> arraySensores = new ArrayList<>();
        float max = Float.MIN_VALUE; //asignamos un valor para comprobar el error

        Iterator<Sensor> iterador = this.sensores.values().iterator();
        Sensor misensor;

        //for para comprobar el maximo
        while (iterador.hasNext()){
            misensor= iterador.next(); //guardamos el valor que queremos
            if(misensor.getTipo().equals(tipo)){
                if(misensor.maximo()>=max){
                    max= misensor.maximo();
                }
            }
        }

        //si el maximo es ese valor quiere decir que los sesnores tiene rango nulo por lo que lo devuelvo vacio
        if(max == Float.MIN_VALUE) return new Sensor[0];

        iterador = this.sensores.values().iterator();

        //bucle para añadir al array los sensores cuyo valor sea igual al máximo
        while (iterador.hasNext()){
            misensor= iterador.next(); //guardamos el valor que queremos
            if(misensor.getTipo().equals(tipo)){
                if(misensor.maximo()==max){
                    arraySensores.add(misensor);
                }
            }
        }

        //recorro el arraylist y copio en el vector mi array
        Sensor[] solucion = new Sensor[arraySensores.size()];
        for (int i=0;i<arraySensores.size();i++){
            solucion[i]=arraySensores.get(i);
        }

        return solucion; //devolvemos el array final
    }

    //mismo codigo que el de maximos pero para minimos
    public Sensor[] sensorMinValor(String tipo) {

        //si el tipo no es valido devuelvo vacio el sensor[]

        ArrayList<Sensor> arraySensores = new ArrayList<>(); //tamaño 10 ya que no tenemos tantos sensores en la estancia
        float min = Float.MAX_VALUE; //asignamos un valor para comprobar el error

        //for para comprobar el maximo

        for (String key : this.sensores.keySet()) {
            if (this.sensores.get(key).getTipo().equals(tipo)){
                if (this.sensores.get(key).minimo() <= min) {
                    min = this.sensores.get(key).minimo(); //el valor minimo pasa a ser el valor del sensor
                }
            }
        }
        //si el MINIMO es ese valor quiere decir que los sensores tiene rango nulo por lo que lo devuelvo vacio
        if(min == Float.MAX_VALUE) return new Sensor[0];


        //bucle para añadir al array los sensores cuyo valor sea igual al máximo

        for (String key : this.sensores.keySet()) {
            if (this.sensores.get(key).getTipo().equals(tipo)){
                if (this.sensores.get(key).minimo() == min) {
                    arraySensores.add(this.sensores.get(key));

                }
            }
        }

        //recorro el arraylist y copio en el vector mi array
        Sensor[] solucion = new Sensor[arraySensores.size()];
        for (int i=0;i<arraySensores.size();i++){
            solucion[i]=arraySensores.get(i);
            }

        return solucion; //devolvemos el array final

    }

    public ArrayList<Float> valoresSuperiores(String id, float valor) {

        //si la id no es valida nos devuleve vacio

        ArrayList<Float> valores = new ArrayList<>();//declaramos un array list para poder devolver los valores

        for (Sensor value : sensores.values()) { //recorremos los sensores
            if (value.getId().equals(id)) { //si el id del sensor es el mismo
                for (int j = 0; j < value.getDatos().size(); j++) { //recorremos los datos del sensor
                    if (value.getDatos().get(j) > valor) {
                        valores.add(value.getDatos().get(j)); //añadimos al array list el valor
                    }
                }
            }
        }

        return valores;
    }

    public HashMap<String, ArrayList<Float>> valoresSensoresTipo(String tipo){

        HashMap<String, ArrayList<Float>> solucion = new HashMap<>();

        Iterator<String> iterador = this.sensores.keySet().iterator();
        String llave;

        while (iterador.hasNext()){
            llave= iterador.next(); //guardamos el valor que queremos
            if(this.sensores.get(llave).getTipo().equals(tipo)){
                solucion.put(llave,this.sensores.get(llave).getDatos());
            }
        }

        return solucion;

    }

    public ArrayList<Sensor> sensoresCosteMayor(float valor){

        //si la id no es valida nos devuleve vacio

        ArrayList<Sensor> valores = new ArrayList<>();//declaramos un array list para poder devolver los valores

        Map.Entry<String,Sensor> entrada;

        Iterator<Map.Entry<String,Sensor>> iterador = this.sensores.entrySet().iterator();

        while (iterador.hasNext()){
            entrada = iterador.next(); //guardamos el valor que queremos
            if(entrada.getValue().getPrecio()>valor){
                    valores.add(entrada.getValue());
            }
        }
        return valores;

    }

    /* COMPROBARLA*/
    public boolean darBaja(String id){

        if(this.sensores.containsKey(id)){
            this.sensores.remove(id);
            return true;
        }

        return false;
    }

    /*Controlar la coma*/
    public String imprimirSensores() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete

        boolean flag=false;
        for (Sensor i :this.sensores.values()) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + i.getId() + "\"";
            flag=true;
        }
        dato += "]";
        return dato;
    }

    public String imprimirSensoresMedia() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete
        int flag=0;

        for (Sensor i :this.sensores.values()) {
            if(flag!=0){
                dato+="\n";
                dato += "\t\t\t\t\t";
            }
            dato += "{" +"\"" + i.getId() + "\"" + "," + "\"" + i.media()+ "\""+"}";
            flag++;
        }
        dato += "]";
        return dato;
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
        final Estancia nuevo = (Estancia) obj;
        if (!this.nombre.equals(nuevo.nombre)){
            if(!(this.planta == nuevo.planta)) {
                return false;
            }
        }
        return true;
    }
    /*Revisar espcios*/
    /*Acabar esto*/
    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.nombre!=null ? " \"nombre\" : \"" +  this.nombre + "\",\n" : "")
                + (this.planta!=null? " \"planta\" : \"" +  this.planta + "\",\n" : "")
                + (!this.sensores.isEmpty() ? " \"sensores\" : \"" +  imprimirSensores() + "\",\n" : "")
                + (this.coste>=0 ? " \"coste\" : " +  this.coste + ",\n" : "")
                + (!this.sensores.isEmpty() ? " \"sensores_media\" : " +  imprimirSensoresMedia() + ",\n" : "")

                + "}";
    }
}

