package Classes;

public class CompanhiaAerea extends Empresa {
    private double PrecoPass; //Preço da passagem
    private double ValorUdi; //Valor a ser pago para o Udi Decola

    public CompanhiaAerea(){}
    //Construtuor para o cadastro da empresa
    public CompanhiaAerea(String cnpj, String nomeOF, String nomeDIV, String dataCriacao, double PrecoPass){
        super(cnpj, nomeOF, nomeDIV, dataCriacao);
        this.PrecoPass = PrecoPass;
    }

    //Métodos get e set
    public void setPrecoPass(double PrecoPass){
        if(PrecoPass > 0 ) {
            this.PrecoPass = PrecoPass;
        }
    }

    public double getPrecoPass(){

        return PrecoPass;
    }
    //Método para calcular o valor fixo a ser pago ao Udi Decola
    public void ValorUdi(int Vendidas){ //'Vendidas' Representa o número de passagens vendidas
        ValorUdi = Vendidas * PrecoPass;

    }

    public void setValorUdi(double valorUdi) {
        ValorUdi = valorUdi;
    }

    public double getValorUdi() { //Retornando o valor a ser pago
        return ValorUdi;
    }
    //Método ToString para representar textualmente os dados da empresa aerea
    public String toString() {
        return "CompanhiaAerea{" + "CNPJ='" + getCNPJ() + '\'' + ", nomeOF='" + getNomeOF() + '\'' + ", nomeDIV='" + getNomeDIV() + '\'' + ", dataCriacao='" + getDataCriacao() + '\'' + ", PrecoPass=" + PrecoPass + ", ValorUdi=" + ValorUdi + '}';
    }
}
