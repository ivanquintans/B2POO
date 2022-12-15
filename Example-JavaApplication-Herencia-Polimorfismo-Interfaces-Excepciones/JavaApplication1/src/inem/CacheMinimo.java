/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inem;

/**
 *
 * @author sepaj
 */
public class CacheMinimo extends CacheException {
    
    public CacheMinimo(int min, Empleado e){        
        super("MIN: El cache no puede ser inferior a "+min,e);
    }
        
}
