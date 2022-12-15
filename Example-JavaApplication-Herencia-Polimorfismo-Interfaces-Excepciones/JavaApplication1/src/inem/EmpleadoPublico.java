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
public interface EmpleadoPublico {
    static final int IDPUB= 2;
    double BASE= 600;
    
    default ArrayList<Proyecto> getProyecto(ArrayList<Proyecto> proyectos, String tipo) {
        ArrayList<Proyecto> proyectosTipo= new ArrayList<>();
        for (Proyecto p: proyectos) {
            String tipoProyecto= p.getTipo();
            if (tipoProyecto.startsWith(tipo) && !tipoProyecto.contains("privado")) {
                proyectosTipo.add(p);
            }
        }
        return proyectosTipo;
    }

}
