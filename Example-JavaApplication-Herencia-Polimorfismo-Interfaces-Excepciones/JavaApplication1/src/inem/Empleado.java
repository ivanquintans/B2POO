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
public interface Empleado extends EmpleadoBase, EmpleadoPublico, EmpleadoPrivado {
    //static final int ID= 0;
    int ID= 0;

    //public abstract double sueldo();
    public double sueldo();
 
    @Override
    default ArrayList<Proyecto> getProyecto(ArrayList<Proyecto> proyectos, String tipo) {
           return EmpleadoBase.super.getProyecto(proyectos, tipo);
    }
    default ArrayList<Proyecto> getProyectoPublico(ArrayList<Proyecto> proyectos, String tipo) {
           return EmpleadoPublico.super.getProyecto(proyectos, tipo);
    }
    default ArrayList<Proyecto> getProyectoPrivado(ArrayList<Proyecto> proyectos, String tipo) {
           return EmpleadoPrivado.super.getProyecto(proyectos, tipo);
    }

    default double getBase(int id) {
        switch(id) {
            case 1: return EmpleadoBase.BASE;
            case 2: return EmpleadoPublico.BASE;
            case 3: return EmpleadoPrivado.BASE;
            default: return 0;
        }
    }

}
