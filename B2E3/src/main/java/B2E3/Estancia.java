package B2E3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Estancia {

    private String nombre;

    private int planta;

    private Set<Sensor> sensores;

    private float coste;



    /* Constructores*/

    public Estancia(String nombre, int planta) {

        //debemos también declarar nuestro set mediante un hash set
        this.sensores = new HashSet<Sensor>();
        this.coste= 0f;

        if (nombre != null) {
            this.nombre = nombre;

        }else{
            this.nombre= "NOT-VALID-NAME";

        }
        //suponemos que la planta minima es un segundo garaje
        if(planta>=-2) {
            this.planta = planta;

        }else{
            this.planta=Integer.MIN_VALUE; //SI NO ES UNA PLANTA VALIDA LE ASIGNAMOS EL VALOR MINIMO PARA INTEGER

        }

    }


    /*Setters*/

    //no tenemos setter en este caso


    /*Getters*/

    public String getNombre() {
        return nombre;
    }

    public int getPlanta() {
        return planta;
    }

    public Set<Sensor> getSensores() {
        return sensores;
    }

    public float getCoste() {
        return coste;
    }

    /*Metodos funcionales*/


    /* CRITERIO DE IGUALDAD*/
    public boolean darAlta(Sensor sensor) {

        //al utilizar un set no deberiamos comprobar si es igual a los elementos existentes ya que set es una lista no ordenada
        //en la que no puede existir ningun elemento repetido

        //pero si debemos comprobar si las ids son iguales

        for(Sensor i: this.sensores) {
            if(i.getId().equals(sensor.getId()))  //si los ids son iguales
                return false;//no lo añadimos y devolvemos false

        }

        //en otro caso lo añadimos y devolvemos false
        this.sensores.add(sensor); //añadimos el sensor a sensores

        //calculamos el coste como la suma del precio de los sensores

        this.coste += sensor.getPrecio();


        return true;

    }

    /* CRITERIO DE IGUALDAD*/
    /*HASH SET Y COMPROBAR*/

    public boolean darAlta(String id, String tipo, float[] rango, float precio) {

        Sensor nuevo = new Sensor(id, tipo, rango, precio);

        //pero si debemos comprobar si las ids son iguales

        for(Sensor i: this.sensores) {
            if(i.getId().equals(nuevo.getId()))  //si los ids son iguales
                return false;//no lo añadimos y devolvemos false
        }
        //en otro caso lo añadimos y devolvemos false
        this.sensores.add(nuevo); //añadimos el sensor a sensores
        return true;
    }

    public boolean nuevoDato(String id, float dato) {

        for (Sensor i : sensores) {
            if (i.getId().equals(id)) {
                //funcion que añade valores a un sensor (definido en la clase sensor)
                i.nuevoDato(dato); //añadimos el nuevo dato al sensor deseado

                if(i.getDatos().contains(dato)){
                    return true;
                }
            }
        }
        //si no hay ningun sensor con el mismo id que queremos
        return false;
    }

    public Set<Sensor> sensoresTipo(String tipo) {

        Set<Sensor> devuleto = new HashSet<Sensor>();

        for (Sensor i : this.sensores) {
            if (i.getTipo().equals(tipo)) { //si es igual al tipo deseado
                //asumimos que en nuestro set no hay sensores repetidos
                devuleto.add(i); //añadimos ese sensor
            }
        }
        return devuleto;
    }

    /*Tengo que devolver un array de sensores*/
    /*Doble bucle*/

    public Sensor[] sensorMaxValor(String tipo) {

        ArrayList<Sensor> arraySensores = new ArrayList<>();
        float max = Float.MIN_VALUE; //asignamos un valor para comprobar el error

        //for para comprobar el maximo
        for (Sensor i : this.sensores) {
            if (i.getTipo().equals(tipo)) {
                if (i.maximo() >= max) {
                    max = i.maximo(); //el valor maximo pasa a ser el valor del sensor
                }
            }
        }
        //si el maximo es ese valor quiere decir que los sesnores tiene rango nulo por lo que lo devuelvo vacio
        if(max == Float.MIN_VALUE) return new Sensor[0];

        //bucle para añadir al array los sensores cuyo valor sea igual al máximo
        for (Sensor i : this.sensores) {
            if (i.getTipo().equals(tipo)) {
                if (i.maximo() == max) {
                    arraySensores.add(i);

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

        ArrayList<Sensor> arraySensores = new ArrayList<>(); //tamaño 10 ya que no tenemos tantos sensores en la estancia
        float min = Float.MAX_VALUE; //asignamos un valor para comprobar el error

        //for para comprobar el maximo
        for (Sensor i : this.sensores) {
            if (i.getTipo().equals(tipo)) {
                if (i.minimo() <= min) {
                    min = i.minimo(); //el valor maximo pasa a ser el valor del sensor
                }
            }
        }
        //si el MINIMO es ese valor quiere decir que los sensores tiene rango nulo por lo que lo devuelvo vacio
        if(min == Float.MAX_VALUE) return new Sensor[0];


        //bucle para añadir al array los sensores cuyo valor sea igual al máximo
        for (Sensor i : this.sensores) {
            if (i.getTipo().equals(tipo)) {
                if (i.minimo() == min) {
                    arraySensores.add(i);
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

        ArrayList<Float> valores = new ArrayList<>();//declaramos un array list para poder devolver los valores

        for (Sensor i : sensores) { //recorremos los sensores
            if (i.getId().equals(id)) { //si el id del sensor es el mismo
                for (int j = 0; j < i.getDatos().size(); j++) { //recorremos los datos del sensor
                    if (i.getDatos().get(j) > valor) {
                        valores.add(i.getDatos().get(j)); //añadimos al array list el valor
                    }
                }
            }
        }

        return valores;
    }

    /*Controlar la coma*/
    public String imprimirSensores() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete

        boolean flag=false;
        for (Sensor i :this.sensores) {
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

        for (Sensor i :this.sensores) {
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
                + (this.planta>=2 ? " \"planta\" : \"" +  this.planta + "\",\n" : "")
                + (!this.sensores.isEmpty() ? " \"sensores\" : \"" +  imprimirSensores() + "\",\n" : "")
                + (this.coste>=0 ? " \"coste\" : " +  this.coste + ",\n" : "")
                + (!this.sensores.isEmpty() ? " \"sensores_media\" : " +  imprimirSensoresMedia() + ",\n" : "")

                + "}";
    }
}

