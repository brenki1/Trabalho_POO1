package Classes;

public class Funcionario extends Pessoa {
    private String nroCLT;
    private double salario;


    public Funcionario(){}
    public Funcionario (String nome, String dataNascimento, String CPF, String endereco, String nroCLT, double salario) {
        super(nome, dataNascimento, CPF, endereco);
        this.nroCLT = nroCLT;
        this.salario = salario;
    }

    public String getNroCLT() {
        return nroCLT;
    }

    public void setNroCLT(String nroCLT) {
        this.nroCLT = nroCLT;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }




    //Método ToString para representar textualmente os dados do Funcionário
    public String toString() {
        return "Funcionario{" + "nome='" + getNome() + '\'' + ", CPF='" + getCPF() + '\'' + ", dataNascimento='" + getDataNascimento() + '\'' + ", endereco='" + getEndereco() + '\'' + ", nroCLT='" + nroCLT + '\'' + ", salario=" + salario + '}';
    }


}
