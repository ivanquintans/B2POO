package B3E1;

import java.util.ArrayList;
import java.util.Arrays;

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
        Actor actor20= new Actor("Cameron Diaz",new ArrayList<String>(Arrays.asList("Martin Scorsese", "Sofia Coppola", "Paul Haggis")),80);




        //APARTADO B
        //mostramos por pantalla limites superiores y inferiores

        System.out.println("APARTADO B:\n");

        System.out.println("Sensor 1: " + sensor1.limiteInferior() + " , " + sensor1.limiteSuperior());
        System.out.println("Sensor 2: " + sensor2.limiteInferior() + " , " + sensor2.limiteSuperior());
        System.out.println("Sensor 3: " + sensor3.limiteInferior() + " , " + sensor3.limiteSuperior());
        System.out.println("Sensor 4: " + sensor4.limiteInferior() + " , " + sensor4.limiteSuperior());

        //APARTADO C
        //crear una estancia

        Estancia estancia1 = new Estancia("Aula01",2);

        //APARTADO D
        //damos de alta a los sensores creadaos

        System.out.println("APARTADO D:\n");

        System.out.println("Sensor 1 " + estancia1.darAlta(sensor1));
        System.out.println("Sensor 2 " + estancia1.darAlta(sensor2));
        System.out.println("Sensor 3 " + estancia1.darAlta(sensor3));
        System.out.println("Sensor 4 " + estancia1.darAlta(sensor4));

        //APARTADO E
        //introducir los valores de los sensores

        System.out.println("APARTADO E:\n");

        //sensor 1

        System.out.println("\nSensor 1:\n");

        System.out.println(estancia1.nuevoDato(sensor1.getId(), 23.4f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 23.4f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 23.5f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 24.1f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 23.2f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), -23.5f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 24.6f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), -23.8f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 23.9f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 24.1f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 24.3f));
        System.out.println(estancia1.nuevoDato(sensor1.getId(), 25.4f));

        //sensor2

        System.out.println("\nSensor 2:\n");

        System.out.println(estancia1.nuevoDato(sensor2.getId(), 22.1f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), -22.1f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 22.5f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 22.4f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 22.9f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 21.2f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 21.5f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 21.1f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 20.9f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), -23.1f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 22.8f));
        System.out.println(estancia1.nuevoDato(sensor2.getId(), 23.2f));

        //sensor3
        System.out.println("\nSensor 3:\n");

        System.out.println(estancia1.nuevoDato(sensor3.getId(), 21.4f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), -21.3f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 21.2f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), -21.2f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), -21.2f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 21.5f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 22.3f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 21.8f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 22.1f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 21.7f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), -21.9f));
        System.out.println(estancia1.nuevoDato(sensor3.getId(), 22.5f));

        //sensor4
        System.out.println("\nSensor 4:\n");

        System.out.println(estancia1.nuevoDato(sensor4.getId(), 10.1f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 10.1f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), -5.2f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 30.6f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 37.8f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 45.8f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 50.2f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 52.1f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 46.3f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), -10.3f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 89.2f));
        System.out.println(estancia1.nuevoDato(sensor4.getId(), 34.3f));

        //APARTADO F
        //mostramos por pantalla los sensores

        System.out.println("\nAPARTADO F:\n");

        System.out.println("SENSOR1:\n");

        System.out.println(sensor1);

        System.out.println("\nSENSOR2:\n");

        System.out.println(sensor2);

        System.out.println("\nSENSOR3:\n");

        System.out.println(sensor3);

        System.out.println("\nSENSOR4:\n");

        System.out.println(sensor4);

        //APARTADO G
        //mostrar por pantalla la estancia1

        System.out.println("\nAPARTADO G:\n");

        System.out.println(estancia1);



        //APARTADO H
        //dar de alta los sensores 5,6,7

        System.out.println("\nAPARTADO H:\n");

        System.out.println(estancia1.darAlta("202","sonido",new float[]{0,118f},28.4f)); //5
        System.out.println(estancia1.darAlta("301","humedad",new float[]{0,100f},34.3f)); //6
        System.out.println(estancia1.darAlta("302","humedad",new float[]{0,100f},42.5f)); //7

        //APARTADO I
        //mostramos por pantalla limites superiores y inferiores

        System.out.println("\nAPARTADO I\n");

        ArrayList<String> ids = new ArrayList<>();

        //añadimos los strings que queremos
        ids.add("202");
        ids.add("301");
        ids.add("302");

        //ESTOS NO HACIA FALTA
        System.out.println("Sensor 1: " + sensor1.limiteInferior() + " , " + sensor1.limiteSuperior());
        System.out.println("Sensor 2: " + sensor2.limiteInferior() + " , " + sensor2.limiteSuperior());
        System.out.println("Sensor 3: " + sensor3.limiteInferior() + " , " + sensor3.limiteSuperior());
        System.out.println("Sensor 4: " + sensor4.limiteInferior() + " , " + sensor4.limiteSuperior());



        int j=5;
        for(Sensor i : estancia1.getSensores().values()){
            if (ids.contains(i.getId())){
                System.out.println("Sensor "+j+": " + i.limiteInferior() + " , " + i.limiteSuperior());
                j++;

            }
        }

        //APARTADO J
        //mostramos por pantalla los sensores 5,6,7

        System.out.println("\nAPARTADO J:\n");
        for(Sensor i : estancia1.getSensores().values()){

            if (ids.contains(i.getId())){
                System.out.println("\n"+i);

            }
        }

        //APARTADO K
        //mostramos por pantalla la estancia1

        //COMO NO TIENE VALORES ALGUNOS SESNSORES NOS DAN DE MEDIA EL VALOR PARA FLOAT MINIMO

        System.out.println("\nAPARTADO K:\n");

        System.out.println(estancia1);

        //APARTADO l
        //añadimos los valores
        System.out.println("\nAPARTADO L:");

        //sensor 5

        System.out.println("\nDATOS SENSOR 5:\n");

        System.out.println( estancia1.nuevoDato("202",5.1f)+ " \n" +
                estancia1.nuevoDato("202",5.2f) + " \n" +
                estancia1.nuevoDato("202",3.5f)+ " \n" +
                estancia1.nuevoDato("202",25.5f)+ " \n" +
                estancia1.nuevoDato("202",25.5f)+ " \n" +
                estancia1.nuevoDato("202",-29.3f)+ " \n" +
                estancia1.nuevoDato("202",35.1f)+ " \n" +
                estancia1.nuevoDato("202",35.4f)+ " \n" +
                estancia1.nuevoDato("202",-35.1f)+ " \n" +
                estancia1.nuevoDato("202",40.1f)+ " \n" +
                estancia1.nuevoDato("202",49.8f)+ " \n" +
                estancia1.nuevoDato("202",34.5f));

        //sensor 6

        System.out.println("\nDATOS SENSOR 6:\n");

        System.out.println( estancia1.nuevoDato("301",31.0f) + " \n" +
                estancia1.nuevoDato("301",31.2f)+ " \n" +
                estancia1.nuevoDato("301",31.4f)+ " \n" +
                estancia1.nuevoDato("301",32.1f)+ " \n" +
                estancia1.nuevoDato("301",32.4f)+ " \n" +
                estancia1.nuevoDato("301",32.0f)+ " \n" +
                estancia1.nuevoDato("301",32.4f)+ " \n" +
                estancia1.nuevoDato("301",33.4f)+ " \n" +
                estancia1.nuevoDato("301",33.0f)+ " \n" +
                estancia1.nuevoDato("301",32.8f)+ " \n" +
                estancia1.nuevoDato("301",32.9f)+ " \n" +
                estancia1.nuevoDato("301",32.5f));


        //sensor 7

        System.out.println("\nDATOS SENSOR 7:\n");

        System.out.println( estancia1.nuevoDato("302",-45.1f) + " \n" +
                estancia1.nuevoDato("302",-45.2f)+ " \n" +
                estancia1.nuevoDato("302",-45.2f)+ " \n" +
                estancia1.nuevoDato("302",-45.2f)+ " \n" +
                estancia1.nuevoDato("302",34.9f)+ " \n" +
                estancia1.nuevoDato("302",34.5f)+ " \n" +
                estancia1.nuevoDato("302",34.6f)+ " \n" +
                estancia1.nuevoDato("302",38.9f)+ " \n" +
                estancia1.nuevoDato("302",37.2f)+ " \n" +
                estancia1.nuevoDato("302",-45.1f)+ " \n" +
                estancia1.nuevoDato("302",36.4f)+ " \n" +
                estancia1.nuevoDato("302",35.4f));

        //APARTADO M
        //mostramos por pantalla la estancia1

        System.out.println("\nAPARTADO M:\n");
        System.out.println(estancia1);

        //APARTADO N
        //mostramos por pantalla las caracteristicas de los sensores temperatura

        System.out.println("\nAPARTADO N:\n");
        for(Sensor i : estancia1.sensoresTipo("temperatura")){
            System.out.println(i);
        }

        //APARTADO O
        //mostramos por pantalla las caracteristicas de los sensores sonido

        System.out.println("\nAPARTADO O:\n");
        for(Sensor i : estancia1.sensoresTipo("sonido")){
            System.out.println(i);
        }

        //APARTADO P
        //IMPRIMIMOS EL SENSOR CON VALOR MAXIMO Y MINIMO DE TEMPERATURA

        //SENSOR MAX VALOR

        System.out.println("\nAPARTADO P:\n");

        System.out.println("\nSensor Maximo:\n");

        for(Sensor i : estancia1.sensorMaxValor("humedad")){
            System.out.println(i);
        }

        System.out.println("\nSensor Minimo:\n");

        for(Sensor i : estancia1.sensorMinValor("humedad")){
            System.out.println(i);
        }

        //APARTADO Q
        //MOSTRAMOS LOS VALORES PARA EL SENSOR CON ID 301 CUYOS VALORES MAYORES QUE 33

        System.out.println("\nAPARTADO Q:\n");

        System.out.println(estancia1.valoresSuperiores("301",33f));

        //APARTADO R
        //AÑADIR EL SENSOR 8

        System.out.println("\nAPARTADO R:\n");

        System.out.println(estancia1.darAlta("202","sonido",new float[]{0,118f},67.6f));

        //APARTADO S
        //mostramos por pantalla la estancia1

        System.out.println("\nAPARTADO S:\n");
        System.out.println(estancia1);

        //APARTADO T
        //mostramos por pantalla los valores de los sensores ruido

        System.out.println("\nAPARTADO T:\n");
        System.out.println(estancia1.valoresSensoresTipo("ruido").values());

        //añado sonido por si acaso no eran los de tipo ruido
        System.out.println(estancia1.valoresSensoresTipo("sonido").values());

        //APARTADO U
        //mostramos por pantalla los identificadores de los sensores con valor mayor a 40

        System.out.println("\nAPARTADO U:\n");

        for(Sensor i : estancia1.sensoresCosteMayor(40)){
            System.out.print(i.getId() + ", ");
        }

















    }
}

