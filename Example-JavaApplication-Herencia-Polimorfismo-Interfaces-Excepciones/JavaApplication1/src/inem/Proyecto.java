/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inem;

import java.util.HashMap;
/**
 *
 * @author sepaj
 */
public class Proyecto {
    String id;
    String tipo;
    float coste;
    HashMap<String,EmpleadoImpl> empleados;
    
    public Proyecto(String i, String t) {
        this.id= i;
        this.tipo= t;
        this.coste= 0;
        this.empleados= new HashMap<>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String i) {
        this.id= i;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo= t;
    }

    public float getCoste() {
        return this.coste;
    }

    public void setCoste(float f) {
        this.coste= f;
    }

    public HashMap getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(HashMap e) {
        this.empleados= e;
    }

    public void introducirEmpleado(EmpleadoImpl e) {
        this.empleados.put(e.getName(), e);
    }
    
    public void calculaCoste() {
        if ( (this.empleados!=null) && (this.empleados.size() > 0) ) {
          if (this.coste != 0) {
              this.coste=0;
          }
          for(EmpleadoImpl e:this.empleados.values()) {
              this.coste= this.coste + e.getCache();
          }
        }
    }
    
    @Override
    public Object clone() {
        /*try {
            super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }*/
        Proyecto p= new Proyecto(this.id, this.tipo);
        for (EmpleadoImpl e:this.empleados.values()) {
             p.introducirEmpleado((EmpleadoImpl)e.clone());
        }
        p.calculaCoste();
        return p;
    }
    
    @Override
    public String toString() {
        return "Proyecto de tipo "+this.tipo+" (coste="+this.coste+" eur)";
    }

}
