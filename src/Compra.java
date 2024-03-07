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
    private int qtdCompras; //Indicando a quantidade de compras
    private int AtualCompra; //Valor de compra que será atualizado no método
    //Construtuor para os atributos
    public Compra(Cliente comprador, TrechoVoo passagem, int qtdPassagem, int qtdDiarias, int Ano, int Mes, int dia, String hora, double valorTotal, String Pagamento, int qtdCompras){
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
        this.qtdCompras = qtdCompras;
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
