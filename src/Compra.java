import java.time.*;
import java.time.format.DateTimeFormatter;

public class Compra {
    private Cliente comprador; //Cliente
    private TrechoVoo passagem;
    private int qtdPassagem; //Quantidade de passagens
    private int qtdDiarias; //Quantidade de diarias
    private String DataHora; //Acho que não é necessário
    private double valorTotal; //Valor total da compra
    private String Pagamento; //Forma de pagamento
    private int qtdCompras; //Indicando a quantidade de compras
    private int AtualCompra; //Valor de compra que será atualizado no método
    private double PrecoPass; //Preço da passagem

    private double ValorDiaria_Single; //Valor da diaria
    private double ValorDiaria_Duplo;
    private double ValorDiaria_Triplo;

    //Construtuor para os atributos
    public Compra(Cliente comprador, TrechoVoo passagem, int qtdPassagem, int qtdDiarias, double valorTotal, String Pagamento, int qtdCompras, String dataHora, double PrecoPass, double ValorDiaria_Single, double ValorDiaria_Duplo, double ValorDiaria_Triplo){
        this.comprador = comprador;
        this.passagem = passagem;
        this.qtdPassagem = qtdPassagem;
        this.qtdDiarias = qtdDiarias;
        this.valorTotal = valorTotal;
        this.Pagamento = Pagamento;
        this.qtdCompras = qtdCompras;
        this.PrecoPass = PrecoPass;
        this.ValorDiaria_Single = ValorDiaria_Single;
        this.ValorDiaria_Duplo = ValorDiaria_Duplo;
        this.ValorDiaria_Triplo = ValorDiaria_Triplo;
        setDataHora(dataHora);
    }

    //Métodos getters e setters


    public void setComprador(Cliente comprador) {

        this.comprador = comprador;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setPassagem(TrechoVoo passagem) {
        this.passagem = passagem;
    }

    public TrechoVoo getPassagem() {
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

    public void setPrecoPass(double precoPass) {
        PrecoPass = precoPass;
    }

    public double getPrecoPass() {
        return PrecoPass;
    }

    public void setValorDiaria_Single(double valorDiaria_Single) {
        ValorDiaria_Single = valorDiaria_Single;
    }

    public double getValorDiaria_Single() {
        return ValorDiaria_Single;
    }

    public void setValorDiaria_Duplo(double valorDiaria_Duplo) {
        ValorDiaria_Duplo = valorDiaria_Duplo;
    }

    public double getValorDiaria_Duplo() {
        return ValorDiaria_Duplo;
    }

    public void setValorDiaria_Triplo(double valorDiaria_Triplo) {
        ValorDiaria_Triplo = valorDiaria_Triplo;
    }

    public double getValorDiaria_Triplo() {
        return ValorDiaria_Triplo;
    }

    //Método para atualizar o número de compras, Talves seja necessário fazer isso apenas na classe cliente
    public void atualizaCompra(int qtdCompras){
        if(qtdCompras == 0 || qtdCompras > 0){
            AtualCompra = comprador.getCompras(); //Atribuindo à variável o valor de compra
            comprador.setCompras(AtualCompra + 1); //Adcionando 1 ao número de compras
        }
    }

    //Montar o método para calcular o valor total
    public double ValorTotal(int qtdPassagem, int qtdDiarias, int TipoQuarto){
        double TotalPass; //Valor total de passagens;
        double TotalDiar = 0; //Valor total de diarias;

        TotalPass = qtdPassagem * passagem.getPrecoPass;
        if(TipoQuarto == 1) { //Quarto single
            TotalDiar = qtdDiarias * getValorDiaria_Single();
        }else if(TipoQuarto == 2){ //Quarto Duplo
            TotalDiar = qtdDiarias * getValorDiaria_Duplo();
        }else if(TipoQuarto == 3){ //Quarto triplo
            TotalDiar = qtdDiarias * getValorDiaria_Triplo();

        }

        return TotalPass + TotalDiar;  //O valor total é a soma do que foi comprado
    }

    //Método para efetivar a compra de passagens aéreas





}
