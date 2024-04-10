public class FuncionarioExecutivo extends Funcionario{
    private int qtdParcerias;
    private static double comissaoParceria = 25.00;

    public FuncionarioExecutivo(String nome, String dataNascimento, String CPF, String endereco, String nroCLT, double salario, int qtdParcerias){
        super(nome, dataNascimento, CPF, endereco, nroCLT, salario);
        this.qtdParcerias = qtdParcerias;
    }

    public int getQtdParcerias() {
        return qtdParcerias;
    }

    public void setQtdParcerias(int qtdParcerias) {
        this.qtdParcerias = qtdParcerias;
    }

    public static double getComissaoParceria() {
        return comissaoParceria;
    }

    public double getSalario(){
        return super.getSalario() + (qtdParcerias * comissaoParceria);
    }


}
