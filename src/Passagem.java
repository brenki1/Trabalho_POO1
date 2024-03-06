public class Passagem {

    private double Preco;
    private double taxaEmbarque;
    private int tipoPass; // seria a classe (executiva, economica, etc)

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
            case 1: return Preco + Tx + 250; //suponha que 1 significa classe executiva e que a taxa da mesma é 250
            case 2: return Preco + Tx; //suponha que 2 seja a economica, ou seja, não há taxa extra
            case 3: return Preco + Tx + 500;
        }

        return 0;
    }

}
