package B2E1;

public class PrincipalB2E1 {
    public static void main(String[] args) {

        //Apartado A
        //crear los sensores1,2,3 con los valores del fichero excel

        Sensor sensor1 = new Sensor("100","temperatura",new float[]{-5,34f},54.5f);
        Sensor sensor2 = new Sensor("101","temperatura",new float[]{-5,40f},48.5f);
        Sensor sensor3 = new Sensor("200","sonido",new float[]{0,120f},30.5f);
        Sensor sensor4 = new Sensor("201","sonido",new float[]{0,110f},28.3f);

        //sensor 1 //añadimos valores

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


        System.out.println("APARTADO A:\n");

        //APARTADO B
        //mostramos por pantalla limites superiores y inferiores

        System.out.println("Sensor 1:" + sensor1.limiteInferior() + "\"" + sensor1.limiteSuperior());
        System.out.println("Sensor 2:" + sensor1.limiteInferior() + "\"" + sensor1.limiteSuperior());
        System.out.println("Sensor 3:" + sensor1.limiteInferior() + "\"" + sensor1.limiteSuperior());
        System.out.println("Sensor 4:" + sensor1.limiteInferior() + "\"" + sensor1.limiteSuperior());



        //APARTADO C
        //crear una estancia


        //APARTADO D

        //mostramos por pantalla



        //APARTADO E

        //escribimos la empresa creada en b en el atributo mensajeria de los paquetes creados en a



        //APARTADO F

        //creamos un paquete asignandole una id



        //APARTADO G

        //introducimos el paquete creado en f en el conjunto de paquetes enviados por la empresa



        //APARTADO H

        //mostramos por pantalla



        //APARTADO I


        //APARTADO J

        //mostramos los productos de la empresa con valor superior a 20


        //APARTADO K

        //mostramos por pantalla los valores









    }
}