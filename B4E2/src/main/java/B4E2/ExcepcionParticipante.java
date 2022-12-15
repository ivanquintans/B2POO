package B4E2;

public class ExcepcionParticipante extends ExcepcionCine{

    private IParticipante participante;

    public ExcepcionParticipante(String mensaje,IParticipante participante){
        super(mensaje);
        setParticipante(participante);

    }

    public void setParticipante(IParticipante participante){
        this.participante=participante;
    }

    public IParticipante getParticipante() {
        return participante;
    }
}
