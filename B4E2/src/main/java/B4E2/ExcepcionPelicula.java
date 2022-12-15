package B4E2;

public class ExcepcionPelicula extends ExcepcionCine {

    private IPelicula pelicula;

    public ExcepcionPelicula(String mensaje,IPelicula pelicula){
        super(mensaje);
        setPelicula(pelicula);
    }

    public void setPelicula(IPelicula pelicula){
        this.pelicula=pelicula;
    }

    public IPelicula getPelicula() {
        return pelicula;
    }
}
