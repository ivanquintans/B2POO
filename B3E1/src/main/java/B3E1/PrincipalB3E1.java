package B3E1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrincipalB3E1 {
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


        //APARTADO B
        //mostramos por pantalla las caracteristicas de los actores 1,2,3,4,5,6

        System.out.println("APARTADO B:\n");

        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);
        System.out.println(actor4);
        System.out.println(actor5);
        System.out.println(actor6);

        //APARTADO C
        //crear las instancias pelicula

        /*CAmbiar el 50*/
        Pelicula pelicula1 = new ComediaRomantica("Algo pasa con Mary",1998,50,	"Hermanos Farrelly",90);
        Pelicula pelicula2 = new Ficcion("Interstellar",2014,169,"Christopher Nolan",100);
        Pelicula pelicula3 = new Ficcion("Origen",2010,148,"Christopher Nolan",300);
        Pelicula pelicula4 = new Ficcion("El caballero oscuro",2008,152,"Christopher Nolan",500);
        Pelicula pelicula5 = new Thriller("Infiltrados",2006,151,"Martin Scorsese",80);
        Pelicula pelicula6 = new Thriller("Gans of New York",2002,166,"Martin Scorsese",70);
        Pelicula pelicula7 = new ComediaNegra("Pulp Fiction",1994,153,"Quentin Tarantino",50);
        Pelicula pelicula8 = new Psicologico("El sexto sentido",1999,107,"M. Night Shymalan",90);
        Pelicula pelicula9 = new ComediaRomantica("Noting Hill",1999,166,"Roger Mitchell",124);
        Pelicula pelicula10  = new Robos("Ocean 11",2011,117,"Steven Soderberg",400);


        //APARTADO D
        //mostramos por pantalla las caracteristicas de los PELICULAS 1,2,3,4


        System.out.println("APARTADO D:\n");

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        System.out.println(pelicula4);

        //APARTADO E
        //Damos de alta los actores en las peliculas

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

        /*Actor random xd*/
        pelicula8.darAlta("principal",new ArrayList<Actor>(Collections.singletonList(actor12)));

        pelicula9.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor18,actor19)));

        pelicula10.darAlta("principal",new ArrayList<Actor>(Arrays.asList(actor18,actor20,actor9)));







        System.out.println("APARTADO E:\n");


        //APARTADO F
        //mostramos por pantalla los sensores

        System.out.println("\nAPARTADO F:\n");

        //APARTADO G
        //mostrar por pantalla la estancia1

        System.out.println("\nAPARTADO G:\n");

        //APARTADO H
        //dar de alta los sensores 5,6,7

        System.out.println("\nAPARTADO H:\n");

        //APARTADO I
        //mostramos por pantalla limites superiores y inferiores

        System.out.println("\nAPARTADO I\n");


        //APARTADO J
        //mostramos por pantalla los sensores 5,6,7

        System.out.println("\nAPARTADO J:\n");

        //APARTADO K
        //mostramos por pantalla la estancia1

        //COMO NO TIENE VALORES ALGUNOS SESNSORES NOS DAN DE MEDIA EL VALOR PARA FLOAT MINIMO

        System.out.println("\nAPARTADO K:\n");


        //APARTADO l
        //añadimos los valores
        System.out.println("\nAPARTADO L:");



        //APARTADO M
        //mostramos por pantalla la estancia1

        System.out.println("\nAPARTADO M:\n");

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

