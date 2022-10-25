
package B2E3;

import java.util.ArrayList;


public class Sensor {

    private String id;

    private String tipo;

    private Estancia estancia;

    private ArrayList<Float> datos;

    private Float[] rango;

    private Float precio;


    /* Constructores */


    public Sensor(String id, String tipo, float[] rango, float precio){

        if(id!=null){
            this.id =id;
        }else{
            this.id="ID-NO-VALIDA"; //valor no valido para id
        }

        if(precio>0){
            this.precio=precio;
        }else{
            this.precio= Float.MIN_VALUE; // valor no valido para precio

        }
        if(tipo!=null) {
            if (tipo.equals("temperatura") ||
                    tipo.equals("sonido") ||
                    tipo.equals("luz") ||
                    tipo.equals("humedad")) {

                this.tipo = tipo;
            }
        }else{
            this.tipo="NOT-VALID-TYPE"; //valor no valido para tipo

        }

        //comprobamos que el rango sea
        //distinto de null
        //que tenga un maximo y un minimo
        //que el maximo sea mayor que el minimo

        if(rango!=null && rango.length==2  && (rango[0]<rango[1])){

            //comprobar el aliasing

            this.rango = new Float[2]; //creamos un nuevo objeto para de esta manera evitar que se produzca aliasing

            //asignamos los valores

            this.rango[0]=rango[0];
            this.rango[1]=rango[1];
        }
        else{

            this.rango = new Float[2]; //creamos un nuevo objeto para de esta manera evitar que se produzca aliasing

            //SI PASAN UN VALOR NO VALIDO

            this.rango[0]= Float.MIN_VALUE;
            this.rango[1]= Float.MAX_VALUE;

        }

        //inicializamos la estancia y vacia la Arraylist

        this.datos = new ArrayList<>();
        this.estancia=null;


    }

    /* setters */

    public void setEstancia(Estancia estancia) {

        if(estancia!=null){
            this.estancia = estancia;

        }else{

            this.estancia = null;
        }
    }



    /* getters */


    public ArrayList<Float> getDatos() {
        return datos;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    /* metodos funcionales */

    public float limiteInferior(){

        //devuleve el valor minimo
        return this.rango[0];

    }

    public float limiteSuperior(){

        //devuelve el valor máximo del rango
        return this.rango[1];

    }

    public void nuevoDato(float dato){

       //si el dato está en el rango valido
        if(dato>limiteInferior() && dato<limiteSuperior()) {

            //usando la funcion add añadimos el dato
            this.datos.add(dato);
        }
    }

    public float media(){

        if(this.datos.size()==0){
            return Float.MIN_VALUE; //SI NO HAY LIST DEVOLVEMOS ERROR QUE PODAMOS IDENTIFICAR COMO ERROR
        }
        float media=0;
        for (int i=0;i<this.datos.size();i++){
            media+= this.datos.get(i);
        }

        media= media/this.datos.size();

        return media ; //devolvemos el valor

    }

    public float maximo(){

        float max=Float.MIN_VALUE; //asignamos un valor para comprobar el error

        for (int i=0;i<this.datos.size();i++){

            if(this.datos.get(i)>=max){

                max = this.datos.get(i);

            }
        }

        return max; //devolvemos el valor

    }

    public float minimo(){

        float min=Float.MAX_VALUE; //asignamos un valor para comprobar el error

        for (int i=0;i<this.datos.size();i++){

            if(this.datos.get(i)<=min){

                min = this.datos.get(i);

            }
        }

        return min; //devolvemos el valor

    }
    public String imprimirRango() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los productos. asi hay mas modularidad en el código
        String rango = "["; //asignamos a nuestro string en primer lugar el corchete
            rango += "\"" + this.limiteInferior() + "\""+",";
            rango += "\"" + this.limiteSuperior() + "\"";
            rango += "]";
            return rango;
    }

    /*no me imprime bien*/
    public String imprimirDatos() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los productos. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete

        int i;
        if((this.datos.size()>10)){
            i=(this.datos.size()-10);

        }else{
            i=0;
        }

        for (;i < this.datos.size(); i++) {
            dato += "\"" + this.datos.get(i) + "\"";
            if (i < this.datos.size() - 1) { //escribimos la coma en todos los sitios menos en el ultimo lugar
                dato += ",";
            }
        }
        dato += "]";
        return dato;
    }

    @Override
    public int hashCode(){
        int valor=1;
        final int primo = 67;
        if(this.id==null)return 0;
        return primo*valor + this.id.hashCode();

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
        final Sensor nuevo = (Sensor) obj;
        if (!this.id.equals(nuevo.id)){
            return false;
        }
        return true;
    }

    /*Revisar espcios*/
    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (!this.id.equals("ID-NO-VALIDA") ? " \"id\" : \"" +  this.id + "\",\n" : "")
                + (!this.tipo.equals("NOT-VALID-TYPE") ? " \"tipo\" : \"" +  this.tipo + "\",\n" : "")
                + (this.estancia!=null ? " \"destino\" : \"" +  this.estancia + "\",\n" : "")
                + (this.rango!=null ? " \"rango\"  " +  this.imprimirRango() + ",\n" : "")
                + (this.datos!=null ? " \"valores\" : " +  this.imprimirDatos() + ",\n" : "")
                + (this.precio>0 ? " \"precio\"  " +  this.precio + ",\n" : "")
                + (this.minimo()!=Float.MAX_VALUE ? " \"minimo\" : \"" +  this.minimo() + "\",\n" : "")
                + (this.maximo()!=Float.MIN_VALUE ? " \"máximo\" : \"" +  this.maximo() + "\",\n" : "")
                + (this.media()!=Float.MIN_VALUE ? " \"media\" : \"" +  this.media() + "\",\n" : "")
                + "}";
    }

}
