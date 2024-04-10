import java.util.ArrayList;

public class ClienteVIP extends Cliente{
    private static int nroComprasVip = 10;
    private double descontoVip;
    private String dataVip;
    public ClienteVIP(String nome, String dataNascimento, String CPF, String endereco, String dataCad, String email, ArrayList<Compra> compras, double descontoVip, String dataVip){
        super(nome, dataNascimento, CPF, endereco, dataCad, email, compras);
        this.descontoVip = descontoVip;
        this.dataVip = dataVip;
    }

    public double getDescontoVip() {
        return descontoVip;
    }

    public void setDescontoVip(double descontoVip) {
        this.descontoVip = descontoVip;
    }

    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public static int getNroComprasVip() {
        return nroComprasVip;
    }

    public String ToString(){
        return "Nome: " + getNome() + ", Data de Cadastro: " + getDataCad() + ", Email: " + getEmail() + ", Número de Compras: " + getCompras() + ", Desconto VIP: " + getDescontoVip() + ", Data VIP: " + getDataVip();
    }
}
