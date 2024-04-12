package Classes;


import java.util.ArrayList;
import java.util.HashMap;

public class Hotel extends Empresa {
    private String endereco;
    private int stars;
    private boolean accPets;
    private int quartos_Single; //Números de quartos single

    private int quartos_Duplos; //Número de quartos duplos

    private int quartos_Triplos; //Número de quartos triplos

    private int DiariasVendidas = 0; //Representa um contador para as diárias vendidas, dessa forma é possível calcular o valor fixo a ser pago ao udi decola
    private double valorDiariaSingle;
    private double valorDiariaDuplo;
    private double valorDiariaTriplo;

    private double desconto; //Valor a ser definido

    private boolean cancelar; //Objeto para cancelar a diária
    private String checkin; //não usar por enqt
    private String checkout; //não usar por enqt
    private String msgDiv;
    private String descricao;
    private double ValorUdi; //Valor fixo a ser pago para o Udi Decola

    private ArrayList<FuncionarioExecutivo> funcionariosParceiros = new ArrayList<>();

    private HashMap<String, HashMap<Integer, Integer>> disponibilidade; //Esse HashMap foi criado para representar a disponibilidade de quartos em uma detrminada data, a primeira String representa uma data, e o HashMap posterior indica um inteiro para representar um tipo de quarto e outro inteiro para representar a quantidade de quartos

    public Hotel() {}
    public Hotel(String cnpj, String nomeOF, String nomeDIV, String dataCriacao, String endereco, int stars, boolean accPets, int quartos_Single, int quartos_Duplos, int quartos_Triplos, double valorDiariaSingle,  double valorDiariaDuplo, double valorDiariaTriplo, double desconto, boolean cancelar, String msgDiv, String descricao, String checkin, String checkout, double valorudi){
        super(cnpj, nomeOF, nomeDIV, dataCriacao);
        this.endereco = endereco;
        this.stars = stars;
        this.accPets = accPets;
        this.quartos_Single =quartos_Single;
        this.quartos_Duplos = quartos_Duplos;
        this.quartos_Triplos = quartos_Triplos;
        this.valorDiariaSingle = valorDiariaSingle;
        this.valorDiariaDuplo = valorDiariaDuplo;
        this.valorDiariaTriplo = valorDiariaTriplo;
        this.desconto = desconto;
        this.msgDiv = msgDiv;
        this.descricao = descricao;
        this.checkin = checkin;
        this.checkout = checkout;
        this.cancelar = cancelar;
        this.ValorUdi = valorudi;
        this.disponibilidade = new HashMap<>(); //Inicializando o HashMap
    }

    public Hotel(String cnpj, String nomeOF, String nomeDIV, String dataCriacao, String endereco, int stars, boolean accPets, int quartos_Single, int quartos_Duplos, int quartos_Triplos){
        super(cnpj, nomeOF, nomeDIV, dataCriacao);
        this.endereco = endereco;
        this.stars = stars;
        this.accPets = accPets;
        this.quartos_Single =quartos_Single;
        this.quartos_Duplos = quartos_Duplos;
        this.quartos_Triplos = quartos_Triplos;

    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public int getStars() {

        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isAccPets() {

        return accPets;
    }

    public void setAccPets(boolean accPets) {

        this.accPets = accPets;
    }

    public void setQuartos_Single(int quartos) {
        this.quartos_Single = quartos;
    }
    public int getQuartos_Single() {

        return quartos_Single;
    }

    public void setQuartos_Duplos(int quartos_Duplos){
        this.quartos_Duplos = quartos_Duplos;
    }

    public int getQuartos_Duplos(){
        return quartos_Duplos;
    }

    public void setQuartos_Triplos(){
        this.quartos_Triplos = quartos_Triplos;
    }

    public int getQuartos_Triplos() {
        return quartos_Triplos;
    }

    public void setValorDiariaSingle(double valorDiariaSingle) {
        this.valorDiariaSingle = valorDiariaSingle;
    }

    public double getValorDiariaSingle() {
        return valorDiariaSingle;
    }

    public void setValorDiariaDuplo(double valorDiariaDuplo) {
        this.valorDiariaDuplo = valorDiariaDuplo;
    }

    public double getValorDiariaDuplo() {
        return valorDiariaDuplo;
    }

    public void setValorDiariaTriplo(double valorDiariaTriplo) {
        this.valorDiariaTriplo = valorDiariaTriplo;
    }

    public double getValorDiariaTriplo() {
        return valorDiariaTriplo;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {

        this.checkin = checkin;
    }

    public String getCheckout() {

        return checkout;
    }

    public void setCheckout(String checkout) {

        this.checkout = checkout;
    }

    public String getMsgDiv() { //

        return msgDiv;
    }

    public void setMsgDiv(String msgDiv) {
        this.msgDiv = msgDiv;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public void setQuartos_Triplos(int quartos_Triplos) {
        this.quartos_Triplos = quartos_Triplos;
    }

    public double getValorUdi() {
        return ValorUdi;
    }

    public void setValorUdi(double valorUdi) {
        ValorUdi = valorUdi;
    }

    public double aplicaDesconto (double valorDiaria, double desconto) {
        return valorDiaria - (valorDiaria*desconto);
    }

    public ArrayList<FuncionarioExecutivo> getFuncionariosParceiros() {
        return funcionariosParceiros;
    }

    public void setFuncionariosParceiros(ArrayList<FuncionarioExecutivo> funcionariosParceiros) {
        this.funcionariosParceiros = funcionariosParceiros;
    }

    //Método para calcular o valor a ser pago para o Udi_Decola
    public double venda_diária(int tipoQuarto, int qtdDiarias){ //'TipoQuarto' irá representar qual quarto foi escolhido
        if(tipoQuarto == 1){ //Se o quarto for single
            if(quartos_Single > 0){
                quartos_Single --; //Decrementando a quantidade de quartos
                DiariasVendidas+= qtdDiarias; //Incrementando o contador de diária
            }else if(tipoQuarto == 2){ //Quarto Duplo
                if(quartos_Duplos > 0){
                    quartos_Duplos--;
                    DiariasVendidas+= qtdDiarias;
                }else if(tipoQuarto == 3){ //Quarto Triplo
                    if(quartos_Triplos > 0){
                        quartos_Triplos--;
                        DiariasVendidas+= qtdDiarias;
                    }
                }

            }
          }
        return 0;
    }
    //Método que calcula o valor para Udi
    public double ValorParaUdi(){
        return ValorUdi * DiariasVendidas; //Retornando o valor
    }

    //Método para atualizar a quantidade de quartos por datas
    public void atualizarQuartos(String data, int tipo, int qtd ){ // 'tipo' Representa o tipo de quarto, 'qtd' representa a quantidade de quartos
        HashMap<Integer, Integer>disp = disponibilidade.getOrDefault(data, new HashMap<>());
        disp.put(tipo, qtd); //Atualizando a quantidade de quartos para o tipo de quarto espescificado
        disponibilidade.put(data, disp); //Atualizando o mapa com as novas disponibilidades de quartos
    }

    public HashMap<Integer, Integer> getdisponibilidade(String data){ //Retorna a quantidade de quartos em uma determinada data
        return disponibilidade.getOrDefault(data, new HashMap<>());
    }

    //Método para representar textualmente os dados do Hotel
    public String toString() {
        return "Hotel{" +
                "endereco='" + endereco + '\'' +
                ", stars=" + stars +
                ", accPets=" + accPets +
                ", quartos_Single=" + quartos_Single +
                ", quartos_Duplos=" + quartos_Duplos +
                ", quartos_Triplos=" + quartos_Triplos +
                ", DiariasVendidas=" + DiariasVendidas +
                ", valorDiariaSingle=" + valorDiariaSingle +
                ", valorDiariaDuplo=" + valorDiariaDuplo +
                ", valorDiariaTriplo=" + valorDiariaTriplo +
                ", desconto=" + desconto +
                ", cancelar=" + cancelar +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                ", msgDiv='" + msgDiv + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ValorUdi=" + ValorUdi +
                '}';
    }

    }





