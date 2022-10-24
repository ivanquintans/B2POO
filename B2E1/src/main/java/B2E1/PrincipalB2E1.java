package B2E1;

public class PrincipalB2E1 {
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

        System.out.println("Sensor 1:" + sensor1.limiteInferior() + " , " + sensor1.limiteSuperior());
        System.out.println("Sensor 2:" + sensor2.limiteInferior() + " , " + sensor2.limiteSuperior());
        System.out.println("Sensor 3:" + sensor3.limiteInferior() + " , " + sensor3.limiteSuperior());
        System.out.println("Sensor 4:" + sensor4.limiteInferior() + " , " + sensor4.limiteSuperior());

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

        sensor2.nuevoDato(23.4f);
        sensor2.nuevoDato(23.4f);
        sensor2.nuevoDato(23.5f);
        sensor2.nuevoDato(24.1f);
        sensor2.nuevoDato(23.2f);
        sensor2.nuevoDato(23.5f);
        sensor2.nuevoDato(24.6f);
        sensor2.nuevoDato(23.8f);
        sensor2.nuevoDato(23.9f);
        sensor2.nuevoDato(24.1f);
        sensor2.nuevoDato(24.3f);
        sensor2.nuevoDato(25.4f);

        //sensor3

        sensor3.nuevoDato(23.4f);
        sensor3.nuevoDato(23.4f);
        sensor3.nuevoDato(23.5f);
        sensor3.nuevoDato(24.1f);
        sensor3.nuevoDato(23.2f);
        sensor3.nuevoDato(-23.5f);
        sensor3.nuevoDato(24.6f);
        sensor3.nuevoDato(-23.8f);
        sensor3.nuevoDato(23.9f);
        sensor3.nuevoDato(24.1f);
        sensor3.nuevoDato(24.3f);
        sensor3.nuevoDato(25.4f);

        //sensor4

        sensor4.nuevoDato(23.4f);
        sensor4.nuevoDato(23.4f);
        sensor4.nuevoDato(23.5f);
        sensor4.nuevoDato(24.1f);
        sensor4.nuevoDato(23.2f);
        sensor4.nuevoDato(-23.5f);
        sensor4.nuevoDato(24.6f);
        sensor4.nuevoDato(-23.8f);
        sensor4.nuevoDato(23.9f);
        sensor4.nuevoDato(24.1f);
        sensor4.nuevoDato(24.3f);
        sensor4.nuevoDato(25.4f);

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

        //mostramos por pantalla



        //APARTADO I


        //APARTADO J

        //mostramos los productos de la empresa con valor superior a 20


        //APARTADO K

        //mostramos por pantalla los valores









    }
}