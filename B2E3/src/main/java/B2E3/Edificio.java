package B2E3;

import sun.security.action.PutAllAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Edificio {

    private String id;

    private int [] rango;

    private HashMap<Integer,Planta> plantas;

    private float presupuesto;

    /*Constructores*/

    public Edificio(String id, int [] rango, ArrayList<Planta> plantas){

        if(id!=null){
            this.id =id;
        }else{
            this.id="ID-NO-VALIDA"; //valor no valido para id
        }

        setRango(rango); //llamamos al setter que ya hace las comprobaciones

        this.plantas = new HashMap<Integer,Planta>();

        for(Planta planta : plantas){
            if(planta.getNumero()>-2 && planta.getNumero()<6){ //si el numero de la planta se encuentra en el rango de plantas del edificio
                if(!this.plantas.containsKey(planta.getNumero())){ //si ya hay una planta en el edificio con el numero
                    this.plantas.put(planta.getNumero(),planta);
                }
            }
        }
        //si no hay plantas que cumplan las condiciones el hash map va a estar vacio

        this.presupuesto=Float.MIN_VALUE; //controlar valor

        for(Planta planta: this.plantas.values()){ //iteramos en el hashmap de plantas
            this.presupuesto+=planta.getPresupuesto(); //añadimos el presupuesto de la planta al edificio
            //si no hay coste en los productos el precio es MIN_VALUE
        }
    }


    /*Setters*/

    public void setRango(int[] rango) {

        //comprobamos que el rango sea
        //distinto de null
        //que tenga un maximo y un minimo
        //que el maximo sea mayor que el minimo
        //que el rango este comprendido entre la planta menso dos y la 6

        if(rango!=null && rango.length==2  && (rango[0]<rango[1] && rango[0]>-2 && rango[1]>6)){

            //comprobar el aliasing

            this.rango = new int[2]; //creamos un nuevo objeto para de esta manera evitar que se produzca aliasing

            //asignamos los valores

            this.rango[0]=rango[0];
            this.rango[1]=rango[1];
        }
        else{

            this.rango = new int[2]; //creamos un nuevo objeto para de esta manera evitar que se produzca aliasing

            //SI PASAN UN VALOR NO VALIDO

            this.rango[0]= Integer.MIN_VALUE;
            this.rango[1]= Integer.MAX_VALUE;

        }
    }

    /*Getters*/

    public String getId() {

        return id;
    }

    public int[] getRango() {
        return rango;
    }

    public HashMap<Integer, Planta> getPlantas() {
        return plantas;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    /*Metodos funcionales*/

    public boolean darAltaPlanta(Planta planta){

        if(planta.getNumero()>-2 && planta.getNumero()<6){ //si el numero de la planta se encuentra en el rango de plantas del edificio
            if(!this.plantas.containsKey(planta.getNumero())){ //si ya hay una planta en el edificio con el numero
                this.plantas.put(planta.getNumero(),planta);
            }
        }
        //añadimos la planta al hash map

    public int[] plantasNoAlta(){

    }

    public Set<Planta> plantasMasCaras(){


    }

    public HashMap<String,Estancia> plantasMasProblemas(){

    }

    public String imprimirPlantas() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete

        boolean flag=false;
        for (Planta planta :this.plantas.values()) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + planta.getNumero() + "\"";
            flag=true;
        }
        dato += "]";
        return dato;

    }

    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.id.equals("ID-NO-VALIDA") ? " \"id\" : \"" +  this.id + "\",\n" : "")
                + (!this.plantas.isEmpty() ? " \"plantas\" : \"" + this.imprimirPlantas()  + "\",\n" : "")
                + (this.presupuesto!=Float.MIN_VALUE ? " \"presupuesto\" : \"" +  this.presupuesto + "\",\n" : "")

                + "}";
    }
}

