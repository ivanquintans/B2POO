package B3E2;

import java.util.*;

public class PrincipalB3E2 {
    public static void main(String[] args) {
    //Apartado A
    //crear las instancias del conjunto de actores del excel

    Actor actor1= new Actor("Cameron Diaz",new ArrayList<String>(Arrays.asList("Steven Spielberg" , "Martin Scorsese")),20);
    Actor actor2= new Actor("Ben Stiller",new ArrayList<String>(Arrays.asList("Steven Spielberg" , "Martin Scorsese")),15);
    Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);
    Actor actor4= new Actor("Anne Hathaway",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),30);
    Actor actor5= new Actor("Leonardo DiCaprio",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Quentin Tarantino" ,"Clint Eastwood")),50);
    Actor actor6= new Actor("Marion Cotillard",new ArrayList<String>(Arrays.asList("Christopher Nolan" ,"David Fincher" ,"Pedro Almodóvar" ,"Roger Mitchell")),15);
    Actor actor7= new Actor("Christian Bale",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "Francis Ford Coppola", "Clint Eastwood", "Tim Burton")),20);
    Actor actor8= new Actor("Gary Oldman",new ArrayList<String>(Arrays.asList("Martin Scorsese", "James Cameron", "Alejandro Amenábar", "Guillermo del Toro")),20);
    Actor actor9= new Actor(" Matt Damon",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Greta Gerwig", "Steven Spielberg", "Woody Allen")),40);
    Actor actor10= new Actor("Daniel Day-Lewis",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "M. Night Shymalan", "Paul Thomas Anderson")),70);
    Actor actor11= new Actor("John Travolta",new ArrayList<String>(Arrays.asList("Ridley Scott", "Sofia Coppola", "Danny Boyle", "Hermanos Coen")),25);
    Actor actor12= new Actor("Bruce Willis",new ArrayList<String>(Arrays.asList("Steven Spielberg", "M. Night Shymalan", "Martin Scorsese", "Alfonso Cuarón")),30);
    Actor actor13= new Actor("Michael Caine",new ArrayList<String>(Arrays.asList("Steven Soderberg", "Sofia Coppola", "Paul Haggis", "Steven Soderberg")),10);
    Actor actor14= new Actor("Morgan Freeman",new ArrayList<String>(Arrays.asList("Steven Spielberg", "Ridley Scott", "James Cameron", "Martin Scorsese")),15);
    Actor actor15= new Actor("Jack Nicholson",new ArrayList<String>(Arrays.asList("Ridley Scott", "Jean Jacques Annaud", "Roman Polanski", "Woody Allen")),20);
    Actor actor16= new Actor("Liam Neeson",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "Sofia Coppola", "J.J. Abrahams", "M. Night Shymalan")),20);
    Actor actor17= new Actor("Al Pacino",new ArrayList<String>(Arrays.asList("Martin Scorsese", "Christopher Nolan", "J.J. Abrahams", "Sofia Coppola")),50);
    Actor actor18= new Actor("Julia Roberts",new ArrayList<String>(Arrays.asList("Sofia Coppola", "Quentin Tarantino", "Martin Scorsese", "Clint Eastwood")),80);
    Actor actor19= new Actor("Hugh Grant",new ArrayList<String>(Arrays.asList("Quentin Tarantino", "Clint Eastwood", "Greta Gerwig", "Mel Gibson")),55);
    Actor actor20= new Actor("Brad Pitt",new ArrayList<String>(Arrays.asList("Martin Scorsese", "Sofia Coppola", "Paul Haggis")),80);
    Actor actor21=new Actor("Haley Joel Osment",15f);




    //APARTADO B
    //creamos las instancias directores

        Director director1 = new Director("Hermanos Farrelly",new HashSet<String>(){{add("ComediaRomantica");add("ComediaNegra");}},new HashMap<String,Float>(){{put("ComediaRomantica",2f);put("ComediaNegra",1.5f);}});
        Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});
        Director director3 = new Director("Martin Scorsese",new HashSet<String>(){{add("Thriller");add("Psicologico");}},new HashMap<String,Float>(){{put("Thriller",4f);put("Psicologico",6f);}});
        Director director4= new Director("Quentin Tarantino",new HashSet<String>(){{add("ComediaNegra");add("Ficcion");add("Guerra");}},new HashMap<String,Float>(){{put("ComediaNegra",5f);put("Ficcion",4.5f);put("Guerra",4f);}});
        Director director5 = new Director("M. Night Shymalan",new HashSet<String>(){{add("Psicologico");add("Ficcion");add("TerrorGotico");}},new HashMap<String,Float>(){{put("Psicologico",5f);put("Ficcion",1.5f);put("TerrorGotico",2f);}});
        Director director6 = new Director("Roger Mitchell",new HashSet<String>(){{add("ComediaRomantica");add("Parodia");}},new HashMap<String,Float>(){{put("ComediaRomantica",3f);put("Parodia",2.5f);}});
        Director director7 = new Director("Steven Soderberg",new HashSet<String>(){{add("DeRobos");add("Thriller");add("Ficcion");}},new HashMap<String,Float>(){{put("DeRobos",4f);put("Thriller",5f);put("Ficcion",6f);}});

        ComediaRomantica pelicula1 = new ComediaRomantica("Algo pasa con Mary",1998,null,director1,new HashMap<String,Float>(){{put("EE.UU",40f);put("España",8f);put("Italia",9f);put("Alemania",10f);put("Francia",8f);put("Reino Unido",10f);put("Polonia",5f);}});
        Ficcion pelicula2 = new Ficcion("Interstellar",2014,169,director2,new HashMap<String,Float>(){{put("EE.UU",50f);put("España",8f);put("Italia",8f);put("Alemania",10f);put("Francia",5f);put("Reino Unido",15f);put("Polonia",4f);}});
        Ficcion pelicula3 = new Ficcion("Origen",2010,148,director2,new HashMap<String,Float>(){{put("EE.UU",120f);put("España",30f);put("Italia",30f);put("Alemania",50f);put("Francia",25f);put("Reino Unido",24f);put("Polonia",21f);}});
        Ficcion pelicula4 = new Ficcion("El caballero oscuro",2008,152,director2,new HashMap<String,Float>(){{put("EE.UU",180f);put("España",80f);put("Italia",50f);put("Alemania",40f);put("Francia",40f);put("Reino Unido",80f);put("Polonia",30f);}});
        Thriller pelicula5 = new Thriller("Infiltrados",2006,151,director3,new HashMap<String,Float>(){{put("EE.UU",30f);put("España",5f);put("Italia",10f);put("Alemania",10f);put("Francia",8f);put("Reino Unido",15f);put("Polonia",2f);}});
        Thriller pelicula6 = new Thriller("Gans of New York",2002,166,director3,new HashMap<String,Float>(){{put("EE.UU",20f);put("España",5f);put("Italia",5f);put("Alemania",10f);put("Francia",12f);put("Reino Unido",13f);put("Polonia",5f);}});
        ComediaNegra pelicula7 = new ComediaNegra("Pulp Fiction",1994,153,director4,new HashMap<String,Float>(){{put("EE.UU",15f);put("España",3f);put("Italia",4f);put("Alemania",8f);put("Francia",7f);put("Reino Unido",10f);put("Polonia",3f);}});
        Psicologico pelicula8 = new Psicologico("El sexto sentido",1999,107,director5,new HashMap<String,Float>(){{put("EE.UU",35f);put("España",5f);put("Italia",5f);put("Alemania",10f);put("Francia",15f);put("Reino Unido",11f);put("Polonia",9f);}});
        ComediaRomantica pelicula9 = new ComediaRomantica("Noting Hill",1999,166,director6,new HashMap<String,Float>(){{put("EE.UU",40f);put("España",10f);put("Italia",10f);put("Alemania",15f);put("Francia",14f);put("Reino Unido",24f);put("Polonia",11f);}});
        Robos pelicula10  = new Robos("Ocean 11",2011,117,director7,new HashMap<String,Float>(){{put("EE.UU",120f);put("España",24f);put("Italia",35f);put("Alemania",35f);put("Francia",60f);put("Reino Unido",80f);put("Polonia",44f);}});


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

    //APARTADO C
    //mostrar por pantalla los directores

        System.out.println("\nAPARTADO C:\n");

        System.out.println(director1);
        System.out.println(director2);
        System.out.println(director3);
        System.out.println(director4);
        System.out.println(director5);
        System.out.println(director6);
        System.out.println(director7);


    //APARTADO D

        director1.introducirPelicula(pelicula1);
        director2.introducirPelicula(pelicula2);
        director2.introducirPelicula(pelicula3);
        director2.introducirPelicula(pelicula4);
        director3.introducirPelicula(pelicula5);
        director3.introducirPelicula(pelicula6);
        director4.introducirPelicula(pelicula7);
        director5.introducirPelicula(pelicula8);
        director6.introducirPelicula(pelicula9);
        director7.introducirPelicula(pelicula10);

    //APARTADO E
        //mostrar por pantalla los directores

        System.out.println("\nAPARTADO E:\n");

        System.out.println(director1);
        System.out.println(director2);
        System.out.println(director3);
        System.out.println(director4);
        System.out.println(director5);
        System.out.println(director6);
        System.out.println(director7);

        //APARTADO F
        //mostrar por pantalla los actores 8,10,15

        System.out.println("\nAPARTADO F:\n");

        System.out.println(actor8);
        System.out.println(actor10);
        System.out.println(actor15);

        //APARTADO G
        //deseos no cumplidos actor 5 y 9

        System.out.println("\nAPARTADO G:\n");

        System.out.println("Actor 5: "+actor5.deseosNoCumplidos());
        System.out.println("Actor 9: "+actor9.deseosNoCumplidos());

        //APARTADO H
        //presupuesto de las peliculas 1,2,9,10

        System.out.println("\nAPARTADO H:\n");

        System.out.println("Pelicula 1: "+pelicula1.presupuesto());
        System.out.println("Pelicula 2: "+pelicula2.presupuesto());
        System.out.println("Pelicula 9: "+pelicula9.presupuesto());
        System.out.println("Pelicula 10: "+pelicula10.presupuesto());

        //APARTADO I
        //recaudacion total de las peliculas 3,4,5,6

        System.out.println("\nAPARTADO I:\n");

        System.out.println("Pelicula 3: "+pelicula3.recaudacionTotal());
        System.out.println("Pelicula 4: "+pelicula4.recaudacionTotal());
        System.out.println("Pelicula 5: "+pelicula5.recaudacionTotal());
        System.out.println("Pelicula 6: "+pelicula6.recaudacionTotal());

        //APARTADO J
        //mostrar si todas las peliculas han sido un exito

        System.out.println("\nAPARTADO J:\n");

        System.out.println("Pelicula 1: "+pelicula1.exito());
        System.out.println("Pelicula 2: "+pelicula2.exito());
        System.out.println("Pelicula 3: "+pelicula3.exito());
        System.out.println("Pelicula 4: "+pelicula4.exito());
        System.out.println("Pelicula 5: "+pelicula5.exito());
        System.out.println("Pelicula 6: "+pelicula6.exito());
        System.out.println("Pelicula 7: "+pelicula7.exito());
        System.out.println("Pelicula 8: "+pelicula8.exito());
        System.out.println("Pelicula 9: "+pelicula9.exito());
        System.out.println("Pelicula 10: "+pelicula10.exito());

        //APARTADO K
        //Mostrar el número de veces que "Michael Caine" ha sido dirigido por "Christopher Nolan"

        System.out.println("\nAPARTADO K:\n");

        System.out.println(director2.dirigirActor("Michael Caine"));

        //APARTADO L
        //Mostrar el número de veces que "Leonardo DiCaprio" ha sido dirigido por "Martin Scorsese".

        System.out.println("\nAPARTADO L:\n");

        System.out.println(director3.dirigirActor("Leonardo DiCaprio"));

        //APARTADO M
        //Mostrar el género que tiene la caché más alta para los directores director1, director4,
        //director5 y director7.

        System.out.println("\nAPARTADO M:\n");

        System.out.println("Director 1:"+director1.generoMasCaro());
        System.out.println("Director 4:"+director4.generoMasCaro());
        System.out.println("Director 5:"+director5.generoMasCaro());
        System.out.println("Director 7:"+director7.generoMasCaro());

        //APARTADO N
        //Mostrar las películas dirigidas por los directores director2, director3 y director6 que
        //han tenido una recaudación mayor de 80.

        System.out.println("\nAPARTADO N:\n");

        System.out.println("Director 2:"+director2.peliculasMasBeneficio(80f));
        System.out.println("\nDirector 3:"+director3.peliculasMasBeneficio(80f));
        System.out.println("\nDirector 6:"+director6.peliculasMasBeneficio(80f));





















}
}
