package B4E2;

public class ExcepcionActor extends ExcepcionParticipante{

    private IActor actor;

    public ExcepcionActor(String mensaje, IActor actor){
        super(mensaje , actor);
        setActor(actor);
    }

    public void setActor(IActor actor) {
        this.actor = actor;
    }
    public IActor getActor() {
        return actor;
    }
}
