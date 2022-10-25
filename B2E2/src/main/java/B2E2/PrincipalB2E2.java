package B2E2;

import java.util.ArrayList;

public class PrincipalB2E2 {
    public static void main(String[] args) {

        //Apartado A
        //crear los sensores1,2,3 con los valores del fichero excel

        Sensor sensor1 = new Sensor("100","temperatura",new float[]{-5,34f},54.5f);
        Sensor sensor2 = new Sensor("101","temperatura",new float[]{-5,40f},48.5f);
        Sensor sensor3 = new Sensor("200","sonido",new float[]{0,120f},30.5f);
        Sensor sensor4 = new Sensor("201","sonido",new float[]{0,110f},28.3f);


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

        estancia1.darAlta(sensor1);
        estancia1.darAlta(sensor2);
        estancia1.darAlta(sensor3);
        estancia1.darAlta(sensor4);

        //APARTADO E
        //introducir los valores de los sensores

        //sensor 1

        sensor1.nuevoDato(23.4f);
        sensor1.nuevoDato(23.4f);
        sensor1.nuevoDato(23.5f);
        sensor1.nuevoDato(24.1f);
        sensor1.nuevoDato(23.2f);
        sensor1.nuevoDato(-23.5f);
        sensor1.nuevoDato(24.6f);
        sensor1.nuevoDato(-23.8f);
        sensor1.nuevoDato(23.9f);
        sensor1.nuevoDato(24.1f);
        sensor1.nuevoDato(24.3f);
        sensor1.nuevoDato(25.4f);

        //sensor2

        sensor2.nuevoDato(22.1f);
        sensor2.nuevoDato(-22.1f);
        sensor2.nuevoDato(22.5f);
        sensor2.nuevoDato(22.4f);
        sensor2.nuevoDato(22.9f);
        sensor2.nuevoDato(21.2f);
        sensor2.nuevoDato(21.5f);
        sensor2.nuevoDato(21.1f);
        sensor2.nuevoDato(20.9f);
        sensor2.nuevoDato(-23.1f);
        sensor2.nuevoDato(22.8f);
        sensor2.nuevoDato(23.2f);

        //sensor3

        sensor3.nuevoDato(21.4f);
        sensor3.nuevoDato(-21.3f);
        sensor3.nuevoDato(21.2f);
        sensor3.nuevoDato(-21.2f);
        sensor3.nuevoDato(21.2f);
        sensor3.nuevoDato(21.5f);
        sensor3.nuevoDato(22.3f);
        sensor3.nuevoDato(21.8f);
        sensor3.nuevoDato(22.1f);
        sensor3.nuevoDato(21.7f);
        sensor3.nuevoDato(-21.9f);
        sensor3.nuevoDato(22.5f);

        //sensor4

        sensor4.nuevoDato(10.1f);
        sensor4.nuevoDato(10.1f);
        sensor4.nuevoDato(-5.2f);
        sensor4.nuevoDato(30.6f);
        sensor4.nuevoDato(37.8f);
        sensor4.nuevoDato(45.8f);
        sensor4.nuevoDato(50.2f);
        sensor4.nuevoDato(52.1f);
        sensor4.nuevoDato(46.3f);
        sensor4.nuevoDato(-10.3f);
        sensor4.nuevoDato(89.2f);
        sensor4.nuevoDato(34.3f);

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

        estancia1.darAlta("202","sonido",new float[]{0,118f},28.4f); //5
        estancia1.darAlta("301","humedad",new float[]{0,100f},34.3f); //6
        estancia1.darAlta("302","humedad",new float[]{0,100f},42.5f); //7

        //APARTADO I
        //mostramos por pantalla limites superiores y inferiores

        System.out.println("\nAPARTADO I\n");

        //tenemos que hacer una funcion que nos permita buscar el sensor que queremos

        ArrayList<String> ids = new ArrayList<>();

        //añadimos los strings que queremos
        ids.add("202");
        ids.add("301");
        ids.add("302");

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

        //APARTADO V
        //mostramos por pantalla los identificadores de los sensores con valor mayor a 40

        System.out.println("\nAPARTADO V:\n");

        for(Sensor i : estancia1.sensoresCosteMayor(40)){
            System.out.print(i.getId() + ", ");
        }

















    }
}