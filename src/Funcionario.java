public class Funcionario extends Pessoa {
    private String nroCLT;
    private double salario;

    private static double comissaoRegistraHotel;

    //também a definir quando será registrado esse valor

    public double getComissaoRegistraHotel() {
        return comissaoRegistraHotel;
    }
    public static void setComissaoRegistraHotel(double comissaoRegistraHotel) {
        if(comissaoRegistraHotel>=0){
            Funcionario.comissaoRegistraHotel = comissaoRegistraHotel;
        }
        else{
            Funcionario.comissaoRegistraHotel = 0;
        }
    }

    //necessario implementar uma classe cliente dentro da funcionario; no item i é especificado que um funcionario pode ser um cliente

}
