package B4E1;

import java.util.HashMap;

public interface ICPelicula {

    //TODO:PREGUNTAR SI HAY QUE ELIMINAR DE PELICULA LOS GETTERS Y LOS SETTERS

    /*SETTERS*/
    void setAnho(Integer anho);
    void setDuracion(Integer duracion);
    void setRecaudacion(HashMap<String,Float> recaudacion);

    /*GETTERS*/

    String getNombre();
    float getPresupuesto();
    HashMap<String,Float> getRecaudacion();
    Integer getAnho();
    HashMap<String, HashMap<String, IActor>> getActores();
    IDirector getDirector();
    Integer getDuracion();


}
