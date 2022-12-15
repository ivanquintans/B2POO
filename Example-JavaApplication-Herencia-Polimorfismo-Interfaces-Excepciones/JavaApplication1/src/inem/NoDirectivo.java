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
public class NoDirectivo extends EmpleadoImpl {
    public NoDirectivo(String n, String t, int a, float c) {
        super(n,t,a,c);
        System.out.println("Creado NoDirectivo"+n);
    }
    
    @Override
    public double sueldo() {
       double aplus= (super.getAge() > 50) ? 1 : super.getAge()/65; 
       return super.sueldo()+100*aplus;
    }

}
