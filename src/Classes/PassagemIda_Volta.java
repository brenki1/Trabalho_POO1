package Classes;



public class PassagemIda_Volta extends Passagem {

    private TrechoVoo ida;
    private TrechoVoo volta;
    private double custoExtraTrecho;

    public PassagemIda_Volta() {}

    public PassagemIda_Volta(double preco, double txemb, int tipo, TrechoVoo ida, TrechoVoo volta, double custoExtraTrecho){
        super(preco,txemb,tipo);
        this.ida = ida;
        this.volta = volta;
        this.custoExtraTrecho = custoExtraTrecho;
    }

    public TrechoVoo getIda() {
        return ida;
    }

    public void setIda(TrechoVoo ida) {
        this.ida = ida;
    }

    public TrechoVoo getVolta() {
        return volta;
    }

    public void setVolta(TrechoVoo volta) {
        this.volta = volta;
    }

    public double getCustoExtraTrecho() {
        return custoExtraTrecho;
    }

    public void setCustoExtraTrecho(double custoExtraTrecho) {
        this.custoExtraTrecho = custoExtraTrecho;
    }

    public double calcPrecoPass(double Preco, double Tx, int classe, double custoExtraTrecho) {

        switch(classe) {
            case 1, 3: return super.calcPrecoPass(Preco, Tx, classe) + custoExtraTrecho;
            case 2: return super.calcPrecoPass(Preco, Tx, 2) + custoExtraTrecho;
        }

        return 0;
    }
    //Método que apresenta os dados da classe Passagem de volta
    public String toString() {
        return "PassagemIda_Volta{" +
                "ida=" + ida +
                ", volta=" + volta +
                ", custoExtraTrecho=" + custoExtraTrecho +
                ", Preco=" + getPreco() +
                ", taxaEmbarque=" + getTaxaEmbarque() +
                ", tipoPass=" + getTipoPass() +
                '}';
    }



}
