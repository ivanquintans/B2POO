package B2E1;

import java.util.ArrayList;

public class PrincipalB2E1 {
    public static void main(String[] args) {

        //Apartado A
        //crear los sensores1,2,3 con los valores del fichero excel

        Sensor sensor1 = new Sensor("100","temperatura",new float[]{-5,35f},54.5f);
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
        for(Sensor i : estancia1.getSensores()){
            if (ids.contains(i.getId())){
                System.out.println("Sensor "+j+": " + i.limiteInferior() + " , " + i.limiteSuperior());
                j++;

            }
        }

        //APARTADO J
        //mostramos por pantalla los sensores 5,6,7

        System.out.println("\nAPARTADO J:\n");
        for(Sensor i : estancia1.getSensores()){

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
















    }
}