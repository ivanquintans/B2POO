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
public class CacheException extends Exception {
    private Empleado empleado;
    
    public CacheException(String mensaje, Empleado e){        
        super(mensaje);
        this.empleado= e;
    }
    
    public Empleado getEmpleado(){
        return this.empleado;
    }

    public void setEmpleado(Empleado e) {
        this.empleado= e;
    }
    
}
