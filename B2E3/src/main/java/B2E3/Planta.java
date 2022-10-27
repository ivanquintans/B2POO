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


    /*Constructores*/

    /*Presupuesto*/
    public Planta(int numero,String tipo, Edificio edificio, HashMap<String,Estancia> estancias){

        if(numero>-2 && numero<6){
            this.numero=numero;
        }else this.numero=Integer.MIN_VALUE; //controlamos si es un valor valido o no

        setTipo(tipo); //tenemos el set creado

        /*NO DEBE DE SER VACIO EL HASH SET*/
        setEstancias(estancias);

        setEdificio(edificio);

        this.presupuesto=Float.MIN_VALUE; //controlar valor

        for(Estancia estancia: estancias.values()){
            this.presupuesto+=estancia.getCoste();
            //si no hay coste en los productos el precio es cero

        }

        this.sensoresConProblemas= new HashMap<>();



    }
    public Planta(int numero,String tipo){

        if(numero>-2 && numero<6){
            this.numero=numero;
        }else this.numero=Integer.MIN_VALUE; //controlamos si es un valor valido o no

        setTipo(tipo); //tenemos el set creado

        this.sensoresConProblemas= new HashMap<>();

        for(Estancia estancia: estancias.values()){
            this.presupuesto+=estancia.getCoste();
            //si no hay coste en los productos el precio es cero

        }

        this.estancias= new HashMap<>();

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

        this.estancias=new HashMap<>(estancias); //declaramos un hashmap vacio

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

    /*METODOS FUNCIONALES*/

    public boolean darAltaEstancia(Estancia estancia) {

        if (estancia.getPlanta().getNumero() == this.getNumero()) {
            this.estancias.put(estancia.getNombre(),estancia);
            return true;
        }
        return false;
    }

    public boolean darAltaEstancia(ArrayList<Estancia> estancias){

        //recorremos el arraylist
        for(Estancia estancia :  estancias){
            //si coinciden las plantas
            if(estancia.getPlanta().getNumero()==this.getNumero()){
                //añadimos al hash map las estancias con su nombre como clave
                this.estancias.put(estancia.getNombre(),estancia);
                return true;
            }
        }
        return false;
    }
    /*Presupuesto de la planta*/
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
                //volvemos a recorrer el bucle para actualizar el presupuesto

                for(Estancia estancia: estancias.values()){
                    this.presupuesto+=estancia.getCoste();
                    //si no hay coste en los productos el precio es cero
                }
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
                //volvemos a recorrer el bucle para actualizar el presupuesto

                for(Estancia estancia: estancias.values()){
                    this.presupuesto+=estancia.getCoste();
                    //si no hay coste en los productos el precio es cero
                }
            }
        }
    }

    public void darBajaSensor(String id,Sensor sensor){

        if(sensor!=null) {
            if (!id.equals("ID-NO-VALIDA")) {
                for (Estancia estancia : this.estancias.values()) {
                    //recorremos los sensores buscando la id del sensor
                    for (Sensor i : estancia.getSensores().values()) {
                        if (i.getId().equals(id)) {
                            //eliminamos el sensor cuya id sea la que queramos
                            estancia.getSensores().remove(id);
                            //añadimos el sensor que lo substutuye a los sensores con problemas
                            this.sensoresConProblemas.put(id, sensor);
                            //añadimos el nuevo sensor con la id del sensor eliminado
                            estancia.getSensores().put(id, sensor);
                        }
                    }
                }
                //debemos actualizar el presupuesto
                this.presupuesto = 0; //reiniciamos el presupuesto
                //volvemos a recorrer el bucle para actualizar el presupuesto

                for (Estancia estancia : estancias.values()) {
                    this.presupuesto += estancia.getCoste();
                    //si no hay coste en los productos el precio es cero
                }
            }
        }
    }

    public Set<Sensor> sensoresTipo(String tipo){

        //si el tipo no es valido devuelvo vacio el set

        Set<Sensor> devuleto = new HashSet<Sensor>();

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
    /*Debemos obtener el tipo mas defectuoso*/
    /*Corregir*/
    public Set<String> tipoSensoresMasDefectuosos(){

        //si el tipo no es valido devuelvo vacio el set
        int temperatura=0,humedad=0,sonido=0,luz=0;

        Set<String> devuleto = new HashSet<String>();

        Iterator<String> iteradorSensores = this.sensoresConProblemas.keySet().iterator();
        String sensoresKey;

        while (iteradorSensores.hasNext()){
            sensoresKey=iteradorSensores.next();
            //debemos obtener el tipo de los sensores que substituyeron a los sensores viejos
            switch (this.sensoresConProblemas.get(sensoresKey).getTipo()){
                //vamos a contar las veces que se repite cada sensor para saber cual es el que mas se repite

                case("temperatura"):

                    temperatura++;
                    break;

                case("sonido"):

                    sonido++;
                    break;

                case("humedad"):

                    humedad++;
                    break;

                case("luz"):

                    luz++;
                    break;
            }

            /*Corregir esto*/
            /*MALA INTERPRETACION DEL RESULTADO*/

            String[] auxiliar = {"temperatura","humedad","sonido","luz"}; //declaro el array de tipos
            Integer[] contadores = {temperatura,humedad,sonido,luz}; //declaro el array de contadores en el mismo orden
            int max=1;

            for (Integer contador : contadores) {
                if (contador >= max) {
                    max = contador;
                }
            }
            //recorremos para saber si hay mas de un max
            for(int i=0;i<contadores.length;i++) {
                if (contadores[i] == max) {
                    //añadimos a nuesto Set
                    devuleto.add(auxiliar[i]);
                }
            }
        }
        return devuleto;
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

}
