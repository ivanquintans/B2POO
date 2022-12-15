package B4E2;

public interface IPelicula extends ICPelicula,IAPelicula,ITPelicula {

    /*METODOS POR DEFECTO*/

    /**
     * devuleve el numero de actores que han participado en la pelicula
     * @return contadores
     */
    default int numeroActores(){

        int contador=0;

        for(String tipo  : this.getActores().keySet()){
            contador+=this.getActores().get(tipo).size();
        }

        return contador;

    }

    /**
     * devuelve el coste de los actores que han particcipado en la pelicula
     * @return contador
     */
    default float costeActores(){

        int contador=0;

        for(String tipo  : this.getActores().keySet()){
            for(IActor actor : this.getActores().get(tipo).values()){
                contador+=actor.getCache();
            }
        }

        return contador;

    }





}
