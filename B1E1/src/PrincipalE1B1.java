/**
 *
 * @author Iván Quintáns Gonzalez
 */
public class PrincipalE1B1 {

    public static void main(String[] args) {

        //apartado a y b
        Producto altavoz = new Producto("A001b");
        System.out.println(altavoz);

        //apartado c y d
        altavoz.setNombre("Echo Dot"); //asignamos un nombre
        altavoz.setDescripcion("Te presentamos el Echo Dot: nuestro altavoz inteligente más popular. Viene con" +
                "un diseño con acabado en tela que se ajusta perfectamente a cualquier espacio pequeño." +
                "Controla la música con la voz: reproduce en streaming canciones en Amazon Music, Spotify," +
                "TuneIn y otros servicios. Un sonido más intenso y de mayor calidad: vincula un segundo Echo" +
                "Dot (3.ª generación) para obtener un sonido estéreo más profundo. Si tienes dispositivos Echo" +
                "compatibles repartidos en varias habitaciones, podrás llenar de música toda tu casa. Lista para" +
                "ayudarte: pídele a Alexa que reproduzca música, responda a preguntas, narre las noticias," +
                "consulte la previsión del tiempo, configure alarmas, controle dispositivos de Hogar digital" +
                "compatibles y mucho más."); //asignamos una descripcion
        altavoz.setMarca("Amazon");
        altavoz.setPrecio(33.99f);
        altavoz.setPeso(0.30f);
        System.out.println(altavoz.getNombre() + "\n" + altavoz.getDescripcion() +"\n" //mostramos los valores y no lo hacemos con el metodo tostring
                + altavoz.getMarca() +"\n"+ altavoz.getPrecio() +"\n"+ altavoz.getPeso()+"\n");


        //apartado e
        System.out.println(altavoz);


        //apartado f y g

        //Producto impresora= new Producto("C0003F","Impresora LaserJetM110we",0,null); no podemos realizar esto ya que precio es un float primitivo y no se le puede asignar un valor null

        Producto impresora= new Producto("C0003F"); //creo producto solamente con el numero de serie y luego hago los setters para asignar
        impresora.setNombre("Impresora LaserJetM110we");
        impresora.setPrecio(0f);

        System.out.println(impresora.getNumSerie() +"\n" + impresora.getNombre() +"\n" + impresora.getPrecio() +"\n"+ impresora.getPeso()+"\n"); //mostramos los valores y no lo hacemos con el metodo tostring

        //apartado h y i

        impresora.setDescripcion("Impresión a doble cara de forma automática, Wi-Fi de doble banda con" + //añadimos al producto ya creado los atributos que queremos
                "restablecimiento automático, Wi-Fi Direct, Fast Ethernet, HP Smart App, USB 2.0 de alta" +
                "velocidad, Apple AirPrint y Mopria.");

        impresora.setMarca("HP");

        impresora.setPrecio(50.99f);//añadimos un valor correcto para nuestro objeto

        //apartado j

        System.out.println(impresora.getNumSerie() +"\n" + impresora.getNombre() +"\n" + impresora.getPrecio() +"\n"+ impresora.getPeso()+"\n"
                + impresora.getDescripcion()+"\n"+ impresora.getMarca()+"\n");


        //apartado k

        System.out.println(impresora);







    }

}
