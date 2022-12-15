package inem;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Equipo 1", "Santiago", 13000);
        Equipo e2 = new Equipo("Equipo 2", "Vigo", 20000);
        Equipo e3 = new Equipo("Equipo 3", "Pontevedra", 10000);
        Equipo e4 = new Equipo("Equipo 4", "A Coruña", 2000);

        // Inicializamos el HashMap
        HashMap<String, Equipo> equipos = new HashMap<>();

        // Insertamos pares clave<->valor en el HashMap
        equipos.put(e1.getNombre(), e1);
        equipos.put(e2.getNombre(), e2);
        equipos.put(e3.getNombre(), e3);
        equipos.put(e4.getNombre(), e4);

        // Obtenemos un valor a partir de la clave (SI NO EXISTE, ES NULL!!!)
        Equipo e = equipos.get("Equipo 1");
        if(e != null) {
            System.out.println("La ciudad del Equipo 1 es "+e.getCiudad());
        }

        // Recorremos las claves
        System.out.println("Keys en equipos:");
        for(String nombre: equipos.keySet()) {
            System.out.println("  "+nombre);
        }

        // Recorremos los valores
        System.out.println("Values en equipos:");
        for(Equipo equipo: equipos.values()) {
            System.out.println("  "+equipo);
        }
        System.out.println("Tenemos "+equipos.size()+" equipos");

        Equipo e5 = new Equipo("Equipo 5", "Ourense", 13000);
        Equipo e6 = new Equipo("Equipo 6", "Lugo", 13000);

        // Comprobamos si ya existe una entrada para la clave proporcionada
        if(!equipos.containsKey("Equipo 4")){
            equipos.put(e5.getNombre(), e5);
        }

        // Comprobamos si el valor proporcionado ya está en el map
        if(!equipos.containsValue(e5)) {
            equipos.put(e5.getNombre(), e5);
        }
        if(!equipos.containsValue(e6)) {
            equipos.put(e6.getNombre(), e6);
        }

        System.out.println("Tenemos "+equipos.size()+" equipos");

        // Recorremos todos los pares clave<->valor con un iterator
        System.out.println("Pares clave-valor en equipos:");
        Iterator<Map.Entry<String, Equipo>> iterator = equipos.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Equipo> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Recorremos otra vez las claves
        System.out.println("Keys en equipos:");
        for(String nombre: equipos.keySet()) {
            System.out.println("  "+nombre);
        }

        // intentamos calcular el presupuesto del e1
        try {
            ArrayList<Float> ss= new ArrayList<>();
            for (int k=0; k<11; k++) {
                 Float f= new Float(k*250);
                 ss.add(f);
            }
            //e1=null;
            e1.setSueldos(ss);
            System.out.println(e1.calculaPresupuesto());
        } catch (TechoSalarial ts) {
            System.out.println(ts.getMessage());
            //ts.printStackTrace();
        } catch (Exception ex) {
            System.out.println("ex message = "+ex.getMessage());
            ex.printStackTrace();
        }
    }
}