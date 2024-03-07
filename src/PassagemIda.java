public class PassagemIda extends Passagem {

    private TrechoVoo ida;
    private double custoExtraTrecho;

    public PassagemIda(){}
    public PassagemIda(Double preco, double txemb, int tipo, TrechoVoo ida, double custoExtra) {
        super(preco, txemb, tipo);
        this.ida = ida;
        custoExtraTrecho = custoExtra;
    }

    public TrechoVoo getIda() {
        return ida;
    }

    public void setIda(TrechoVoo ida) {
        this.ida = ida;
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
}
