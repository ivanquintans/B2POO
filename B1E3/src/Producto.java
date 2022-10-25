/**
 *
 * @author Iván Quintáns Gonzalez
 */
public class Producto {
    private String numSerie;
    private String nombre;
    private String descripcion;
    private String marca;
    private Float peso;
    private Float precio;
    private Paquete paquete;


    public Producto(String ns){
        if(ns!=null) {//creamos el primmer producto
            this.numSerie = ns;
        }
        this.precio = null;//para poder asignar a null los distintos valores ya que float es primitivo
        this.peso=null;
        this.marca=null;
        this.nombre=null;
        this.paquete=null;
        this.descripcion=null;


    }

    //creamos el segundo producto

    public Producto(String ns, String nombre, float peso, float precio){
        if(ns!=null) this.numSerie=ns; //comparamos que es distinto de null
        this.setNombre(nombre); //usamos los setter para no volver a realizar la comprobacion
        this.setPeso(peso); //,si no hacemos esta comprobacion estariamos creando objetos sin las restricciones que tenemos en los setters
        this.setPrecio(precio);
        this.marca=null;
        this.paquete=null;
        this.descripcion=null;

    }

    //setter

    public void setNombre(String nombre){
        if(nombre!=null){
            if (nombre.length()>30) {
                this.nombre= nombre.substring(0,30);
            }
            else{
                this.nombre= nombre;
            }
        }

    }

    public void setDescripcion(String descripcion){
        if (descripcion!=null){
            if (descripcion.length()>200) {
                this.descripcion= descripcion.substring(0,200);
            }
            else{
                this.descripcion= descripcion;
            }
        }


    }


    public void setMarca(String marca){
        if(marca!=null){
            if (marca.equals("HP") ||
                    marca.equals("Amazon") ||
                    marca.equals("Microsoft") ||
                    marca.equals("iPhone") ||
                    marca.equals("Samsung") ||
                    marca.equals("Asus"))
            {
                this.marca= marca;
            }
        }

    }


    public void setPeso(float peso){
        if (peso>0) {
            this.peso= peso;
        }
    }


    public void setPrecio(float precio){
        if (precio>0) {
            this.precio= precio;
        }
    }

    public void setPaquete(Paquete paquete) {
        if (paquete != null) {
            this.paquete = paquete;
        }
    }


    //geters

    public String getNumSerie(){

        return this.numSerie;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){

        return this.descripcion;
    }

    public String getMarca(){

        return this.marca;
    }

    public Float getPeso(){

        return this.peso;
    }

    public Float getPrecio(){

        return this.precio;
    }

    public Paquete getPaquete(){

        return this.paquete;
    }





    //metodos funcionales
    @Override
    public String toString(){
        return "{\n" //si se cumple la condicion imprime lo que queremos y si no imprime lo que le mandamos (nada en este caso)
                + (this.numSerie!=null ? " \"numSerie\":\"" +  this.numSerie + "\"\n" : "")
                + (this.nombre!=null ? " \"nombre\":\"" +  this.nombre + "\"\n" : "")
                + (this.descripcion!=null ? " \"descripcion\":\"" +  this.descripcion + "\"\n" : "")
                + (this.marca!=null ? " \"marca\":\"" +  this.marca + "\"\n" : "")
                + (this.peso!=null ? " \"peso\":\"" +  this.peso + "\"\n" : "")
                + (this.precio!=null ? " \"precio\":\"" +  this.precio + "\"\n" : "")
                + "}";
    }

}