import java.lang.reflect.Array;

/**
 *
 * @author Iván Quintáns Gonzalez
 */



public class Mensajeria {

    private String cif;

    private String nombre;

    private Paquete[] paquetes;

    private Float beneficio;


    // constructores


    public Mensajeria() { //constructor sin argumentos

        //declaramos a null los atributos que no aparecen en el constructor

        this.cif = null;
        this.nombre = null;
        this.paquetes = null;
        this.beneficio = null; //declarado a null porq no se sabe su valor hasta que se llame a la funcion de calcular el beneficio
    }


    //constructor con cif y nombre

    public Mensajeria(String cif, String nombre) {
        this.setCif(cif);
        this.setNombre(nombre);
        this.paquetes = null; //declaramos a null los valores que no usamos
        this.beneficio = null; //declarado a null porq no se sabe su valor hasta que se llame a la funcion de calcular el beneficio


    }


    //setters


    public void setCif(String cif) {
        if (cif != null) {
            this.cif = cif;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    //getters


    public String getCif() {
        return this.cif;
    }

    public String getnombre() {

        return this.nombre;
    }

    public Paquete[] getPaquetes() {

        return this.paquetes;
    }

    public Float getBeneficio() {

        return this.beneficio;
    }


    //metodos funcionales

    public void enviarPaquete(Paquete paquete) {

        int longitud; //declaramos una longitud

        Paquete[] listaPaquetes = this.getPaquetes(); //alamceno los paquetes que se encuentran en el atributo paquetes en un array auxiliar

        if (listaPaquetes == null) {
            longitud = 0; //si no hay paquetes en la lista la longitud es cero

        } else longitud = listaPaquetes.length; //en otro caso la longitud es el tamaño del array

        Paquete[] auxiliar = new Paquete[longitud + 1]; //creamos un array de tamaño longitud mas uno, para cada vez que entramos en enviar el tamaño del array aumente en uno

        //debemos comprobar si el paquete ya está en el array para que no se repita

        for (int i = 0; i < longitud; i++) {
            if (paquete.equals(listaPaquetes[i])) { //utilizamso el metodo equals que implementamos
                return;

            } else {
                auxiliar[i] = listaPaquetes[i]; //hacemos una copia en el array de tamaño mas uno
            }
        }

        auxiliar[longitud] = paquete; //le añadimos el valor en la ultima posición

        this.paquetes = auxiliar; //copiamos el array en el atributo correspondiente y asi lo actualizamos

        this.beneficio = calcularBeneficio(); //aqui es donde actualizamos el valor del beneficio del paquete ya que así se actualiza el valor siempre que actualicemos la lista.

        //revisar con los returns


    }

    public String[] marcasFrecuentes() {

        int maximo=1; // declaramos el array a uno ya que si es cero no hay ninguna moda
        int n=0; //



        //declaramos los contadores para determinar las modas

        int iphone=0;
        int hp=0;
        int amazon=0;
        int microsoft=0;
        int samsung=0;
        int asus=0;

        int numeroPaquetes = this.paquetes.length;

        for(int i=0;i<numeroPaquetes;i++){ //recorremos los paquetes

            Producto[] productos = paquetes[i].getProductos(); //creamos un array en ele que guardamos todos los productos para poder recorrer las marcas
            int numeroProductos = productos.length; //longitud del array de productos que tenemos que recorrer

            for(int j=0;j<numeroProductos;j++){ //recorremos los productos

                //COMPROBAMOS SI HAY QUE PONERLE LA MARCA

                if(productos[j].getMarca()!=null) {

                    switch (productos[j].getMarca()) { //pillamos la marca de cada producto

                        case "HP": //si es hp incrementamos su contador
                            hp++;
                            break;

                        case "Amazon": //si es amazon incrementamos su contador
                            amazon++;
                            break;

                        case "Asus": //si es asus incrementamos su contador
                            asus++;
                            break;

                        case "iPhone": //si es iphone incrementamos su contador
                            iphone++;
                            break;

                        case "Microsoft": //si es microsoft incrementamos su contador
                            microsoft++;
                            break;

                        case "Samsung": //si es samsung incrementamos su contador
                            samsung++;
                            break;

                    }
                }
            }
        }

        String[] auxiliar = {"Samsung","HP","Microsoft","Asus","iPhone","Amazon"}; //declaro el array de marcas
        Integer[] contadores = {samsung,hp,microsoft,asus,iphone,amazon}; //declaro el array de contadores en el mismo orden

        for(int i=0;i<auxiliar.length;i++) {
            if (contadores[i] >= maximo) {
                maximo = contadores[i];
            }
        }

        for(int i=0;i<auxiliar.length;i++){
            if (contadores[i]==maximo){
                n++;
            }
        }
        int j=0;
        String[] modas = new String[n]; //creamos el array de tamaño n
        for(int i=0;i<auxiliar.length;i++){
            if (contadores[i]==maximo){
                modas[j]=auxiliar[i];
                j++;
            }
        }

        return modas;








    }

    public Producto[] productosCaros(float precioMin) {


        int k = 0;
        int numeroPaquetes = this.paquetes.length;
        Producto[] arrayProductosCaros = new Producto[15]; //lo pongo asi, para que una persona no pueda comprar mas de 15 productos en un paquete porque no entran

        for (int i = 0; i < numeroPaquetes; i++) { //iteramos por los paquetes

            Producto[] productos = paquetes[i].getProductos(); //creamos un array en ele que guardamos todos los productos
            int numeroProductos = productos.length; //longitud del producto

            for (int j = 0; j < numeroProductos; j++) { //iteramos por cada producto

                if (productos[j].getPrecio() > precioMin) { //si su precio es mayor que el mínimo
                    arrayProductosCaros[k] = productos[j]; //añadimos el producto al array creado
                    k++; //aumentamos k para recorrer el array

                }

            }

        }
        return arrayProductosCaros;


    }

    private float calcularBeneficio() {

        float beneficio = 0;

        for (int i = 0; i < this.paquetes.length; i++) {

            if(paquetes[i].getPrecio()==null){
                beneficio+=0; //le devolvemos el valor cero ya que tenemos definido como null el precio

            }else beneficio += paquetes[i].getPrecio(); //me da aqui el error

        }

        return beneficio; //devolvemos el valor del beneficio actual pero no lo actualizamos


    }

    public String imprimirPaquetes() {
        String mispaquetes = "["; //asignamos a nuestro string en primer lugar el corchete
        for (int i = 0; i < this.paquetes.length; i++) { //para cada poblacion de nuestra trayectoria
            mispaquetes += "\"" + this.paquetes[i].getId() + "\""; //añadimos el valor que queremos
            if (i < this.paquetes.length - 1) { //escribimos la coma en todos los sitios menos en el ultimo lugar
                mispaquetes += ",";
            }


        }
        mispaquetes += "]";
        return mispaquetes; //devolvemos el string
    }

    public String imprimirModas(String[] modas) {
        String mimodas = "["; //asignamos a nuestro string en primer lugar el corchete
        for (int i = 0; i < modas.length; i++) { //para cada poblacion de nuestra trayectoria
            mimodas += "\"" + modas[i] + "\""; //añadimos el valor que queremos
            if (i < modas.length - 1) { //escribimos la coma en todos los sitios menos en el ultimo lugar
                mimodas += ",";
            }


        }
        mimodas += "]";
        return mimodas; //devolvemos el string
    }

    public String imprimirProductos(Producto[] arrayProductosCaros ) { //la pongo como publica ya que de esta forma en la calse principal puedo imprimir los valores de los productos. asi hay mas modularidad en el código

        String producto = "["; //asignamos a nuestro string en primer lugar el corchete
        for (int i = 0; i < arrayProductosCaros.length; i++) { //para cada poblacion de nuestra trayectoria
            if(arrayProductosCaros[i]!=null) {
                producto += "\"" + arrayProductosCaros[i].getNumSerie() + "\""; //añadimos el numero de serie de cada producto añadidio
                if (i < arrayProductosCaros.length - 1) { //escribimos la coma en todos los sitios menos en el ultimo lugar
                    producto += ",";
                }
            }



        }
        producto += "]";
        return producto;
    }



    @Override
    public String toString() {
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.cif != null ? " \"cif\":\"" + this.cif + "\",\n" : "")
                + (this.nombre != null ? " \"nombre\":\"" + this.nombre + "\",\n" : "")
                + (this.paquetes != null ? " \"paquetes\":\"" + this.imprimirPaquetes() + "\",\n" : "")
                + (this.beneficio != null ? " \"beneficio\":" + this.beneficio + ",\n" : "")
                + "}";
    }
}

