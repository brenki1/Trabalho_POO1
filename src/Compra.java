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
    //Construtuor para os atributos
    public Compra(Cliente comprador, TrechoVoo passagem, int qtdPassagem, int qtdDiarias, double valorTotal, String Pagamento, int qtdCompras, String dataHora){
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
        VerificaData v = new VerificaData();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if(v.verificaDataHora(dataHora)){
            DataHora = dataHora;
        }
        else{
            LocalDateTime agora = LocalDateTime.now();
            String agoraFormat = agora.format(formatador);
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

    //Método para atualizar o número de compras, Talves seja necessário fazer isso apenas na classe cliente
    public void atualizaCompra(int qtdCompras){
        if(qtdCompras == 0 || qtdCompras > 0){
            AtualCompra = comprador.getCompras(); //Atribuindo à variável o valor de compra
            comprador.setCompras(AtualCompra + 1); //Adcionando 1 ao número de compras
        }
    }


    //Montar o método para calcular o valor total
    //Para verificar a data
}
