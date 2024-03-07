import java.time.*;
public class Compra {
    private Cliente comprador; //Cliente
    private TrechoVoo passagem;
    private int qtdPassagem; //Quantidade de passagens
    private int qtdDiarias; //Quantidade de diarias
    private String Data; //Acho que não é necessário
    private int Ano;
    private int Mes;
    private int Dia;
    private String hora;
    private double valorTotal; //Valor total da compra
    private String Pagamento; //Forma de pagamento

    //Construtuor para os atributos
    public Compra(Cliente comprador, TrechoVoo passagem, int qtdPassagem, int qtdDiarias, int Ano, int Mes, int dia, String hora, double valorTotal, String Pagamento){
        this.comprador = comprador;
        this.passagem = passagem;
        this.qtdPassagem = qtdPassagem;
        this.qtdDiarias = qtdDiarias;
        this.Ano = Ano;
        this.Mes = Mes;
        this.Dia = Dia;
        this.hora = hora;
        this.valorTotal = valorTotal;
        this.Pagamento = Pagamento;
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

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getAno() {
        return Ano;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getMes() {
        return Mes;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getDia() {
        return Dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
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
    //Montar o método para calcular o valor total
    //Para verificar a data
}
