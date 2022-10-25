public class PrincipalB1E2 {
    public static void main(String[] args) {

        // return del setter de productos

        //apartado a

        //creamos los tres productos y los añadimos a un array

        Producto altavoz = new Producto("345gf8l2","JBL",300f,200f);
        Producto balon = new Producto("67fgh54g","Champions Adipro",600f,50f);
        Producto guitarra = new Producto("359gsdb8","Electric Guitar ACDC",1000f,500f);

        Producto[] arrayProductos = {altavoz,balon,guitarra}; //insertamos los productos a nuestro array

        //apartado b

        //creamos el paquete con el id deseado

        Paquete uno = new Paquete("20220915AA");

        //apartado c

        //añadimos atributos al paquete creado

        uno.setDescripcion("El paquete tiene tres productos que hay que enviar conjuntamente para" +
                "completar lo que es realmente un producto completo");

        uno.setDestino("Noia");

        uno.setProductos(arrayProductos); // hacemos el setter de los productos en nuestro array de productos


        //apartado d

        //escribimos el nombre del paquete como atributo de los productos

        altavoz.setPaquete(uno);
        balon.setPaquete(uno);
        guitarra.setPaquete(uno);

        //apartado e

        System.out.println("Apartado e:\n");

        System.out.println("id:" + uno.getId() + "\n" + "descripcion:" +uno.getDescripcion() +"\n" //mostramos los valores y no lo hacemos con el metodo tostring
                + "destino:" + uno.getDestino() +"\n"+ "\""+"productos"+ "\"" + uno.getProductos() +"\n"+"arrayproductos:"+uno.imprimirProductos() +"\n"); /// getter productos no se como hacerlo

        //apartado f

        //mostramos por cadena de texto el paquete

        System.out.println("Apartado f:\n");

        System.out.println(uno);



        //apartado g

        //introducimos Lugo en el metodo actualizarTrayecto

        uno.actualizarTrayectoria("Lugo"); //funciona


        //apartado h

        //introducimos Santiago de Compostela en el metodo actualizarTrayecto

        uno.actualizarTrayectoria("Santiago de Compostela"); //funciona


        //apartado i

        //introducimos Lugo en el metodo actualizarTrayecto

        uno.actualizarTrayectoria("Lugo"); //no lo mete porq está repetido



        //apartado j

        //introducimos Noia  en el metodo actualizarTrayecto

        uno.actualizarTrayectoria("Noia"); //lo mete porq es el destino y sale de la ejecucion


        //apartado k

        //introducimos Vigo en el metodo actualizarTrayecto

        uno.actualizarTrayectoria("Vigo"); // no lo mete ya que el destino está en la lista


        //apartado l

        System.out.println("\nApartado l:\n");

        System.out.println(uno);

        //apartado m

        //creamos un producto diferente  con atributo precio mayor que 40

        Producto gafas = new Producto("6gh31l0c","RayBan",300f,250f);

        gafas.setPaquete(uno); //añdimos el paquete como atributo de nuestro paquete

        //apartado n

        //escribimos el paquete en la segunda posicion del array creado en el apartado b

        arrayProductos[1] = gafas;

        //apartado o

        //mostramos por pantalla lo que ocurre con productos

        System.out.println("\nApartado o:\n");

        System.out.println("\""+"productos"+ "\"" + uno.getProductos() +"\n"+"arrayproductos:"+uno.imprimirProductos() +"\n");

        //lo que ocurre es que el elemento que se encontraba en la segunda posicion fue substituido por el elemento que acabamos de añadir ahora en esa posición

        System.out.println("Lo que ocurre es que el elemento que se encontraba en la segunda posicion fue substituido por el elemento que acabamos de añadir ahora en esa posición\n");

        //apartado p

        //crear tres productos diferentes y añadirlos a un array

        Producto leche = new Producto("klfg65ds","Puleva",1000f,0.8f);
        Producto cuadro = new Producto("yt3095cv","La Mona Lisa",1800f,4000f);
        Producto telefono = new Producto("fcar34po","Iphone 14",500f,1400f);

        Producto[] nuevoArrayProductos = {leche,telefono,cuadro};

        //apartado q

        //creamos un nuevo paquete con x valores

        Paquete correos = new Paquete("20220915AB","Vigo",nuevoArrayProductos); //le añadadimos el id, el destino y el array creado antes

        //apartado r

        //mostramos por pantalla el paquete creado en q

        System.out.println("Apartado r:\n");

        System.out.println(correos);

        //apartado s

        //introducimos vigo en el atributo trayectoria actual

        correos.actualizarTrayectoria("Vigo");

        //apartado t

        //mostramos por pantalla el valor del atributo trayectoActual

        System.out.println("\nApartado t:\n");

        System.out.println("TrayectoActual:"+correos.imprimirRuta());






























    }
}