package B2E3;

import java.util.HashMap;

public class Planta {

    private int numero;

    private String tipo;

    private Edificio edificio;

    private HashMap<String,Estancia> estancias;

    private float presupuesto;

    private HashMap<String,Estancia> sensoresConProblemas;


    /*Constructores*/

    public Planta(int numero,String tipo, Edificio edificio, HashMap<String,Estancia> estancias){




    }

    public Planta(int numero,String tipo){

    }

    /*Setters*/






    /*Getters*/

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public HashMap<String, Estancia> getEstancias() {
        return estancias;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public HashMap<String, Estancia> getSensoresConProblemas() {
        return sensoresConProblemas;
    }
}
