import java.time.*;

public class Voo {
    private TrechoVoo Trecho;
    private Assento Assentos;
    private LocalDateTime HoraSaida;
    private LocalDateTime HoraChegada;
    private double precoPassagem;
    private VerificaData v = new VerificaData();

    public Voo(TrechoVoo Trecho,Assento assentos, String horaSaida, String horaChegada, double precoPassagem){
        setPrecoPassagem(precoPassagem);
        setTrecho(Trecho);
        setAssentos(assentos);
        setHoraSaida(horaSaida);
        setHoraChegada(horaChegada);
    }

    public LocalDateTime getHoraSaida() {
        return HoraSaida;
    }
    public void setHoraSaida(String HoraSaida){
        this.HoraSaida = v.dataHoraCorreta(HoraSaida);
    }

    public LocalDateTime getHoraChegada() {
        return HoraChegada;
    }
    public void setHoraChegada(String HoraChegada){
        this.HoraChegada = v.dataHoraCorreta(HoraChegada);
    }

    public TrechoVoo getTrecho() {
        return Trecho;
    }

    public void setTrecho(TrechoVoo trecho) {
        Trecho = trecho;
    }

    public Assento getAssentos() {
        return Assentos;
    }

    public void setAssentos(Assento assentos) {
        Assentos = assentos;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }
}
