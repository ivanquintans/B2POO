package B4E2;

public class ExcepcionDirector extends ExcepcionParticipante{

    private IDirector director;

    public ExcepcionDirector(String mensaje, IDirector director){
        super(mensaje, director);
        setDirector(director);
    }

    public void setDirector(IDirector director) {
        this.director = director;
    }

    public IDirector getDirector() {
        return director;
    }
}
