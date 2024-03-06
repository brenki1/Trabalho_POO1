import java.time.*;

public class Voo {
    private TrechoVoo Trecho;
    private LocalDateTime HoraSaida;
    private LocalDateTime HoraChegada;
    private int nroAssentos;
    private double precoPassagem;

    public Voo(TrechoVoo Trecho,int nroAssentos,double precoPassagem){
        setNroAssentos(nroAssentos);
        setPrecoPassagem(precoPassagem);

    }

    public LocalDateTime getHoraSaida() {
        return HoraSaida;
    }
    public void setHoraSaida(String HoraSaida){

    }

    public int getNroAssentos() {
        return nroAssentos;
    }

    public void setNroAssentos(int nroAssentos) {
        this.nroAssentos = nroAssentos;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }
}
