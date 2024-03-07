public class PassagemIda_Volta extends Passagem{

    private TrechoVoo ida;
    private TrechoVoo volta;
    private double custoExtraTrecho;

    public PassagemIda_Volta() {}



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
}
