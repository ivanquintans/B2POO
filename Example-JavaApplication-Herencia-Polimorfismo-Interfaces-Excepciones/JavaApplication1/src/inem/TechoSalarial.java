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
public class TechoSalarial extends Exception {
    private Equipo equipo;
    
    public TechoSalarial(String message, Equipo e){        
        super(message);
        this.equipo= e;
    }
    
    public Equipo getEquipo(){
        return this.equipo;
    }

    public void setEquipo(Equipo e) {
        if (e!=null)
            this.equipo= e;
    }
    
}
