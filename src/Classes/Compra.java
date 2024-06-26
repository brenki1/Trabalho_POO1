package Classes;



import java.time.format.DateTimeFormatter;

public class Compra {
    private Cliente comprador; //Cliente
    private Voo passagem;
    private Hotel hotel;
    private int qtdPassagem; //Quantidade de passagens
    private int qtdDiarias; //Quantidade de diarias
    private String DataHora; //Acho que não é necessário
    private double valorTotal; //Valor total da compra
    private String Pagamento; //Forma de pagamento
    private int qtdCompras; //Indicando a quantidade de compras

    //Construtuor para os atributos
    public Compra(){}

    public Compra(Cliente comprador, Voo passagem, int qtdPassagem, int qtdDiarias, double valorTotal, String Pagamento, int qtdCompras, String dataHora){
        this.comprador = comprador;
        this.passagem = passagem;
        this.qtdPassagem = qtdPassagem;
        this.qtdDiarias = qtdDiarias;
        this.valorTotal = valorTotal;
        this.Pagamento = Pagamento;
        this.qtdCompras = qtdCompras;
        setDataHora(dataHora);
    }

    //Métodos getters e setters


    public void setComprador(Cliente comprador) {

        this.comprador = comprador;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setPassagem(Voo passagem) {
        this.passagem = passagem;
    }

    public Voo getPassagem() {
        return passagem;
    }

    public void setQtdPassagem(int qtdPassagem) {
        this.qtdPassagem = qtdPassagem;
    }

    public int getQtdPassagem() {
        return qtdPassagem;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public int getQtdDiarias() {
        return qtdDiarias;
    }

    public void setDataHora(String dataHora){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if(VerificaData.verificaDataHora(dataHora)){
            DataHora = dataHora;
        }
        else{
            dataHora = VerificaData.dataAtual();
        }
    }

    public void setPagamento(String pagamento) {
        Pagamento = pagamento;
    }

    public String getPagamento() {
        return Pagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setQtdCompras(int qtdCompras) {
        this.qtdCompras = qtdCompras;
    }

    public int getQtdCompras() {
        return qtdCompras;
    }


    public void atualizaCompra(){
        comprador.addCompra(this);
    }

    //Montar o método para calcular o valor total
    public double ValorTotal(int qtdPassagem, int qtdDiarias, int TipoQuarto){
        double TotalPass; //Valor total de passagens;
        double TotalDiar = 0; //Valor total de diarias;

        TotalPass = qtdPassagem * passagem.getPrecoPassagem();
        if(TipoQuarto == 1) { //Quarto single
            TotalDiar = qtdDiarias * hotel.getValorDiariaSingle();
        }else if(TipoQuarto == 2){ //Quarto Duplo
            TotalDiar = qtdDiarias * hotel.getValorDiariaDuplo();
        }else if(TipoQuarto == 3){ //Quarto triplo
            TotalDiar = qtdDiarias * hotel.getValorDiariaTriplo();

        }

        return TotalPass + TotalDiar;  //O valor total é a soma do que foi comprado
    }

    //Método para efetivar a compra de passagens aéreas

    public void EfetivarPassagem(){
        int Novo; //Variável que atualiza o novo número de passagens
        if(passagem.getAssentos().getQtdDisponivelAssentos() >= qtdPassagem){
            Novo = passagem.getAssentos().getQtdDisponivelAssentos() - qtdPassagem;
            passagem.getAssentos().setQtdDisponivelAssentos(Novo); //Atualizando passagens disponíveis

            this.valorTotal += qtdPassagem * passagem.getPrecoPassagem();
            atualizaCompra();
        }
    }

    //Método para efetivar a compra de Diárias no Hotel
    public void EfetivarDiaria(int qtdDiarias, int TipoQuarto){
        int quartoDisp = 0; //Armazena o número de quartos disponíveis
        double diarias = 0; //Valor da diária
        double Total = 0; //Total das diárias

        if(TipoQuarto == 1){ //Quarto Single
            quartoDisp = hotel.getQuartos_Single();
        }else if(TipoQuarto == 2){
            quartoDisp = hotel.getQuartos_Duplos();
        }else if(TipoQuarto == 3){
            quartoDisp = hotel.getQuartos_Triplos();
        }
        if(quartoDisp >= 1){
            if(TipoQuarto == 1){
                diarias = hotel.getValorDiariaSingle();
            }else if(TipoQuarto == 2){
                diarias = hotel.getValorDiariaDuplo();
            }else if(TipoQuarto == 3){
                diarias = hotel.getValorDiariaTriplo();
            }
            Total = quartoDisp * diarias;

            this.valorTotal += Total; //Atualizando Valor total
            atualizaCompra(); //Atualizando Compras
        }
        //Condição para que o cliente se torne vip
        if (comprador.getCompras().size() >= ClienteVIP.getNroComprasVip() && !(comprador instanceof ClienteVIP)) {
            ClienteVIP clienteVip = new ClienteVIP(comprador.getNome(), comprador.getDataNascimento(), comprador.getCPF(),
                    comprador.getEndereco(), comprador.getDataCad(), comprador.getEmail(),
                    comprador.getCompras(), 10.0, VerificaData.dataAtual());
            // Substitui o cliente atual pelo cliente VIP
            comprador = clienteVip;
        }

    }

    //Método para exibir textualmente os dados das compras
    public String toString() {
        return "Compra{" +
                "comprador=" + comprador +
                ", passagem=" + passagem +
                ", hotel=" + hotel +
                ", qtdPassagem=" + qtdPassagem +
                ", qtdDiarias=" + qtdDiarias +
                ", DataHora='" + DataHora + '\'' +
                ", valorTotal=" + valorTotal +
                ", Pagamento='" + Pagamento + '\'' +
                ", qtdCompras=" + qtdCompras +
                '}';
    }

}
