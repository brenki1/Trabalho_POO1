public class Funcionario extends Pessoa {
    private String nroCLT;
    private double salario;

    private static double comissaoRegistraHotel = 25.00;

    public Funcionario(){}
    public Funcionario (String nroCLT, double salario) {
        this.nroCLT = nroCLT;
        this.salario = salario;
    }



    //necessario implementar uma classe cliente dentro da funcionario; no item i é especificado que um funcionario pode ser um cliente

}
