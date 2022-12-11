package B4E1;

import java.util.*;

public class PrincipalB4E1 {
    public static void main(String[] args) {

        //Apartado A
        //crear las instancias del conjunto de actores del excel

        Actor actor1= new Actor("Cameron Diaz",new ArrayList<String>(Arrays.asList("Steven Spielberg" , "Martin Scorsese")),20);
        Actor actor2= new Actor("Ben Stiller",new ArrayList<String>(Arrays.asList("Steven Spielberg" , "Martin Scorsese")),15);
        Actor actor3= new Actor("Matthew McConaughey",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),25);
        Actor actor4= new Actor("Anne Hathaway",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Woody Allen", "Martin Scorsese")),30);
        Actor actor5= new Actor("Leonardo DiCaprio",new ArrayList<String>(Arrays.asList("Christopher Nolan", "Quentin Tarantino" ,"Clint Eastwood")),50);
        Actor actor6= new Actor("Marion Cotillard",new ArrayList<String>(Arrays.asList("Christopher Nolan" ,"David Fincher" ,"Pedro Almodóvar" ,"Roger Mitchell")),15);

        //APARTADO B
        //mostrar por pantalla los directores

        System.out.println("\nAPARTADO B:\n");

        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);
        System.out.println(actor4);
        System.out.println(actor5);
        System.out.println(actor6);

        //APARTADO C,E
        //crear las instancias pelicula 1,2,3,4

        //primero debemos crear los directores para poder dar de alta estas

        Director director1 = new Director("Hermanos Farrelly",new HashSet<String>(){{add("ComediaRomantica");add("ComediaNegra");}},new HashMap<String,Float>(){{put("ComediaRomantica",2f);put("ComediaNegra",1.5f);}});
        Director director2 = new Director("Christopher Nolan",new HashSet<String>(){{add("Ficcion");add("Guerra");add("Thriller");}},new HashMap<String,Float>(){{put("Ficcion",4f);put("Guerra",8f);put("Thriller",5f);}});


        ComediaRomantica pelicula1 = new ComediaRomantica("Algo pasa con Mary",1998,null,director1,new HashMap<String,Float>(){{put("EE.UU",40f);put("España",8f);put("Italia",9f);put("Alemania",10f);put("Francia",8f);put("Reino Unido",10f);put("Polonia",5f);}});
        Ficcion pelicula2 = new Ficcion("Interstellar",2014,169,director2,new HashMap<String,Float>(){{put("EE.UU",50f);put("España",8f);put("Italia",8f);put("Alemania",10f);put("Francia",5f);put("Reino Unido",15f);put("Polonia",4f);}});
        Ficcion pelicula3 = new Ficcion("Origen",2010,148,director2,new HashMap<String,Float>(){{put("EE.UU",120f);put("España",30f);put("Italia",30f);put("Alemania",50f);put("Francia",25f);put("Reino Unido",24f);put("Polonia",21f);}});
        Ficcion pelicula4 = new Ficcion("El caballero oscuro",2008,152,director2,new HashMap<String,Float>(){{put("EE.UU",180f);put("España",80f);put("Italia",50f);put("Alemania",40f);put("Francia",40f);put("Reino Unido",80f);put("Polonia",30f);}});


        //damos de alta los actores que existen

        pelicula1.darAlta("principal", new ArrayList<>(Arrays.asList(actor1, actor2)));

        pelicula2.darAlta("principal",new ArrayList<>(Arrays.asList(actor3,actor4)));

        pelicula3.darAlta("principal",new ArrayList<>(Arrays.asList(actor5,actor6)));

        pelicula4.darAlta("principal",new ArrayList<>(Collections.singletonList(actor4)));

        //APARTADO D
        //mostrar por pantalla las peliculas

        System.out.println("\nAPARTADO D:\n");

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        System.out.println(pelicula4);

        //APARTADO F
        //mostrar por pantalla las peliculas

        System.out.println("\nAPARTADO F:\n");

        System.out.println(director1);
        System.out.println(director2);

        //APARTADO G
        //Mostrar el número de actores para pelicula1 y pelicula2 usando el correspondiente
        //método por defecto del interface IPelicula.

        System.out.println("\nAPARTADO G:\n");

        System.out.println("Pelicula 1: "+pelicula1.numeroActores());
        System.out.println("Pelicula 2: "+pelicula2.numeroActores());

        //APARTADO H
        //Mostrar el coste de los actores para pelicula3 y pelicula4 usando el correspondiente
        //método por defecto del interface IPelicula.

        System.out.println("\nAPARTADO H:\n");

        System.out.println("Pelicula 3: "+pelicula3.costeActores());
        System.out.println("Pelicula 4: "+pelicula4.costeActores());

        //APARTADO I
        //Indicar si "Leonardo DiCaprio" ha participado en la película pelicula2 usando el método
        //estático del interface IActor.

        System.out.println("\nAPARTADO I:\n");

        System.out.println(IActor.participa("Leonardo DiCaprio",pelicula2));

        //APARTADO J
        //Probar todos los métodos de Pelicula para la instancia pelicula3 (salvo equals y
        //toString).

        System.out.println("\nAPARTADO J:\n");

        pelicula3.setAnho(2005);
        pelicula3.setDuracion(30);
        pelicula3.setRecaudacion(new HashMap<String,Float>(){{put("EE.UU",40f);put("España",8f);put("Italia",9f);put("Alemania",10f);put("Francia",8f);put("Reino Unido",10f);put("Polonia",5f);}});
        System.out.println(pelicula3.getActores());
        System.out.println(pelicula3.getPresupuesto());
        System.out.println(pelicula3.getNombre());
        System.out.println(pelicula3.getDirector());
        System.out.println(pelicula3.getAnho());
        System.out.println(pelicula3.getDuracion());
        System.out.println(pelicula3.getRecaudacion());
        System.out.println(pelicula3.recaudacionTotal());
        System.out.println(pelicula3.presupuesto());
        System.out.println(pelicula3.exito());
        System.out.println(pelicula3.costeActores());
        System.out.println(pelicula3.numeroActores());
        pelicula3.actoresDirigidos(director2);
        pelicula3.actoresFracaso();
        pelicula3.darAlta("secundario",new ArrayList<>(Arrays.asList(actor1, actor2)));


        //APARTADO K
        //Probar todos los métodos de Actor para la instancia actor2 (salvo equals y toString).

        System.out.println("\nAPARTADO K:\n");

        actor2.setCache(1000f);
        actor2.setDeseos(new ArrayList<String>(Arrays.asList("Christopher Nolan" ,"David Fincher" ,"Pedro Almodóvar" ,"Roger Mitchell")));
        System.out.println(actor2.getPeliculas());
        System.out.println(actor2.getDeseos());
        System.out.println(actor2.getCache());
        System.out.println(actor2.getNombre());
        actor2.introducirPelicula(pelicula4);
        System.out.println(actor2.peliculasDeGenero("Comedia"));
        System.out.println(actor2.peliculasFracaso("Comedia"));
        System.out.println(actor2.importancia("principal"));
        System.out.println(actor2.totalGanancias());
        System.out.println(actor2.deseosNoCumplidos());
        System.out.println(IActor.participa("Christopher Nolan",pelicula3));


        //APARTADO K
        //Probar todos los métodos de Director para el director de la pelicula4 (salvo equals y
        //toString).

        System.out.println("\nAPARTADO K:\n");

        director2.setCache(new HashMap<String,Float>(){{put("ComediaRomantica",2f);put("ComediaNegra",1.5f);}});
        director2.setNombre("Ivan");
        director2.setEspecialista(new HashSet<String>(){{add("ComediaRomantica");add("ComediaNegra");}});
        System.out.println(director2.getPeliculas());
        System.out.println(director2.getNombre());
        System.out.println(director2.getEspecialista());
        System.out.println(director2.getCache());
        System.out.println(director2.dirigirActor("Christopher Nolan"));
        System.out.println(director2.generoMasCaro());
        System.out.println(director2.peliculasMasBeneficio(60f));
        director2.introducirPelicula(pelicula2);


        //FUNCIONA

        System.out.println("\nTodo ha funcionado");


    }
}
