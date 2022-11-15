package B2E3;

import sun.security.action.PutAllAction;

import java.util.*;

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
            //SI EL RANGO NO ES VALIDO NO METEMOS NINGUNA PLANTA
            if(planta.getNumero()>=this.rango[0] && planta.getNumero()<=this.rango[1]){ //si el numero de la planta se encuentra en el rango de plantas del edificio
                if(!this.plantas.containsKey(planta.getNumero())){ //si ya hay una planta en el edificio con el numero
                    this.plantas.put(planta.getNumero(),planta);
                    //aunque en el boletin no se especifique debemos actualizar el edificio
                    planta.setEdificio(this);
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

        if(rango!=null && rango.length==2  && (rango[0]<rango[1] && rango[0]>-2 && rango[1]<6)){

            //comprobar el aliasing

            this.rango = new int[2]; //creamos un nuevo objeto para de esta manera evitar que se produzca aliasing

            //asignamos los valores

            this.rango[0]=rango[0];
            this.rango[1]=rango[1];
        }
        else{

            this.rango = new int[2]; //creamos un nuevo objeto para de esta manera evitar que se produzca aliasing

            //SI PASAN UN VALOR NO VALIDO

            //SI EL RANGO NO ES VALIDO NO PERMITE METER NINGUN OTRO VALOR
            this.rango[0]= Integer.MAX_VALUE;
            this.rango[1]= Integer.MIN_VALUE;

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

    public boolean darAltaPlanta(Planta planta) {

        if (planta.getNumero() >= this.rango[0] && planta.getNumero() <= this.rango[1]) { //si el numero de la planta se encuentra en el rango de plantas del edificio
            if (!this.plantas.containsKey(planta.getNumero())) { //si ya hay una planta en el edificio con el numero
                this.plantas.put(planta.getNumero(), planta);
                //aunque en el boletin no se especifique debemos actualizar el edificio
                planta.setEdificio(this);


                return true;
            }
        }
        //debemos actualizar el presupuesto
        this.presupuesto=0; //reiniciamos el presupuesto
        //volvemos a recorrer el bucle para actualizar el presupuesto

        for(Planta i: plantas.values()){
            this.presupuesto+=i.getPresupuesto();
            //si no hay coste en los productos el precio es cero
        }
        return false;
    }


    public int[] plantasNoAlta(){

        //declaramos un arraylist con todas las plantas posibles

        ArrayList<Integer> numeros = new ArrayList<>();

        //recorremos el rango posible y vemos si los elementos del rango estan dados de alta
        for(int num=rango[0];num<=rango[1];num++){
            if(!this.plantas.containsKey(num)){
                //si no esta dada de alta la añadimosx
                numeros.add(num);
            }
        }
        int[] solucion = new int[numeros.size()];

        //recorro el arraylist y copio en el vector mi array
        for (int i=0;i<numeros.size();i++){
            solucion[i]=numeros.get(i);
        }
        return solucion;
    }

    public Set<Planta> plantasMasCaras(){

        Set<Planta> arrayPlantas = new HashSet<>();
        float max = Float.MIN_VALUE; //asignamos un valor para comprobar el error

        //for para comprobar el maximo

        for (Integer num : this.plantas.keySet()) {
            if (this.plantas.get(num).getPresupuesto() >= max) {
                max = this.plantas.get(num).getPresupuesto(); //el valor maximo pasa a ser ese presupuesto
            }

        }
        //si el MINIMO es ese valor quiere decir que el presupuesto tiene un rango no valido por lo que devolvemos vacio
        if(max == Float.MIN_VALUE) return arrayPlantas;


        //bucle para añadir al array los sensores cuyo valor sea igual al máximo

        for (Integer num : this.plantas.keySet()) {
            if (this.plantas.get(num).getPresupuesto() == max) {
                //if(!arrayPlantas.contains(this.plantas.get(num))) { //comprobamos si esta dentro el elemento
                arrayPlantas.add(this.plantas.get(num)); //añadimos la planta al array
                //}
            }
        }
        return arrayPlantas; //devolvemos el array final
    }

    public HashMap<Integer,Set<Estancia>> plantasMasProblemas(){

        HashMap<Integer,Set<Estancia>> resultado = new HashMap<>();

        //creamos un hash map con el numero de repeticiones y la id de la estancia

        int contador;

        //recorro las plantas
        for(Planta planta : this.plantas.values()){
            HashMap<String,Integer> maximos = new HashMap<>();
            Set<Estancia> estancias = new HashSet<>();
            for(Sensor sensorDefectuoso : planta.getSensoresDadosDeBaja().values()){
                String idEstancia=sensorDefectuoso.getEstancia().getNombre();
                if(!maximos.containsKey(idEstancia)){
                    //añadimos la estancia con la id y el contador de las interacciones
                    contador=1;
                    maximos.put(idEstancia,contador);
                }else{
                    //pillamos el valor actual del contador
                    contador=maximos.get(idEstancia)+1;
                    maximos.replace(idEstancia,contador);
                }
            }
            //una vez acabamos de recorrerr las estancias debemos buscar cual es el valor maximo
            int max = Integer.MIN_VALUE; //asignamos un valor para comprobar el error

            String idMaximo;

            //buscamos cual es el valor maximo
            for(Map.Entry<String,Integer> maximo : maximos.entrySet()){
                if(maximo.getValue()>max){
                    max=maximo.getValue();
                    idMaximo= maximo.getKey();
                }
            }
            //volvemos a recorrer buscando si hay algun valor maximo igual

            for(Map.Entry<String,Integer> maximo : maximos.entrySet()){
                if(maximo.getValue()==max){
                    //añadimos la estancia a nuestro set
                    idMaximo= maximo.getKey();
                    estancias.add(planta.getEstancias().get(idMaximo));
                    //añadimos el set de estancias al hashmap
                }
            }
            resultado.put(planta.getNumero(),estancias);

        }

        return resultado;

    }

    public String imprimirPlantas() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los sensores. asi hay mas modularidad en el código
        String dato = "[ {"; //asignamos a nuestro string en primer lugar el corchete

        boolean flag=false;
        for (Planta planta :this.plantas.values()) {
            if(flag){
                dato+= ",";
            }
            dato += "\"" + planta.getNumero() + "\"";
            flag=true;
        }
        dato += "} ]";
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

