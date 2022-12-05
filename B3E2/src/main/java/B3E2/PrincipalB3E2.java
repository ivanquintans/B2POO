package B3E2;

import java.util.*;

public class PrincipalB3E2 {
    public static void main(String[] args) {
    //Apartado A
    //crear las instancias del conjunto de actores del excel

    Actor actor1= new Actor("Cameron Diaz",new ArrayList<String>(Arrays.asList("Steven Spielberg" , "Martin Scorsese")),20);
    Actor actor2= new Actor("Ben Stiller",new ArrayList<String>(Arrays.asList("Steven Spielberg" , "Martin Scorsese")),15);
    Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christofer Nolan", "Woody Allen", "Martin Scorsese")),25);
    Actor actor4= new Actor("Anne Hathaway",new ArrayList<String>(Arrays.asList("Christofer Nolan", "Woody Allen", "Martin Scorsese")),30);
    Actor actor5= new Actor("Leonardo DiCaprio",new ArrayList<String>(Arrays.asList("Christofer Nolan", "Quentin Tarantino" ,"Clint Eastwood")),50);
    Actor actor6= new Actor("Marion Cotillard",new ArrayList<String>(Arrays.asList("Christofer Nolan" ,"David Fincher" ,"Pedro Almodóvar" ,"Roger Mitchell")),15);
    Actor actor7= new Actor("Christian Bale",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "Francis Ford Coppola", "Clint Eastwood", "Tim Burton")),20);
    Actor actor8= new Actor("Gary Oldman",new ArrayList<String>(Arrays.asList("Martin Scorsese", "James Cameron", "Alejandro Amenábar", "Guillermo del Toro")),20);
    Actor actor9= new Actor(" Matt Damon",new ArrayList<String>(Arrays.asList("Christofer Nolan", "Greta Gerwig", "Steven Spielberg", "Woody Allen")),40);
    Actor actor10= new Actor("Daniel Day-Lewis",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "M. Night Shymalan", "Paul Thomas Anderson")),70);
    Actor actor11= new Actor("John Travolta",new ArrayList<String>(Arrays.asList("Ridley Scott", "Sofia Coppola", "Danny Boyle", "Hermanos Coen")),25);
    Actor actor12= new Actor("Bruce Willis",new ArrayList<String>(Arrays.asList("Steven Spielberg", "M. Night Shymalan", "Martin Scorsese", "Alfonso Cuarón")),30);
    Actor actor13= new Actor("Michael Caine",new ArrayList<String>(Arrays.asList("Steven Soderberg", "Sofia Coppola", "Paul Haggis", "Steven Soderberg")),10);
    Actor actor14= new Actor("Morgan Freeman",new ArrayList<String>(Arrays.asList("Steven Spielberg", "Ridley Scott", "James Cameron", "Martin Scorsese")),15);
    Actor actor15= new Actor("Jack Nicholson",new ArrayList<String>(Arrays.asList("Ridley Scott", "Jean Jacques Annaud", "Roman Polanski", "Woody Allen")),20);
    Actor actor16= new Actor("Liam Neeson",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "Sofia Coppola", "J.J. Abrahams", "M. Night Shymalan")),20);
    Actor actor17= new Actor("Al Pacino",new ArrayList<String>(Arrays.asList("Martin Scorsese", "Christofer Nolan", "J.J. Abrahams", "Sofia Coppola")),50);
    Actor actor18= new Actor("Julia Roberts",new ArrayList<String>(Arrays.asList("Sofia Coppola", "Quentin Tarantino", "Martin Scorsese", "Clint Eastwood")),80);
    Actor actor19= new Actor("Hugh Grant",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "Clint Eastwood", "Greta Gerwig", "Mel Gibson")),55);
    Actor actor20= new Actor("Brad Pitt",new ArrayList<String>(Arrays.asList("Martin Scorsese", "Sofia Coppola", "Paul Haggis")),80);
    Actor actor21=new Actor("Haley Joel Osment",15f);


    ComediaRomantica pelicula1 = new ComediaRomantica("Algo pasa con Mary",1998,null,	"Hermanos Farrelly",90);
    Ficcion pelicula2 = new Ficcion("Interstellar",2014,169,"Christopher Nolan",100);
    Ficcion pelicula3 = new Ficcion("Origen",2010,148,"Christopher Nolan",300);
    Ficcion pelicula4 = new Ficcion("El caballero oscuro",2008,152,"Christopher Nolan",500);
    Thriller pelicula5 = new Thriller("Infiltrados",2006,151,"Martin Scorsese",80);
    Thriller pelicula6 = new Thriller("Gans of New York",2002,166,"Martin Scorsese",70);
    ComediaNegra pelicula7 = new ComediaNegra("Pulp Fiction",1994,153,"Quentin Tarantino",50);
    Psicologico pelicula8 = new Psicologico("El sexto sentido",1999,107,"M. Night Shymalan",90);
    ComediaRomantica pelicula9 = new ComediaRomantica("Noting Hill",1999,166,"Roger Mitchell",124);
    Robos pelicula10  = new Robos("Ocean 11",2011,117,"Steven Soderberg",400);


        pelicula1.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor1,actor2)));

        pelicula2.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor3,actor4)));
        pelicula2.darAlta("secundario",new ArrayList<Actor>(Arrays.asList(actor9,actor13)));

        pelicula3.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor5,actor6)));
        pelicula3.darAlta("secundario",new ArrayList<Actor>(Collections.singletonList(actor13)));

        pelicula4.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor7,actor8,actor4)));
        pelicula4.darAlta("secundario",new ArrayList<Actor>(Arrays.asList(actor13,actor14)));

        pelicula5.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor5,actor9)));
        pelicula5.darAlta("secundario",new ArrayList<Actor>(Arrays.asList(actor17,actor15)));

        pelicula6.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor1,actor5,actor10)));
        pelicula6.darAlta("secundario",new ArrayList<Actor>(Collections.singletonList(actor16)));

        pelicula7.darAlta("principal",new ArrayList<Actor>(Collections.singletonList(actor11)));
        pelicula7.darAlta("secundario",new ArrayList<Actor>(Collections.singletonList(actor12)));


        pelicula8.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor12,actor21)));

        pelicula9.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor18,actor19)));

        pelicula10.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor18,actor20,actor9)));

    //APARTADO B
    //creamos las instancias directores

        Director director1 = new Director("Hermanos Farrelly",new HashSet<String>(){{add("ComediaRomantica");add("ComediaNegra");}},new HashMap<String,Float>(){{put("ComediaRomantica",2f);put("ComediaNegra",1.5f);}});
        Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",2f);put("Guerra",2f);put("Thriller",2f);}});
        Director director3 = new Director("Martin Scorsese",new HashSet<String>(){{add("Thriller");add("Psicologico");}},new HashMap<String,Float>(){{put("Thriller",2f);put("Psicologico",2f);}});
        Director director4= new Director("Quentin Tarantino",new HashSet<String>(){{add("ComediaNegra");add("Ficcion");add("Guerra");}},new HashMap<String,Float>(){{put("ComediaNegra",2f);put("Ficcion",2f);put("Guerra",2f);}});
        Director director5 = new Director("M. Night Shymalan",new HashSet<String>(){{add("Psicologico");add("Ficcion");add("TerrorGotico");add("ComediaRomantica");}},new HashMap<String,Float>(){{put("Psicologico",2f);put("Ficcion",2f);put("TerrorGotico",2f);put("ComediaRomantica",2f);}});
        Director director6 = new Director("Roger Mitchell",new HashSet<String>(){{add("ComediaRomantica");add("Parodia");}},new HashMap<String,Float>(){{put("ComediaRomantica",2f);put("Parodia",2f);}});
        Director director7 = new Director("Steven Soderberg",new HashSet<String>(){{add("DeRobos");add("Thriller");add("Ficcion");}},new HashMap<String,Float>(){{put("DeRobos",2f);put("Thriller",2f);put("Ficcion",2f);}});

    //APARTADO G
    //mostrar por pantalla los actroes 1,5,7,8,9

        System.out.println("\nAPARTADO G:\n");

        System.out.println(actor1);
        System.out.println(actor5);
        System.out.println(actor7);
        System.out.println(actor8);
        System.out.println(actor9);
        System.out.println(actor10);

    //APARTADO H
    //Mostrar por pantalla las peliculas en las que haya participado el actor 5

        System.out.println("\nAPARTADO H:\n");

        System.out.println(actor5.getPeliculas());

    //APARTADO I
    //mostramos por pantalla los actores dirigidos por MArtin Scorsese

        System.out.println("\nAPARTADO I\n");

    /*Mostrar el conjunto de actores no las caracteristicas*/
        System.out.println(pelicula1.actoresDirigidos("Martin Scorsese"));


    //APARTADO J
    //mostramos por pantalla los actores dirigidos por Christopher Nolan

        System.out.println("\nAPARTADO J:\n");

    /*Mostrar el conjunto de actores no las caracteristicas*/
        System.out.println(pelicula6.actoresDirigidos("Christopher Nolan"));

    //APARTADO K
    //mostramos por pantalla si las peliculas 4,5,6,7 han tenido exito

        System.out.println("\nAPARTADO K:\n");

    /*revisar*/
        System.out.println("Pelicula 4: "+pelicula4.exito());
        System.out.println("Pelicula 5: "+pelicula5.exito());
        System.out.println("Pelicula 6: "+pelicula6.exito());
        System.out.println("Pelicula 7: "+pelicula7.exito());


    //APARTADO l
    /*Enunciado bastante xd*/
        System.out.println("\nAPARTADO L:");



    //APARTADO M
    //mostramos por pantalla el presupuesto de las peliculas 1,2,9,10

        System.out.println("\nAPARTADO M:\n");

    /*en get presupuesto llamar al metodo??*/
        System.out.println("Pelicula 1: "+pelicula1.presupuesto());
        System.out.println("Pelicula 2: "+pelicula2.presupuesto());
        System.out.println("Pelicula 9: "+pelicula9.presupuesto());
        System.out.println("Pelicula 10: "+pelicula10.presupuesto());

    /*Hacer lo que queda con chris*/
    //APARTADO N
    //mostramos por pantalla las caracteristicas de los sensores temperatura

        System.out.println("\nAPARTADO N:\n");


    //APARTADO O
    //mostramos por pantalla las caracteristicas de los sensores sonido

        System.out.println("\nAPARTADO O:\n");


    //APARTADO P
    //IMPRIMIMOS EL SENSOR CON VALOR MAXIMO Y MINIMO DE TEMPERATURA

    //SENSOR MAX VALOR

        System.out.println("\nAPARTADO P:\n");

    //APARTADO Q
    //MOSTRAMOS LOS VALORES PARA EL SENSOR CON ID 301 CUYOS VALORES MAYORES QUE 33

        System.out.println("\nAPARTADO Q:\n");


    //APARTADO R
    //AÑADIR EL SENSOR 8

        System.out.println("\nAPARTADO R:\n");


    //APARTADO S
    //mostramos por pantalla la estancia1

        System.out.println("\nAPARTADO S:\n");

    //APARTADO T
    //mostramos por pantalla los valores de los sensores ruido

        System.out.println("\nAPARTADO T:\n");

    //APARTADO U
    //mostramos por pantalla los identificadores de los sensores con valor mayor a 40

        System.out.println("\nAPARTADO U:\n");


















}
}
