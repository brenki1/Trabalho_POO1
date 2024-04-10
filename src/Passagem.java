public abstract class Passagem {

    private double Preco;
    private double taxaEmbarque;
    private int tipoPass; // 1 = classe economica, 2 = classe executiva, 3 = Primeira classe (premium)

    public Passagem (){}
    public Passagem (Double preco, double txemb, int tipo){
        Preco = preco;
        taxaEmbarque = txemb;
        tipoPass = tipo;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

    public int getTipoPass() {
        return tipoPass;
    }

    public void setTipoPass(int tipoPass) {
        this.tipoPass = tipoPass;
    }

    public double calcPrecoPass(double Preco, double Tx, int classe){

        switch(classe) {
            case 1: return Preco + Tx;
            case 2: return Preco + Tx + 250;
            case 3: return Preco + Tx + 500;
        }

        return 0;
    }
    //Método que exibe textualmente os dados da Passagem
    public String toString() {
        return "Passagem{" +
                "Preco=" + Preco +
                ", taxaEmbarque=" + taxaEmbarque +
                ", tipoPass=" + tipoPass +
                '}';
    }

}
