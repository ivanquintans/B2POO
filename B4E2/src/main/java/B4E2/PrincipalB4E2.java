package B4E2;

import java.util.*;

public class PrincipalB4E2 {
    public static void main(String[] args) {



        try{

            //APARTADO A
            //Crear la instancia de la película pelicula2, indicando null en el argumento nombre

            System.out.println("APARTADO A");

            //probamos estos dos apartados por separado ya que si no no podemos crear las dos instancias con el mismo nombre
            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            Ficcion pelicula2 = new Ficcion(null,2014,169,director2,new HashMap<String,Float>(){{put("EE.UU",50f);put("España",8f);put("Italia",8f);put("Alemania",10f);put("Francia",5f);put("Reino Unido",15f);put("Polonia",4f);}});

        }catch (ExcepcionCine error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());


        }


        try {

            //APARTADO B
            //Crear la instancia de la película pelicula2, indicando 2030 en el argumento asociado a anho.

            System.out.println("\nAPARTADO B");
            System.out.println("Si se produce la excepcion, ya no nos imprime la pelicula ya que no se instancio el objeto");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});
            Ficcion pelicula2 = new Ficcion("Interstellar",2030,169,director2,new HashMap<String,Float>(){{put("EE.UU",50f);put("España",8f);put("Italia",8f);put("Alemania",10f);put("Francia",5f);put("Reino Unido",15f);put("Polonia",4f);}});

            //APARTADO C
            //Mostrar por pantalla las características de pelicula2.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO C");
            System.out.println(pelicula2);

        }catch (ExcepcionPelicula error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }catch (ExcepcionCine error){ //para gestionar si se produce el error en el director y poder imprimir la pelicula
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO D
            //Crear la instancia de la película pelicula2, indicando el año que aparece en el fichero de
            //instancias B3E2_instancias.xlsx para el argumento asociado a anho.

            System.out.println("\nAPARTADO D");
            System.out.println("Si se produce la excepcion, ya no nos imprime la pelicula ya que no se instancio el objeto");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});
            Ficcion pelicula2 = new Ficcion("Interstellar",2014,169,director2,new HashMap<String,Float>(){{put("EE.UU",50f);put("España",8f);put("Italia",8f);put("Alemania",10f);put("Francia",5f);put("Reino Unido",15f);put("Polonia",4f);}});

            //APARTADO E
            //Mostrar por pantalla las características de pelicula2.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO E");
            System.out.println(pelicula2);

            //APARTADO F
            //Cambiar el año de realización de pelicula2 a 2027 a través del setter setAnho

            System.out.println("\nAPARTADO F");
            System.out.println("Si se produce la excepcion, ya no nos imprime la pelicula ya que no se instancio el objeto\n");

            pelicula2.setAnho(2027);

            //APARTADO G
            //Mostrar por pantalla las características de pelicula2.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO G");
            System.out.println(pelicula2);

        }catch (ExcepcionPelicula error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }catch (ExcepcionCine error){ //para gestionar si se produce el error en el director y poder imprimir la pelicula
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO H
            //Crear la instancia de la película pelicula3, indicando -35 en el argumento asociado a
            //duracion.

            System.out.println("\nAPARTADO H");
            System.out.println("Si se produce la excepcion, ya no nos imprime la pelicula ya que no se instancio el objeto\n");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            Ficcion pelicula3 = new Ficcion("Origen",2010,-35,director2,new HashMap<String,Float>(){{put("EE.UU",120f);put("España",30f);put("Italia",30f);put("Alemania",50f);put("Francia",25f);put("Reino Unido",24f);put("Polonia",21f);}});

            //APARTADO I
            //Mostrar por pantalla las características de pelicula3.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO I");
            System.out.println(pelicula3);

        }catch (ExcepcionPelicula error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }catch (ExcepcionCine error){ //para gestionar si se produce el error en el director y poder imprimir la pelicula
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO J
            //Crear la instancia de la película pelicula3, indicando la duración que aparece en el fichero de
            //instancias B3E2_instancias.xlsx para el argumento asociado a duracion.

            System.out.println("\nAPARTADO J");
            System.out.println("Si se produce la excepcion, ya no nos imprime la pelicula ya que no se instancio el objeto\n");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            Ficcion pelicula3 = new Ficcion("Origen",2010,148,director2,new HashMap<String,Float>(){{put("EE.UU",120f);put("España",30f);put("Italia",30f);put("Alemania",50f);put("Francia",25f);put("Reino Unido",24f);put("Polonia",21f);}});

            //APARTADO K
            //Mostrar por pantalla las características de pelicula3.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO K");
            System.out.println(pelicula3);

            //APARTADO L
            //Cambiar la duración de realización de pelicula3 a 4 a través del setter setAnho.

            System.out.println("\nAPARTADO L");
            System.out.println("Si se produce la excepcion, ya no nos imprime la pelicula ya que no se instancio el objeto\n");

            pelicula3.setDuracion(4);

            //APARTADO M
            //Mostrar por pantalla las características de pelicula2.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO M");
            System.out.println(pelicula3);

        }catch (ExcepcionPelicula error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }catch (ExcepcionCine error){ //para gestionar si se produce el error en el director y poder imprimir la pelicula
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO N
            //Crear la instancia del actor actor3, indicando null en el argumento nombre

            System.out.println("\nAPARTADO N");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Actor actor3= new Actor(null,new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);

            //APARTADO O
            //Mostrar por pantalla las características de actor3.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO O");
            System.out.println(actor3);

        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO P
            //Crear la instancia del actor actor3, indicando 0 en el argumento asociado a cache.

            System.out.println("\nAPARTADO P");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),0);

            //APARTADO Q
            //Mostrar por pantalla las características de actor3.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO O");
            System.out.println(actor3);

        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO R
            //Crear la instancia del actor actor3, indicando la cache que aparece en el fichero de instancias
            //B3E2_instancias.xlsx para el argumento asociado a cache

            System.out.println("\nAPARTADO R");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);

            //APARTADO S
            //Mostrar por pantalla las características de actor3.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO S");
            System.out.println(actor3);

            //APARTADO t
            //Cambiar la cache del actor actor3 a -400 a través del setter setCache.

            System.out.println("\nAPARTADO T");
            System.out.println("Si se produce la excepcion, ya no nos imprime  ya que no se instancio el objeto\n");

            actor3.setCache(-300f);

            //APARTADO U
            //Mostrar por pantalla las características de actor3.

            //si no se crea la pelicula ya no llega aquí

            System.out.println("\nAPARTADO U");
            System.out.println(actor3);

        }catch (ExcepcionParticipante error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try{

            //APARTADO V
            //Mostrar por pantalla la importancia del actor3 para el tipo de participación de "figurantes"

            System.out.println("\nAPARTADO V");

            Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);

            actor3.importancia("figurantes");


        }catch (ExcepcionParticipante error){
            System.out.println(error.getMessage());

        }

        try{

            //APARTADO w
            //Mostrar por pantalla la importancia del actor3 para el tipo de participación de "secundario"

            System.out.println("\nAPARTADO W");

            Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);

            actor3.importancia("secundario");

            System.out.println(actor3.importancia("secundario"));


        }catch (ExcepcionParticipante error){
            System.out.println(error.getMessage());

        }


        try {

            //APARTADO Y
            //Cambiar los deseos del actor actor3 a la instancia creada en el apartado (x) a través del setter
            //setDeseos.

            //APARTADO X
            //Crear una instancia de ArrayList<String>.

            ArrayList<String> array = new ArrayList<>();

            Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);

            System.out.println("\nAPARTADO Y");
            System.out.println("Si se produce la excepcion, ya no nos imprime  ya que no se instancio el objeto\n");

            actor3.setDeseos(array);

        }catch (ExcepcionParticipante error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO Z
            //Cambiar los deseos del actor actor3 a null a través del setter setDeseos

            Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);

            System.out.println("\nAPARTADO Z");
            System.out.println("Si se produce la excepcion, ya no nos imprime  ya que no se instancio el objeto\n");

            actor3.setDeseos(null);

        }catch (ExcepcionParticipante error){
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

            //APARTADO AA
            System.out.println("\nAPARTADO AA");
            System.out.println(error.getParticipante());

        }


        try {

            //APARTADO BB
            //Crear la instancia de la película director2, indicando null en el argumento nombre.

            System.out.println("\nAPARTADO BB");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Director director2 = new Director(null,new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            //APARTADO O
            //Mostrar por pantalla las características de director2.

            //si no se crea la director ya no llega aquí

            System.out.println("\nAPARTADO CC");
            System.out.println(director2);

        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO DD
            //Crear la instancia del director director2 de acuerdo con los valores de los atributos del
            //constructor indicados en el fichero B3E2_instancias.xlsx.

            System.out.println("\nAPARTADO DD");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            System.out.println(director2);

        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try {
            //APARTADO EE
            //Crear una instancia de Set<String>.

            Set<String> set = new HashSet<>();

            //APARTADO FF
            //Cambiar los valores del atributo especialista del director director2 a la instancia creada
            //en el apartado (ee) a través del setter setEspecialista

            System.out.println("\nAPARTADO FF");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            director2.setEspecialista(set);

            System.out.println(director2);

        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

        }

        try {

            //APARTADO GG
            //Cambiar los valores del atributo especialista del director director2 a null a través del
            //setter setEspecialista.

            System.out.println("\nAPARTADO GG");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            director2.setEspecialista(null);


        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

            //APARTADO HH
            //Cambiar los valores del atributo especialista del director director2 a null a través del
            //setter setEspecialista.

            System.out.println("\nAPARTADO HH");
            System.out.println(error.getParticipante());

        }

        try {

            Set<String> set = new HashSet<>();

            //APARTADO II
            set.add("Gore");

            //APARTADO JJ
            //Cambiar los valores del atributo especialista del director director2 a la instancia creada
            //en el apartado (ee) a través del setter setEspecialista.

            System.out.println("\nAPARTADO JJ");
            System.out.println("Si se produce la excepcion, ya no nos imprime ya que no se instancio el objeto\n");

            Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});

            director2.setEspecialista(set);



        }catch (ExcepcionParticipante error) {
            //imprimimos la excepcion obtenida
            System.out.println(error.getMessage());

            //APARTADO KK

            System.out.println(error.getParticipante());

        }




    }
}
