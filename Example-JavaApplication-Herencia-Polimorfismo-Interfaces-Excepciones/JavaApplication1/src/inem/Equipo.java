/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inem;

import java.util.ArrayList;

/**
 *
 * @author sepaj
 */
public class Equipo {
    private String nombre;
    private String ciudad;
    private float techoSalarial;
    private ArrayList<Float> sueldos;
    
    public Equipo(String n, String c, float tSal){        
        this.nombre = n;
        this.ciudad = c;
        this.techoSalarial = tSal;
        this.sueldos= new ArrayList<>();
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String n) {
        if (n!=null)
            this.nombre= n;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }

    public void setCiudad(String c) {
        if (c!=null)
            this.ciudad= c;
    }

    public ArrayList<Float> getSueldos(){
        return this.sueldos;
    }

    public void setSueldos(ArrayList<Float> s) {
        if (s!=null)
            this.sueldos= s;
    }
    
    public boolean checkSueldo() {
        boolean warning= false;
        if (this.sueldos != null) {
            float s= 0;
            for (Float f:this.sueldos) {
                 s= s+f;
            }
            if (s > this.techoSalarial) {
                warning= true;
            }
        } else {
            warning= true;
        }
        return warning;
    }

        public boolean checkSueldoEx() throws Exception {
        boolean warning= false;
        if (this.sueldos != null) {
            float s= 0;
            for (Float f:this.sueldos) {
                 s= s+f;
            }
            if (s > this.techoSalarial) {
                warning= true;
                TechoSalarial ts= new TechoSalarial("La suma de sueldos ("+s+") no puede ser superior al techo salarial ("+this.techoSalarial+") del equipo",this);
                throw ts;
            }
        } else {
            warning= true;
        }
        return warning;
    }

    public float calculaPresupuesto() throws Exception {
        float s= 0;
        //if (!this.checkSueldo()) {
        if (!this.checkSueldoEx()) {
            for (Float f:this.sueldos) {
                 s= s+f;
            }
        }
        return s;
    }
}
