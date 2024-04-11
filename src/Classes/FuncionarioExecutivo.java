package Classes;



import java.util.ArrayList;

public class FuncionarioExecutivo extends Funcionario {

    private static double comissaoParceria = 25.00;

    private ArrayList<Hotel> hoteisParceiros = new ArrayList<>();

    public FuncionarioExecutivo(String nome, String dataNascimento, String CPF, String endereco, String nroCLT, double salario, ArrayList<Hotel> hoteisParceiros){
        super(nome, dataNascimento, CPF, endereco, nroCLT, salario);
        this.hoteisParceiros = hoteisParceiros;
    }

    public int getQtdParcerias() {
        return  hoteisParceiros.size();
    }


    public static double getComissaoParceria() {
        return comissaoParceria;
    }

    public double getSalario(){
        return super.getSalario() + (hoteisParceiros.size() * comissaoParceria);
    }


    public ArrayList<Hotel> getHoteisParceiros() {
        return hoteisParceiros;
    }

    public void setHoteisParceiros(ArrayList<Hotel> hoteisParceiros) {
        this.hoteisParceiros = hoteisParceiros;
    }

    //Método ToString para representar textualmente os dados do Funcionário Executivo
    public String toString() {
        return "Funcionario{" + "nome='" + getNome() + '\'' + ", CPF='" + getCPF() + '\'' + ", dataNascimento='" + getDataNascimento() + '\'' + ", endereco='" + getEndereco() + '\'' + ", nroCLT='" + getNroCLT() + '\'' + ", salario=" + getSalario() + '}';
    }
}
