package Classes;



import java.time.*;

public class Voo {
    private boolean ehIda;
    private boolean ehIdaVolta;
    private PassagemIda passIda;
    private PassagemIda_Volta passIdaVolta;
    private Assento Assentos;
    private LocalDateTime HoraSaida;
    private LocalDateTime HoraChegada;
    private double precoPassagem;

    public boolean isEhIda() {
        return ehIda;
    }

    public void setEhIda(boolean ehIda) {
        this.ehIda = ehIda;
    }

    public boolean isEhIdaVolta() {
        return ehIdaVolta;
    }

    public void setEhIdaVolta(boolean ehIdaVolta) {
        this.ehIdaVolta = ehIdaVolta;
    }

    public PassagemIda getPassIda() {
        return passIda;
    }

    public void setPassIda(PassagemIda passIda) {
        this.passIda = passIda;
    }

    public PassagemIda_Volta getPassIdaVolta() {
        return passIdaVolta;
    }

    public void setPassIdaVolta(PassagemIda_Volta passIdaVolta) {
        this.passIdaVolta = passIdaVolta;
    }

    public Voo(){}

    public Voo(TrechoVoo Trecho, Assento assentos, String horaSaida, String horaChegada, double precoPassagem){
        setPrecoPassagem(precoPassagem);
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

    @Override
    public String toString() {
        return "Classes.Voo{" +
                "ehIda=" + ehIda +
                ", ehIdaVolta=" + ehIdaVolta +
                ", passIda=" + passIda +
                ", passIdaVolta=" + passIdaVolta +
                ", Assentos=" + Assentos +
                ", HoraSaida=" + HoraSaida +
                ", HoraChegada=" + HoraChegada +
                ", precoPassagem=" + precoPassagem +
                '}';
    }
}



