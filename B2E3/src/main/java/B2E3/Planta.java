package B2E3;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Planta {

    private int numero;
    private String tipo;

    private Edificio edificio;
    private HashMap<String,Estancia> estancias;
    private float presupuesto;
    private HashMap<String,Sensor> sensoresConProblemas;

    //lo comento por el grupo de clase un compañero que el profesor le recomendo realizar este atributo para tener los sensores que fueron eliminados
    private HashMap<String,Sensor> sensoresDadosDeBaja;


    /*Constructores*/

    /*Presupuesto*/
    public Planta(int numero,String tipo, Edificio edificio, HashMap<String,Estancia> estancias){

        if(numero>-2 && numero<6){
            this.numero=numero;
        }else this.numero=Integer.MIN_VALUE; //controlamos si es un valor valido o no

        setTipo(tipo); //tenemos el set creado

        this.presupuesto=Float.MIN_VALUE; //controlar valor

        /*NO DEBE DE SER VACIO EL HASH SET*/
        setEstancias(estancias);

        setEdificio(edificio);


        int suma=0;//auxuliar que nos permite actualizar el presupuesto

        for(Estancia estancia: estancias.values()){
            suma+=estancia.getCoste();
            //si no hay coste en los productos el precio es cero

        }
        //apliacamos el 10% a mayores

        this.presupuesto= suma+(suma*0.10f);

        this.sensoresConProblemas= new HashMap<>();

        this.sensoresDadosDeBaja= new HashMap<>();


    }
    public Planta(int numero,String tipo){

        if(numero>-2 && numero<6){
            this.numero=numero;
        }else this.numero=Integer.MIN_VALUE; //controlamos si es un valor valido o no

        setTipo(tipo); //tenemos el set creado

        this.edificio=null;

        this.sensoresConProblemas= new HashMap<>();

        this.sensoresDadosDeBaja= new HashMap<>();

        this.presupuesto=Float.MIN_VALUE; //controlar valor
        int suma=0;//auxuliar que nos permite actualizar el presupuesto

        this.estancias= new HashMap<>();

        //el presupuesto va a ser siempre cero ya que no le estamos pasando ninguna estancia
    }

    /*Setters*/

    public void setEdificio(Edificio edificio) {

        if (edificio != null) {
            this.edificio = edificio;

        } else {
            this.edificio = null; //valor que le damos para comprobar si es valido o no el valor
        }
    }
    public void setEstancias(HashMap<String, Estancia> estancias) {
        if(estancias!=null){
            this.estancias=new HashMap<>(estancias);
        }else {
            this.estancias = new HashMap<>(); //declaramos un hashmap vacio
        }
    }

    public void setTipo(String tipo) {

        if(tipo!=null) {
            if (tipo.equals("oficinas") ||
                    tipo.equals("viviendas libres") ||
                    tipo.equals("viviendas de proteccion oficial") ||
                    tipo.equals("administracion")) {

                this.tipo = tipo;
            }
        }else{
            this.tipo="NOT-VALID-TYPE"; //valor no valido para tipo

        }

    }

    /*Getters*/

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public HashMap<String, Estancia> getEstancias() {
        return estancias;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public HashMap<String, Sensor> getSensoresConProblemas() {
        return sensoresConProblemas;
    }
    //hacemos el getter para este atributo nuevo
    public HashMap<String, Sensor> getSensoresDadosDeBaja() {
        return sensoresDadosDeBaja;
    }

    /*METODOS FUNCIONALES*/
    //en estas dos funciones controlamos
    public boolean darAltaEstancia(Estancia estancia) {

        if (estancia != null) {
            if (estancia.getPlanta().getNumero() == this.getNumero()) {
                this.estancias.put(estancia.getNombre(), estancia);
                this.presupuesto+=estancia.getCoste()*1.1;
                return true;
            }

        }
        return false;
    }
    public boolean darAltaEstancia(ArrayList<Estancia> estancias) {

        boolean control=true;

        //recorremos el arraylist
        for (Estancia estancia : estancias) {
            //si coinciden las plantas
            if (estancia.getPlanta().getNumero() == this.getNumero()) {
                //añadimos al hash map las estancias con su nombre como clave
                this.estancias.put(estancia.getNombre(), estancia);
                //cada vez que metamos una estancia actualizamos el presupuesto
                this.presupuesto+=estancia.getCoste()*1.1;
            //si alguna no se mete
            }else{
                control=false;
            }
        }
        return control;
    }
    public void darAltaSensor(String id,Sensor sensor){

        if(sensor!=null){
            if(!id.equals("ID-NO-VALIDA")){
                for(Estancia estancia: this.estancias.values()) {
                    //si la id es igual al nombre que queremos
                    //añadimos el sensor a esta estancia
                    if (estancia.getNombre().equals(id)) {
                        //damos de alta el sensor
                        estancia.darAlta(sensor);
                    }
                }
                //debemos actualizar el presupuesto
                this.presupuesto=0; //reiniciamos el presupuesto
                int suma=0;
                //volvemos a recorrer el bucle para actualizar el presupuesto

                for(Estancia estancia: estancias.values()){
                    suma +=estancia.getCoste();
                    //si no hay coste en los productos el precio es cero
                }
                this.presupuesto= suma + (suma*0.10f); //aplicamos el 10%
            }
        }
    }

    public void darAltaSensor(String id, ArrayList<Sensor> sensores){

        if(sensores!=null){
            if(!id.equals("ID-NO-VALIDA")){
                for(Estancia estancia: this.estancias.values()) {
                    //si la id es igual al nombre que queremos
                    //añadimos el sensor a esta estancia
                    if (estancia.getNombre().equals(id)) {
                        //Recorremos nuestro Arraylist
                        for(Sensor sensor: sensores){
                            //damos de alta el sensor
                            estancia.darAlta(sensor);
                        }
                    }
                }
                //debemos actualizar el presupuesto
                this.presupuesto=0; //reiniciamos el presupuesto
                int suma=0;
                //volvemos a recorrer el bucle para actualizar el presupuesto

                for(Estancia estancia: estancias.values()){
                    suma +=estancia.getCoste();
                    //si no hay coste en los productos el precio es cero
                }
                this.presupuesto= suma + (suma*0.10f); //aplicamos el 10%
            }
        }
    }

    public void darBajaSensor(String id,Sensor sensor){

        if(sensor!=null) {
            if (!id.equals("ID-NO-VALIDA")) {
                for (Estancia estancia : this.estancias.values()) {
                    //añadimos al nuevo atributo el elemento que damos de baja
                    this.sensoresDadosDeBaja.put(id,estancia.getSensores().get(id));
                    //si no es dado de baja correctamente debemos eliminarlo
                    if(estancia.darBaja(id)){ //devuelve verdadero si se dio de baja el sensor
                        //añadimos el nuevo sensor al array
                        estancia.darAlta(sensor);
                        this.sensoresConProblemas.put(id,sensor);
                        //si ya me encontro el sensor que queria salgo de esa interaccion
                        break;
                    }else{
                        //si no se dio de baja correctamente lo eliminamos
                        this.sensoresDadosDeBaja.remove(id);
                    }
                }
                //debemos actualizar el presupuesto
                this.presupuesto=0; //reiniciamos el presupuesto
                int suma=0;
                //volvemos a recorrer el bucle para actualizar el presupuesto

                for(Estancia estancia: estancias.values()){
                    suma +=estancia.getCoste();
                    //si no hay coste en los productos el precio es cero
                }
                this.presupuesto= suma + (suma*0.10f); //aplicamos el 10%
            }
        }
    }

    public Set<Sensor> sensoresTipo(String tipo){

        //si el tipo no es valido devuelvo vacio el set
        Set<Sensor> devuleto = new HashSet<Sensor>();

        if(tipo==null) return devuleto;

        Iterator<Estancia> iteradorEstancia = this.estancias.values().iterator();
        Estancia estancia;

        while (iteradorEstancia.hasNext()){
            estancia=iteradorEstancia.next();
            //ahora debemos de recorrer los sesnores dentro de cada estancia
            Iterator<Sensor> iteradorSensor = estancia.getSensores().values().iterator();
            Sensor sensor;
            while(iteradorSensor.hasNext()){
                sensor=iteradorSensor.next();
                //si el tipo del sensor es el que queremos añadimos el valor
                if(sensor.getTipo().equals(tipo)){
                    devuleto.add(sensor);
                }
            }
        }
        return devuleto;
    }

    //devuelve un Set con los sensores defectuosos de sensores con problemas
    public Set<String> tipoSensoresMasDefectuosos(){

        //si el tipo no es valido devuelvo vacio el set
        int temperatura=0,humedad=0,sonido=0,luz=0;

        Set<String> devuleto = new HashSet<String>();

        //Recorremos nuestros sensores estropeados
        Iterator<String> iteradorSensores = this.sensoresDadosDeBaja.keySet().iterator();
        String sensoresKey;

        while (iteradorSensores.hasNext()){
            sensoresKey=iteradorSensores.next();
            //debemos obtener el tipo de los sensores que substituyeron a los sensores viejos
            //devolcemos un set con los tipos de sensores que han sido cambiados
            devuleto.add(this.sensoresDadosDeBaja.get(sensoresKey).getTipo());
        }

        return devuleto;
    }
    public String imprimirEstancias() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete

        boolean flag=false;
        for (Estancia estancia :this.estancias.values()) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + estancia.getNombre() + "\"";
            flag=true;
        }
        dato += "]";
        return dato;

    }
    public String imprimirSensoresConProblemas() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "["; //asignamos a nuestro string en primer lugar el corchete

        boolean flag=false;
        for (String key :this.sensoresConProblemas.keySet()) {
            if(flag){
                dato+= ",";
            }
            //imprimimos la llave
            dato += "\"" + key + "\"";
            flag=true;
        }
        dato += "]";
        return dato;
    }
    @Override
    public int hashCode(){
        int valor=1;
        final int primo = 67;
        if(this.numero==Integer.MIN_VALUE)return 0;
        //pueden ser de un mismo tipo pero el numero tiene que ser diferente por lo que nos sirve este hash code

        //tambien valdria utilizar this.edificio.hashCode();
        return primo*valor + this.numero + this.tipo.hashCode(); //mas el hashcode de la planta en este caso
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
        final Planta nuevo = (Planta) obj;
        if (this.numero!=nuevo.numero){ //si ss numeros son distintos
            if(!(this.edificio == nuevo.edificio)) { //si estan en distinto edificio
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.numero!=Integer.MIN_VALUE ? " \"numero\" : \"" +  this.numero + "\",\n" : "")
                + (!this.tipo.equals("NOT-VALID-TYPE")? " \"tipo\" : \"" +  this.tipo + "\",\n" : "")
                + (this.edificio!=null ? " \"edificio\" : \"" +  this.edificio.getId() + "\",\n" : "")
                + (!this.estancias.isEmpty() ? " \"estancias\" : " + this.imprimirEstancias() + ",\n" : "")
                + (this.presupuesto!=Float.MIN_VALUE ? " \"presupuesto\" : " +  this.presupuesto + ",\n" : "")
                + (!this.sensoresConProblemas.isEmpty() ? " \"sensoresConProblemas\" : " + this.imprimirSensoresConProblemas()  + ",\n" : "")

                + "}";
    }

}
