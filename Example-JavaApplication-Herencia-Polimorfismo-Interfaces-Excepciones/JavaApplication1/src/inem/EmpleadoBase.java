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
public interface EmpleadoBase {
    public static final int IDBASE= 1;
    double BASE= 500;
    
    default ArrayList<Proyecto> getProyecto(ArrayList<Proyecto> proyectos, String tipo) {
        ArrayList<Proyecto> proyectosTipo= new ArrayList<>();
        for (Proyecto p: proyectos) {
            String tipoProyecto= p.getTipo();
            if (tipoProyecto.startsWith(tipo) && !tipoProyecto.equals("IA")) {
                proyectosTipo.add(p);
            }
        }
        return proyectosTipo;
    }
}
