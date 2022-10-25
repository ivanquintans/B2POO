import java.util.Objects;

/**
 *
 * @author Iván Quintáns Gonzalez
 */

public class Paquete { //CREAMOS LA CLASE

    private String id; // declaramos los atributos de la clase

    private String descripcion;

    private String  destino;

    private String[] trayectoActual;

    private Producto[] productos;

    private Float peso;

    private Float precio;

    public Paquete(String id){ //creamos el primer constructor
        if(id!=null) {//creamos el primmer producto
            this.id = id;
        }
        this.descripcion=null;
        this.destino=null;
        this.trayectoActual=null; //creo el array en el propio método
        this.productos=null;
        this.peso=null; //ya que el peso solo se puede asignar
        this.precio=null; // ya que el metodo se calcula con un metodo externo


    }

    public Paquete(String id, String destino, Producto[] productos){ // creamos el segundo constructor
        if(id!=null) {//creamos el primmer producto
            this.id = id;
        }
        this.setProductos(productos); //para poder asignar a null los distintos valores ya que float es primitivo
        this.setDestino(destino);
        this.descripcion=null;
        this.trayectoActual=null; //creo el array en el propio metodo
        this.peso=null; //ya que el peso solo se puede asignar
        this.precio=null; //ya que el precio se calcula con un metodo externo



    }


    //setter



    public void setDescripcion(String descripcion){ //comprobacion de que la descripcion es menor que 200 caracteres
        if(descripcion!=null){
            if (descripcion.length()>200) {
                this.descripcion= descripcion.substring(0,200); // si lo es concatenamos
            }
            else{
                this.descripcion= descripcion; // si no devolvemos la descripcion
            }
        }

    }

    public void setDestino(String destino){
        if(destino!=null){
            if (destino.equals("A Coruña") ||
                    destino.equals("Santiago De Compostela") ||
                    destino.equals("Lugo") ||
                    destino.equals("Vigo") ||
                    destino.equals("Pontevedra") ||
                    destino.equals("Ourense") ||
                    destino.equals("Lalín") ||
                    destino.equals("Verín") ||
                    destino.equals("Muros") ||
                    destino.equals("Noia") ||
                    destino.equals("Ferrol"))
            {
                this.destino= destino;
            }
        }

    }

    public void setProductos(Producto[] productos){
        if(productos!=null){
            this.productos= productos;
            this.calcularPeso();

            }
        }

    public void setPrecio(Float precio) {

        this.precio = precio;
    }




    //getters

    public String getId(){
        return this.id;
    }

    public String getDescripcion(){
        return this.descripcion;

    }

    public String getDestino(){
        return this.destino;

    }

    public String[] getTrayectoActual(){ //no se si aqui podria llamar a mi funcion imprimirruta ya que este getter no lo utilizo y asi dejo privada mi funcion

        return this.trayectoActual;
    }

    public Producto[] getProductos(){

        return productos;
    }

    public Float getPeso(){

        return this.peso;
    }

    public Float getPrecio(){

        return this.precio;
    }

//metodos funcionales



    public boolean actualizarTrayectoria(String poblacion){

        int longitud; //declaro un avariable para no tener que llamar cada interacción al string.length

        String[] trayectoLlamadas = this.getTrayectoActual(); //almaceno el array actual en mi array trayectollamadas
        if(trayectoLlamadas==null){
            longitud=0;

        }else longitud =trayectoLlamadas.length;

        String[] auxiliar = new String[longitud+1]; //creamos un array de tamaño longitud mas uno, para cada vez que entramos en actualizar el tamaño del array aumente en uno



        for(int i=0;i<longitud;i++) { //realizamos un for hasta la longitud
            if (poblacion.equals(trayectoLlamadas[i]) || (destino.equals(trayectoLlamadas[i]))) { //comprobamos que el elemento este en nuestro array y que no esté en la lista el desetino
                return false; // si es el destino el valor se mete pero se sale del metodo

            } else {
                auxiliar[i] = trayectoLlamadas[i]; // hacemos una copia del array en temporal


            }
        }

            auxiliar[longitud]= poblacion; //le añadimos el valor deseado

            this.trayectoActual=auxiliar; //actualizamos la trayectoria actual y la metemos como atributo del paquete

            return true;

        }

    private Float calcularPeso(){

        float sumapesos=0;// declaramos un peso auxiliar

        for(int i=0;i<this.productos.length;i++){ //realizamos un bucle recorriendo todos los productos del paquete
            sumapesos+=productos[i].getPeso(); // añadimos a nuestra variable el peso de cada producto por el que iteramos

        }
        sumapesos += sumapesos*0.1f;

        this.peso=sumapesos;

        return sumapesos;//devolvemso el peso del paquete


    }
    private Float calcularPrecioMinimo(){

        float precio_minimo=0; //declaramos la variable


        //ASIGNAMOS LOS PRECIOS DEPENDIENDO DEL PESO DEL PAQUTE
        //USAMOS EL METODO CalcularPeso para comprobar el peso de los paquete y así asignarle el precio deseado
        if(this.calcularPeso()<1.0f) precio_minimo=2.5f;

        else if(1.0f<this.calcularPeso() && this.calcularPeso()<3.0f) precio_minimo=4.0f;

        else if(this.calcularPeso()>3.0f) precio_minimo=this.calcularPeso()*1.05f;

        this.precio=precio_minimo; //devolvemos el precio minimo

        return precio_minimo; //devolvemos la variable deseada



    }
    public String imprimirRuta() { //tuve que hacerla publica para poder imprimir desde la clase principal mi ruta
        String ruta = "["; //asignamos a nuestro string en primer lugar el corchete
        for (int i = 0; i < this.trayectoActual.length; i++) { //para cada poblacion de nuestra trayectoria
            ruta += "\"" + this.trayectoActual[i] + "\""; //añadimos el valor que queremos
            if (i < this.trayectoActual.length - 1) { //escribimos la coma en todos los sitios menos en el ultimo lugar
                ruta += ",";
            }



        }
        ruta += "]";
        return ruta;
    }
    public String imprimirProductos() { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los productos. asi hay mas modularidad en el código
        String producto = "["; //asignamos a nuestro string en primer lugar el corchete
        for (int i = 0; i < this.productos.length; i++) { //para cada poblacion de nuestra trayectoria
            producto += "\"" + productos[i].getNumSerie() + "\""; //añadimos el numero de serie de cada producto añadidio
            if (i < this.productos.length - 1) { //escribimos la coma en todos los sitios menos en el ultimo lugar
                producto += ",";
            }



        }
        producto += "]";
        return producto;
    }

    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.id!=null ? " \"id\":\"" +  this.id + "\",\n" : "")
                + (this.descripcion!=null ? " \"descripcion\":\"" +  this.descripcion + "\",\n" : "")
                + (this.destino!=null ? " \"destino\":\"" +  this.destino + "\",\n" : "")
                + (this.trayectoActual!=null ? " \"trayectoriaActual\":" +  this.imprimirRuta() + ",\n" : "")
                + (this.productos!=null ? " \"productos\":" +  this.imprimirProductos() + ",\n" : "")
                + (this.peso!=null ? " \"peso\":\"" +  this.peso + "\",\n" : "")
                + (this.precio!=null ? " \"precio\":\"" +  this.precio + "\",\n" : "")
                + "}";
    }







}







