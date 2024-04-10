public class Funcionario extends Pessoa {
    private String nroCLT;
    private double salario;


    public Funcionario(){}
    public Funcionario (String nome, String dataNascimento, String CPF, String endereco, String nroCLT, double salario) {
        super(nome, dataNascimento, CPF, endereco);
        this.nroCLT = nroCLT;
        this.salario = salario;
    }


    public boolean cadFuncionario(Funcionario f, String nome, String dataNascimento, String CPF, String endereco, String nroCLT, double salario) {
        boolean valida = Pessoa.validar(CPF);
        int cont = 0;

        if(valida) {
            f.setCPF(CPF);
            cont++;
        } else {
            f.setCPF("");
            return false;
        }

        if(nome.isEmpty()) {
            f.setNome("");
            return false;
        }
        else  {f.setNome(nome); cont++;}

        if(VerificaData.verificaData(dataNascimento)) {
            f.setDataNascimento(dataNascimento);
            cont++;
        } else {
            f.setDataNascimento("");
            return false;
        }

        if(endereco.isEmpty()) {
            f.setEndereco("");
            return false;
        } else {f.setEndereco(endereco); cont++;}

        if(salario < 1412){
            System.out.println("Esse salario eh inferior ao salario minimo de um CLT no Brasil, por favor insira um salario valido");
            f.setSalario(0);
            return false;
        } else {f.setSalario(salario); cont++;}

        if(nroCLT.isEmpty()) {
            f.setNroCLT("");
            return false;
        } else {f.setNroCLT(nroCLT); cont++;}

        if(cont == 6) return true;

        return false;

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
