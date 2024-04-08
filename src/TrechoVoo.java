public class TrechoVoo {
    public double getPrecoPass;
    private String codigo; //Código identificador 3 dígitos
    private String origem; //Local de origem
    private String destino;
    private String HoraSaida;
    private String HoraChegada;

    private int VagasDisponíveis;
    private CompanhiaAerea Nome; //Nome da companhia aerea acossiada ao trecho

    //Construtor para os dados
    public TrechoVoo(){}

    public TrechoVoo(String codigo, String origem, String destino, String HoraSaida, String HoraChegada, int VagasDisponíveis ){
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.HoraSaida = HoraSaida;
        this.HoraChegada = HoraChegada;
        this.VagasDisponíveis = VagasDisponíveis;

    }

    //Métodos getters e setters
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setHoraChegada(String horaChegada) {
        HoraChegada = horaChegada;
    }

    public String getHoraChegada() {
        return HoraChegada;
    }

    public void setHoraSaida(String horaSaida) {
        HoraSaida = horaSaida;
    }

    public String getHoraSaida() {
        return HoraSaida;
    }

    public void setVagasDisponíveis(int vagasDisponíveis) {
        VagasDisponíveis = vagasDisponíveis;
    }

    public int getVagasDisponíveis() {
        return VagasDisponíveis;
    }

    //Importante implementar os voos de cada trecho, representar o local de saída e chegada, saber a data e hora de chegada, Saber o nro de vagas disponíveis e preço da passagem(Que pode ser diferente para cada voo)

    //Método que exibe textualmente os dados do trchoVoo
    public String toString() {
        return "TrechoVoo{" +
                "codigo='" + codigo + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", HoraSaida='" + HoraSaida + '\'' +
                ", HoraChegada='" + HoraChegada + '\'' +
                ", VagasDisponíveis=" + VagasDisponíveis +
                ", Nome=" + Nome +
                '}';
    }
}
