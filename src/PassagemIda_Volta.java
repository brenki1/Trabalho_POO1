public class PassagemIda_Volta extends Passagem{

    private TrechoVoo ida;
    private TrechoVoo volta;
    private double custoExtraTrecho;

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
            case 1: return super.calcPrecoPass(Preco, Tx, classe) + custoExtraTrecho; //suponha que 1 significa classe executiva e que a taxa da mesma é 250
            case 2: return super.calcPrecoPass(Preco, Tx, 2) + custoExtraTrecho; //suponha que 2 seja a economica, ou seja, não há taxa extra
            case 3: return super.calcPrecoPass(Preco, Tx, classe) + custoExtraTrecho;
        }

        return 0;
    }
}
