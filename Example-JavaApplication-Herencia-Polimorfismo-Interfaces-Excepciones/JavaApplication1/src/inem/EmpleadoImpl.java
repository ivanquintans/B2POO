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
public class EmpleadoImpl implements Empleado {
    private String name;
    private String tipo;
    private int age;
    private float cache;
    private HashMap<String,Proyecto> proyectos;
    
    public EmpleadoImpl(String n, String t, int a, float c) {
        this.name= n;
        this.tipo= t;
        this.age= a;
        this.cache= c;
        this.proyectos= new HashMap<>();
        System.out.println("Creado EmpleadoImpl");
    }
    
    public void setName(String n) {
        this.name= n;
    }
    
    public String getName() {
        return this.name;
    }

    public void setTipo(String t) {
        this.tipo= t;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public void setAge(int a) {
        this.age= a;
    }
    
    public int getAge() {
        return this.age;
    }

    //public void setCache(float c) throws Exception {
    //public void setCache(float c) throws CacheMinimo, CacheMaximo {
    public void setCache(float c) throws CacheException {
        if (c < 50) {
            // lanzar excepcion de CacheMinimo
            CacheException cm= new CacheException("El cache no puede ser inferior a 50",this);
            //CacheMinimo cm= new CacheMinimo(50,this);
            throw cm;

        } else if (c > 50000) {
            // lanzar excepcion de CacheMaximo
            throw new CacheException("El cache no puede ser superior a 50000",this);
            //throw new CacheMaximo(50000,this);
            
        } else {
            this.cache= c;
        }
    }
    
    public float getCache() {
        return this.cache;
    }

    public void setProyectos(HashMap p) {
        if (p!=null)
            this.proyectos= p;
    }
    
    public HashMap getProyectos() {
        return this.proyectos;
    }
    
    public void introducirProyecto(Proyecto p) {
        if (p!=null) {
            this.proyectos.put(p.getId(),p);
        }
    }

    public void introducirProyectoClone(Proyecto p) {
        if (p!=null) {
            Proyecto paux= (Proyecto)p.clone();
            this.proyectos.put(p.getId(),paux);
        }
    }

    @Override
    public double sueldo() {
        if (this.tipo.equals("base"))
            return Empleado.super.getBase(1);
        else if (this.tipo.equals("publico"))
            return Empleado.super.getBase(2);
        else if (this.tipo.equals("privado"))
            return Empleado.super.getBase(3);
        else
            return -1;
    }
    
    @Override
    public Object clone() {
        /*try {
            super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }*/
        EmpleadoImpl e= new EmpleadoImpl(this.name, this.tipo, this.age, this.cache);
        for (Proyecto p:this.proyectos.values()) {
             e.introducirProyecto((Proyecto)p.clone());
        }
        return e;
    }

}
