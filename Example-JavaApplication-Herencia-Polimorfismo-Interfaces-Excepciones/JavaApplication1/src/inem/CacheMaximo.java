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
public class CacheMaximo extends CacheException {
    
    public CacheMaximo(float max, Empleado e){        
        super("MAX: El cache no puede ser superior a "+max,e);
    }
   
}
