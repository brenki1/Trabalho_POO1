import java.time.*;

public class Voo {
    private TrechoVoo Trecho;
    private Assento Assentos;
    private LocalDateTime HoraSaida;
    private LocalDateTime HoraChegada;
    private double precoPassagem;


    public Voo(){}

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
        this.HoraSaida = VerificaData.dataHoraCorreta(HoraSaida);
    }

    public LocalDateTime getHoraChegada() {
        return HoraChegada;
    }
    public void setHoraChegada(String HoraChegada){
        this.HoraChegada = VerificaData.dataHoraCorreta(HoraChegada);
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
    //Método que exibe textualmente os dados dos Voos
    public String toString() {
        return "Voo{" +
                "trecho=" + Trecho +
                ", assentos=" + Assentos +
                ", horaSaida=" + HoraSaida +
                ", horaChegada=" + HoraChegada +
                ", precoPassagem=" + precoPassagem +
                '}';
    }
}
