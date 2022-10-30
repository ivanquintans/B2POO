package B2E3;

import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalB2E3 {
    public static void main(String[] args) {

        //APARTADO A
        //CREAR LOS SENSORES INDICADOS EN EL EXCEL

        Sensor sensor1 = new Sensor("100", "temperatura", new float[]{-5, 35f}, 54.5f);
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
        Planta planta_0 = new Planta(0,"administracion");
        Planta planta1 = new Planta(1,"oficinas");
        Planta planta2 = new Planta(2,"viviendas libres");


        //APARTADO C
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LAS PLANTAS CREADAS
        System.out.println("APARTADO C:\n");

        System.out.println("\nPlanta-1:\n");
        System.out.println(planta_1);

        System.out.println("\nPlanta0:\n");
        System.out.println(planta_0);

        System.out.println("\nPlanta1:\n");
        System.out.println(planta1);

        System.out.println("\nPlanta2:\n");
        System.out.println(planta2);

        //APARTADO D
        //CREAR LOS ESTANCIAS INDICADOS EN EL EXCEL,DANDO DE ALTA LOS SENSORES

        Estancia estancia1 = new Estancia("-100",planta_1);
        Estancia estancia2 = new Estancia("-101",planta_1);
        Estancia estancia3 = new Estancia("-102",planta_1);
        Estancia estancia4 = new Estancia("000",planta_0);
        Estancia estancia5 = new Estancia("001",planta_0);
        Estancia estancia6 = new Estancia("002",planta_0);
        Estancia estancia7 = new Estancia("003",planta_0);
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
        ArrayList<Estancia> estanciasplanta2 = new ArrayList<>(Arrays.asList(estancia11,estancia12,estancia13));

        planta_1.darAltaEstancia(estanciasplanta_1);
        planta_0.darAltaEstancia(estanciasplanta0);
        planta1.darAltaEstancia(estanciasplanta1);
        planta2.darAltaEstancia(estanciasplanta2);

        //APARTADO G
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LAS PLANTAS CREADAS
        System.out.println("APARTADO G:\n");

        System.out.println("\nPlanta-1:\n");
        System.out.println(planta_1);

        System.out.println("\nPlanta0:\n");
        System.out.println(planta_0);

        System.out.println("\nPlanta1:\n");
        System.out.println(planta1);

        System.out.println("\nPlanta2:\n");
        System.out.println(planta2);

        //APARTADO H
        //EN LA PLANTA 1, DAR DE ALTA EL SENSOR 18,23

        ArrayList<Sensor> sensores1 = new ArrayList<>(Arrays.asList(sensor8,sensor23));
        planta1.darAltaSensor("100",sensores1);

        //APARTADO I
        //EN LA PLANTA 1, DAR DE ALTA EL SENSOR 24

        planta1.darAltaSensor("101",sensor24);

        //APARTADO J
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1

        System.out.println("APARTADO J:\n");

        System.out.println("\nPlanta1:\n");
        System.out.println(planta1);

        //APARTADO K
        //EN LA PLANTA 1, DAR DE ALTA EL SENSOR 19,20,21

        /*NO Se dan de alta ya que no estan actualizados en la estancia*/

        planta1.darAltaSensor("-100",sensor19);
        planta1.darAltaSensor("-101",sensor20);
        planta1.darAltaSensor("-102",sensor21);

        //APARTADO L
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1

        System.out.println("APARTADO J:\n");

        System.out.println("\nPlanta1:\n");
        System.out.println(planta1);

        //APARTADO M
        //EN LA PLANTA 2, DAR DE ALTA EL SENSOR 25
        //EN LA PLANTA 0, DAR DE ALTA EL SENSOR 22
        System.out.println("APARTADO A:\n");

        //APARTADO M
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1
        System.out.println("APARTADO A:\n");

        //APARTADO N
        //CREAR UNA INSTANCIA EDIFICIO
        System.out.println("APARTADO A:\n");

        //APARTADO O
        //MOSTRAR POR PANTALLA LAS PLANTAS QUE AUN NO ESTAN ASIGNADAAS AL EDIFICIO
        System.out.println("APARTADO A:\n");

        //APARTADO P
        //CREAR LAS PLANTA2
        System.out.println("APARTADO A:\n");

        //APARTADO Q
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 2
        System.out.println("APARTADO A:\n");

        //APARTADO R
        //EN LA PLANTA 2 DAR DE ALTA LA ESTANCIA 13
        System.out.println("APARTADO A:\n");

        //APARTADO S
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 2
        System.out.println("APARTADO A:\n");

        //APARTADO T
        //DAR DE BAJA EL SESNSOR 8 DE LA PLANTA 2 Y SUBSTITUIRLO POR EL 26
        System.out.println("APARTADO A:\n");

        //APARTADO U
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 2
        System.out.println("APARTADO A:\n");


        //APARTADO V
        //DAR DE BAJA EL SESNSOR 6 DE LA PLANTA 1 Y SUBSTITUIRLO POR EL 27
        System.out.println("APARTADO A:\n");

        //APARTADO X
        //MOSTRAMOS POR PANTALLA LAS CARACTERISTICAS DE LA PLANTA 1
        System.out.println("APARTADO A:\n");















    }
}
