package B4E2;

public interface ITPelicula {

    /*Metodos*/

    /**
     * es final para que no sea sobrescrito en las clases, en la interfaz no la podemos poner como final
     * @return la recaudacion total
     */
    float recaudacionTotal();

    /**
     * cambio de tipo de la funcion y el atributo pasa a ser protected en vez de private(profesora)
     * @return el valor del presupuesto
     */
    float presupuesto();

    /**
     * comprueba que sea exito la pelicula o no
     * @return true si la recaudacion es tres veces mayor que el presupuesto
     */
    boolean exito();

}
