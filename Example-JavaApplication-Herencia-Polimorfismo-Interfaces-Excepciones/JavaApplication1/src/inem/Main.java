/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inem;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author sepaj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directivo dj= new Directivo("Juan","privado",40,1000);
        try {
            //Directivo dj= new Directivo("Juan","privado",40,1000);
            Directivo da= new Directivo("Ana","privado",55,1000);
            Directivo dm= new Directivo("Maria","publico",40,1000);
            Directivo dp= new Directivo("Pedro","publico",55,1000);
            NoDirectivo ndj= new NoDirectivo("Juan","publico",40,500);
            NoDirectivo nda= new NoDirectivo("Ana","publico",55,500);
            NoDirectivo ndm= new NoDirectivo("Maria","privado",40,500);
            NoDirectivo ndp= new NoDirectivo("Pedro","privado",55,500);
            HashMap<String,Empleado> empleados= new HashMap<>();
            empleados.put(dj.getName()+"-"+dj.getTipo(),dj);
            empleados.put(da.getName()+"-"+da.getTipo(),da);
            empleados.put(dm.getName()+"-"+dm.getTipo(),dm);
            empleados.put(dp.getName()+"-"+dp.getTipo(),dp);
            empleados.put(ndj.getName()+"-"+ndj.getTipo(),ndj);
            empleados.put(nda.getName()+"-"+nda.getTipo(),nda);
            empleados.put(ndm.getName()+"-"+ndm.getTipo(),ndm);
            empleados.put(ndp.getName()+"-"+ndp.getTipo(),ndp);
            Collection cc= empleados.values();
            Iterator it= cc.iterator();
            while (it.hasNext()) {
               Object obj= it.next();
               if (obj instanceof Directivo) {
                   System.out.println(((Directivo)obj).getName()+" es Directivo ("+((Directivo)obj).getTipo()+")");
                   //System.out.println(((NoDirectivo)obj).getName()+" es Directivo ("+((Directivo)obj).getTipo()+")");
                   System.out.println("   El sueldo de "+((Directivo)obj).getName()+" es "+((Directivo)obj).sueldo());
               } else if (obj instanceof NoDirectivo) {
                   //System.out.println(((Directivo)obj).getName()+" es Directivo ("+((Directivo)obj).getTipo()+")");
                   System.out.println(((NoDirectivo)obj).getName()+" no es Directivo ("+((NoDirectivo)obj).getTipo()+")");
                   System.out.println("   El sueldo de "+((NoDirectivo)obj).getName()+" es "+((NoDirectivo)obj).sueldo());
               }
               System.out.println("  >> "+obj.getClass().getName());
            }
            ArrayList<Proyecto> pp= new ArrayList<>();
            Proyecto p1= new Proyecto("P1","ENG-publico");
            p1.introducirEmpleado(dj);
            p1.introducirEmpleado(ndj);
            p1.calculaCoste();
            pp.add(p1);
            Proyecto p2= new Proyecto("P2","ENG-privado");
            p2.introducirEmpleado(dj);
            p2.introducirEmpleado(ndj);
            p2.calculaCoste();
            pp.add(p2);
            pp.add(new Proyecto("P3","IA"));
            pp.add(new Proyecto("P4","IA-publico"));
            pp.add(new Proyecto("P5","IA-privado"));
            ArrayList<Proyecto> pj = dj.getProyecto(pp, "ENG");
            System.out.println("Los proyectos de "+dj.getName()+" de tipo ENG son:");
            for (Proyecto paux: pj) {
                 System.out.print("   ");
                 System.out.println(paux);
            }
            ArrayList<Proyecto> pjp = dj.getProyectoPublico(pp, "ENG");
            System.out.println("Los proyectos públicos de "+dj.getName()+" de tipo ENG son:");
            for (Proyecto paux: pjp) {
                 System.out.print("   ");
                 System.out.println(paux);
            }
            ArrayList<Proyecto> pjpp = dj.getProyectoPrivado(pp, "ENG");
            System.out.println("Los proyectos privados de "+dj.getName()+" de tipo ENG son:");
            for (Proyecto paux: pjpp) {
                 System.out.print("   ");
                 System.out.println(paux);
            }
            ArrayList<Proyecto> pa = nda.getProyecto(pp, "IA");
            System.out.println("Los proyectos de "+nda.getName()+" de tipo IA son:");
            for (Proyecto paux: pa) {
                 System.out.print("   ");
                 System.out.println(paux);
            }
            int j=1;
            System.out.println("Coste Proyectos 1:");
            for (Proyecto pi:pp) {
               dj.setCache(j*200);
               pi.introducirEmpleado(dj);
               ndj.setCache(j*100);
               pi.introducirEmpleado(ndj);
               pi.calculaCoste();
               dj.introducirProyecto(pi);
               System.out.println("   "+pi);
               j++;
            }
            System.out.println("Coste Proyectos 2 (aliasing):");
            Collection cp= dj.getProyectos().values();
            it= cp.iterator();
            while (it.hasNext()) {
               Proyecto p= (Proyecto)it.next();
               p.calculaCoste();
               System.out.println("   "+p);
            }
            System.out.println("Coste Proyectos 3:");
            cp= dj.getProyectos().values();
            it= cp.iterator();
            while (it.hasNext()) {
               Proyecto p= (Proyecto)it.next();
               ((EmpleadoImpl)p.getEmpleados().get(dj.getName())).setCache(2000);
               p.calculaCoste();
               System.out.println("   "+p);
            }
            j=1;
            System.out.println("Coste Proyectos 4:");
            for (Proyecto pi:pp) {
               dj.setCache(j*2000);
               pi.introducirEmpleado(dj);
               ndj.setCache(j*1000);
               pi.introducirEmpleado(ndj);
               pi.calculaCoste();
               dj.introducirProyectoClone(pi);
               System.out.println("   "+pi);
               j++;
            }
            System.out.println("Coste Proyectos 5 (no aliasing):");
            cp= dj.getProyectos().values();
            it= cp.iterator();
            while (it.hasNext()) {
               Proyecto p= (Proyecto)it.next();
               p.calculaCoste();
               System.out.println("   "+p);
            }
            System.out.println("Intentamos cambiar el cache de "+dj.getName());
            //dj.setCache(10);
            dj.setCache(100);
            System.out.println("El nuevo cache de "+dj.getName()+" es "+dj.getCache());
            System.out.println("Volvemos a intentar cambiar el cache de "+dj.getName());
            //dj.setCache(100000);
            dj.setCache(30000);
            System.out.println("El nuevo cache de "+dj.getName()+" es "+dj.getCache());
        /*} catch (CacheMinimo | CacheMaximo cm) {
            // ejemplo de multi-catch
            System.out.println(cm.getMessage());*/
        } catch (CacheException cm) {
            // ejemplo de jerarquia de herencia entre excepciones
            System.out.println(cm.getMessage());
        /*} catch (CacheMinimo cmin) {
            System.out.println(cmin.getMessage());
        } catch (CacheMaximo cmax) {
            System.out.println(cmax.getMessage());*/
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println(">>> Este bloque se ejecuta siempre, haya o no una excepcion del tipo que sea");
        }
        // a partir de aqui el programa continua despues del tratamiento de la excepcion
        System.out.println("DJ (sueldo) -> "+ dj.sueldo());
        System.out.println("DJ (cache) -> "+ dj.getCache());
        System.out.println("FIN");
        
    }
    
}
