package B2E3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class PrincipalB2E3 {
    public static void main(String[] args) {

        //APARTADO A
        //CREAR LOS SENSORES INDICADOS EN EL EXCEL

        Sensor sensor1 = new Sensor("100", "temperatura", new float[]{-5, 35f}, 54.4f);
        Sensor sensor2 = new Sensor("101", "temperatura", new float[]{-5, 40f}, 48.5f);
        Sensor sensor3 = new Sensor("102", "temperatura", new float[]{-5, 40f}, 80.0f);
        Sensor sensor4= new Sensor("103", "temperatura", new float[]{-5, 40f}, 45.0f);
        Sensor sensor5= new Sensor("104", "temperatura", new float[]{-5, 40f}, 67.0f);
        Sensor sensor6 = new Sensor("105", "temperatura", new float[]{-5, 40f}, 86.0f);
        Sensor sensor7 = new Sensor("106", "temperatura", new float[]{-10, 50f}, 34.0f);
        Sensor sensor8 = new Sensor("107", "temperatura", new float[]{-10, 50f}, 35.0f);
        Sensor sensor9= new Sensor("108", "temperatura", new float[]{-10, 50f}, 78.0f);
        Sensor sensor10= new Sensor("200", "sonido", new float[]{0, 118f}, 67.6f);
        Sensor sensor11= new Sensor("201", "sonido", new float[]{0, 118f}, 56.0f);
        Sensor sensor12= new Sensor("202", "sonido", new float[]{0, 118f}, 57.0f);
        Sensor sensor13= new Sensor("203", "sonido", new float[]{0, 130f}, 57.0f);
        Sensor sensor14= new Sensor("204", "sonido", new float[]{0, 150f}, 60.0f);
        Sensor sensor15= new Sensor("205", "sonido", new float[]{0, 120f}, 70.0f);
        Sensor sensor16= new Sensor("206", "sonido", new float[]{0, 120f}, 70.0f);
        Sensor sensor17= new Sensor("207", "sonido", new float[]{0, 120f}, 70.0f);
        Sensor sensor18= new Sensor("208", "sonido", new float[]{0, 120f}, 70.0f);
        Sensor sensor19= new Sensor("300", "humedad", new float[]{0, 100f}, 44.0f);
        Sensor sensor20= new Sensor("301", "humedad", new float[]{0, 100f}, 50.0f);
        Sensor sensor21= new Sensor("302", "humedad", new float[]{0, 100f}, 45.0f);
        Sensor sensor22= new Sensor("303", "humedad", new float[]{0, 100f}, 45.0f);
        Sensor sensor23= new Sensor("304", "humedad", new float[]{0, 100f}, 45.0f);
        Sensor sensor24= new Sensor("305", "humedad", new float[]{0, 80f}, 45.0f);
        Sensor sensor25= new Sensor("306", "humedad", new float[]{0, 80f}, 60.0f);
        Sensor sensor26= new Sensor("109", "temperatura", new float[]{-10, 50f}, 56.0f);
        Sensor sensor27= new Sensor("110", "temperatura", new float[]{-10, 50f}, 45.0f);
        Sensor sensor28= new Sensor("209", "sonido", new float[]{0, 120f}, 89.0f);
        Sensor sensor29= new Sensor("307", "humedad", new float[]{0, 80f}, 34.0f);
        Sensor sensor30= new Sensor("308", "humedad", new float[]{0, 80f}, 45.0f);
        Sensor sensor31= new Sensor("309", "humedad", new float[]{0, 80f}, 34.0f);


        //APARTADO B
        //CREAR LAS PLANTAS, PLANTA_1,PLANTA0 Y PLANTA1


        Planta planta_1 = new Planta(-1,"oficinas");
        Planta planta0 = new Planta(0,"administracion");
        Planta planta1 = new Planta(1,"oficinas");
        Planta planta2 = new Planta(2,"viviendas libres");


        //APARTADO C
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LAS PLANTAS CREADAS
        System.out.println("APARTADO C:\n");

        System.out.println("\nPlanta-1:\n");
        System.out.println(planta_1);

        System.out.println("\nPlanta0:\n");
        System.out.println(planta0);

        System.out.println("\nPlanta1:\n");
        System.out.println(planta1);

        System.out.println("\nPlanta2:\n");
        System.out.println(planta2);

        //APARTADO D
        //CREAR LOS ESTANCIAS INDICADOS EN EL EXCEL,DANDO DE ALTA LOS SENSORES

        Estancia estancia1 = new Estancia("-100",planta_1);
        Estancia estancia2 = new Estancia("-101",planta_1);
        Estancia estancia3 = new Estancia("-102",planta_1);
        Estancia estancia4 = new Estancia("000",planta0);
        Estancia estancia5 = new Estancia("001",planta0);
        Estancia estancia6 = new Estancia("002",planta0);
        Estancia estancia7 = new Estancia("003",planta0);
        Estancia estancia8 = new Estancia("100",planta1);
        Estancia estancia9 = new Estancia("101",planta1);
        Estancia estancia10 = new Estancia("102",planta1);
        Estancia estancia11 = new Estancia("200",planta2);
        Estancia estancia12 = new Estancia("201",planta2);
        Estancia estancia13 = new Estancia("202",planta2);

        //damos de alta los sensores

        estancia4.darAlta(sensor1);
        estancia5.darAlta(sensor2);
        estancia6.darAlta(sensor3);
        estancia7.darAlta(sensor4);
        estancia8.darAlta(sensor5);
        estancia9.darAlta(sensor6);
        estancia10.darAlta(sensor7);
        estancia11.darAlta(sensor8);
        estancia12.darAlta(sensor9);
        estancia1.darAlta(sensor10);
        estancia3.darAlta(sensor11);
        estancia5.darAlta(sensor12);
        estancia10.darAlta(sensor13);
        estancia12.darAlta(sensor14);
        estancia13.darAlta(sensor15);
        estancia6.darAlta(sensor16);
        estancia7.darAlta(sensor17);


        //APARTADO E
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LAS PLANTAS CREADAS
        System.out.println("APARTADO E:\n");

        System.out.println("\nEstancia 1:\n");
        System.out.println(estancia1);

        System.out.println("\nEstancia 2:\n");
        System.out.println(estancia2);

        System.out.println("\nEstancia 3:\n");
        System.out.println(estancia3);

        System.out.println("\nEstancia 4:\n");
        System.out.println(estancia4);

        System.out.println("\nEstancia 5:\n");
        System.out.println(estancia5);

        System.out.println("\nEstancia 6:\n");
        System.out.println(estancia6);

        System.out.println("\nEstancia 7:\n");
        System.out.println(estancia7);

        System.out.println("\nEstancia 8:\n");
        System.out.println(estancia8);

        System.out.println("\nEstancia 9:\n");
        System.out.println(estancia9);

        System.out.println("\nEstancia 10:\n");
        System.out.println(estancia10);

        System.out.println("\nEstancia 11:\n");
        System.out.println(estancia11);

        System.out.println("\nEstancia 12:\n");
        System.out.println(estancia12);

        System.out.println("\nEstancia 13:\n");
        System.out.println(estancia13);


        //APARTADO F
        //DAR DE ALTA LAS ESTANCIAS DE LA 1 A LA 10

        ArrayList<Estancia> estanciasplanta_1 = new ArrayList<>(Arrays.asList(estancia1,estancia2,estancia3));
        ArrayList<Estancia> estanciasplanta0 = new ArrayList<>(Arrays.asList(estancia4,estancia5,estancia6,estancia7));
        ArrayList<Estancia> estanciasplanta1 = new ArrayList<>(Arrays.asList(estancia8,estancia9,estancia10));

        planta_1.darAltaEstancia(estanciasplanta_1);
        planta0.darAltaEstancia(estanciasplanta0);
        planta1.darAltaEstancia(estanciasplanta1);

        //APARTADO G
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LAS PLANTAS CREADAS
        System.out.println("APARTADO G:\n");

        System.out.println("\nPlanta-1:\n");
        System.out.println(planta_1);

        System.out.println("\nPlanta0:\n");
        System.out.println(planta0);

        System.out.println("\nPlanta1:\n");
        System.out.println(planta1);

        System.out.println("\nPlanta2:\n");
        System.out.println(planta2);

        //APARTADO H
        //EN LA PLANTA 1, DAR DE ALTA EL SENSOR 18,23

        ArrayList<Sensor> sensores1 = new ArrayList<>(Arrays.asList(sensor18,sensor23));

        //se puede pasar tambien en todos estos casos como estancia8.getNombre;

        planta1.darAltaSensor(estancia8.getNombre(),sensores1);

        //APARTADO I
        //EN LA PLANTA 1, DAR DE ALTA EL SENSOR 24

        planta1.darAltaSensor(estancia9.getNombre(),sensor24);

        //APARTADO J
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1

        System.out.println("APARTADO J:\n");

        /*Presupuesto*/

        System.out.println("Planta1:\n");
        System.out.println(planta1);

        //APARTADO K
        //EN LA PLANTA_1, DAR DE ALTA EL SENSOR 19,20,21

        /*NO Se dan de alta ya que no estan actualizados en la estancia*/

        planta_1.darAltaSensor(estancia1.getNombre(),sensor19);
        planta_1.darAltaSensor(estancia2.getNombre(),sensor20);
        planta_1.darAltaSensor(estancia3.getNombre(),sensor21);

        //APARTADO L
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1

        System.out.println("APARTADO L:\n");

        System.out.println("Planta_1:\n");
        System.out.println(planta_1);

        //APARTADO M
        //EN LA PLANTA 2, DAR DE ALTA LAS ESTANCIAS 11,12,13

        planta2.darAltaEstancia(estancia11);
        planta2.darAltaEstancia(estancia12);
        planta2.darAltaEstancia(estancia13);


        //APARTADO N
        //DAR DE ALTA EL SENSOR 25 EN LA PLANTA 2

        planta2.darAltaSensor(estancia11.getNombre(),sensor25);

        //APARTADO O
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 2

        System.out.println("APARTADO O:\n");

        System.out.println("Planta2:\n");
        System.out.println(planta2);

        //APARTADO P
        //EN LA PLANTA 0 DAR DE ALTA EL SENSOR 22

        planta0.darAltaSensor(estancia4.getNombre(),sensor22);

        //APARTADO Q
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 0

        System.out.println("APARTADO Q:\n");

        System.out.println("Planta0:\n");
        System.out.println(planta0);

        //APARTADO R
        //CREAR UN EDIFICIO

        ArrayList<Planta> plantasedificio1 = new ArrayList<>(Arrays.asList(planta_1,planta1,planta2));

        Edificio edificio1 = new Edificio("edificio1",new int[]{-1,2},plantasedificio1);

        //APARTADO S
        //MOSTRAMOS POR PANTALLA LAS PLANTAS QUE AUN NO ESTEN ASIGNADAS EN EL EDIFICIO


        System.out.println("APARTADO S:\n");

        int[] devuelto = edificio1.plantasNoAlta();

        for(int i : devuelto){
            System.out.print(i +",");
        }

        //APARTADO T
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 2

        System.out.println("\n\nAPARTADO T:\n");

        System.out.println("Planta2:\n");
        System.out.println(planta2);

        //APARTADO U
        //DAR DE BAJA EL SESNSOR 8 DE LA PLANTA 2 Y SUBSTITUIRLO POR EL 26

        planta2.darBajaSensor(sensor8.getId(),sensor26);

        //APARTADO v
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 2

        System.out.println("APARTADO V:\n");

        /*HAY QUE ACTIUALIZAR LA ID EN EL SENSOR QUE INTRODUCIMOS*/
        System.out.println("Planta2:\n");
        System.out.println(planta2);

        //APARTADO W
        //DAR DE BAJA EL SESNSOR 6 DE LA PLANTA1 Y SUBSTITUIRLO POR EL 27

        planta1.darBajaSensor(sensor6.getId(),sensor27);

        //APARTADO X
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1

        System.out.println("APARTADO X:\n");

        /*HAY QUE ACTIUALIZAR LA ID EN EL SENSOR QUE INTRODUCIMOS*/
        System.out.println("Planta1:\n");
        System.out.println(planta1);

        //APARTADO Y
        //DAR DE BAJA EL SESNSOR 10 DE LA PLANTA_1 Y SUBSTITUIRLO POR EL 28

        planta_1.darBajaSensor(sensor10.getId(),sensor28);

        //APARTADO Z
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1

        System.out.println("APARTADO Z:\n");


        System.out.println("Planta1:\n");
        System.out.println(planta_1);

        //APARTADO AA
        //DAR DE BAJA EL SESNSOR 22 DE LA PLANTA 0 Y SUBSTITUIRLO POR EL 29


        planta0.darBajaSensor(sensor22.getId(),sensor29);

        //APARTADO BB
        //DAR DE BAJA EL SESNSOR 29 DE LA PLANTA 0 Y SUBSTITUIRLO POR EL 30

        planta0.darBajaSensor(sensor29.getId(),sensor30);

        //APARTADO CC
        //DAR DE BAJA EL SESNSOR 30 DE LA PLANTA 0 Y SUBSTITUIRLO POR EL 31

        planta0.darBajaSensor(sensor30.getId(), sensor31);

        //APARTADO DD
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 0

        System.out.println("APARTADO DD:\n");

        /*HAY QUE ACTIUALIZAR LA ID EN EL SENSOR QUE INTRODUCIMOS*/
        System.out.println("Planta0:\n");
        System.out.println(planta0);


        //APARTADO EE
        //MOSTRAMOS POR PANTALLA LOS TIPOS DE SENSORES MAS DEFECTUOSOS DE LA PLANTA 0

        System.out.println("APARTADO EE:\n");

        /*TAMPOCO SALEN LOS SESNORES MAS DEFECTUOSOS PORQ NO ESTA DADOS DE ALTA LOS SENSORES*/
        System.out.println("\nPlanta0:\n");
        for (String tipo : planta0.tipoSensoresMasDefectuosos()){
            System.out.print(tipo+ ",");

        }

        //APARTADO FF
        //MOSTRAMOS POR PANTALLA LOS SENSORES DE HUMEDAD QUE HAY EN LA PLANTA 2

        System.out.println("\n\nAPARTADO FF:\n");

        System.out.println("Planta2:\n");
        for(Sensor sensor:planta2.sensoresTipo("humedad")) {
            System.out.print(sensor.getId()+",");
        }

        //APARTADO GG
        //MOSTRAMOS POR PANTALLA LOS SENSORES DE SONIDO QUE HAY EN LA PLANTA 1

        System.out.println("\n\nAPARTADO GG:\n");

        System.out.println("Planta1:\n");
        for(Sensor sensor:planta1.sensoresTipo("sonido")) {
            System.out.print(sensor.getId()+",");
        }

        //APARTADO HH
        //DAR DE ALTA LA PLANTA 0 EN EL EDIFICIO

        edificio1.darAltaPlanta(planta0);

        //APARTADO II
        //MOSTRAMOS POR PANTALLA LAS PLANTAS QUE AUN NO ESTEN ASIGNADAS EN EL EDIFICIO

        System.out.println("\n\nAPARTADO II:\n");
        System.out.print("[");
        for(int i : edificio1.plantasNoAlta()){
            System.out.print(i +",");
        }
        System.out.print("]");

        //APARTADO JJ
        //MOSTRAMOS POR PANTALLA LAS PLANTAS DEL EDIFICIO CON MAS PROBLEMAS

        System.out.println("\n\nAPARTADO JJ:\n");

        for (Map.Entry<Integer, Set<Estancia>> entry : edificio1.plantasMasProblemas().entrySet() ){
            System.out.print("Planta:"+ entry.getKey()+" idEstancias: [");
            for(Estancia i : entry.getValue()){
                System.out.print(i.getNombre()+",");
            }
            System.out.println("]");



        }

        //APARTADO KK
        //MOSTRAMOS POR PANTALLA LAS PLANTAS MAS CARAS

        System.out.println("\n\nAPARTADO kk:\n");

        for(Planta planta : edificio1.plantasMasCaras()){
            System.out.print(planta.getNumero()+",");

        }



















    }
}
