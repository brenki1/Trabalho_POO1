public class Cliente extends Pessoa {
    private String dataCad;
    private String email;
    private static int nroClienteVip = 12; //Limite de compras para se tornar vip
    private int Compras; //Representa o número de compras


    public Cliente () {}

    public Cliente(String nome, String dataNascimento, String CPF, String endereco, String dataCad, String email, int compras) {
        super(nome, dataNascimento, CPF, endereco);
        this.dataCad = dataCad;
        this.email = email;
        this.Compras = compras; //Adcionando as compras
    }

    public String getDataCad() {
        return dataCad;
    }

    public void setDataCad(String dataCad) {
        this.dataCad = dataCad;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCompras(int compras) {
        Compras = compras;
    }

    public int getCompras() {
        return Compras;
    }

    //Método que indica se é vip
    public boolean cliente_Vip(int compras){
        if(compras > nroClienteVip){
            return true;
        }

        return false;
    }

    //Talvez o que esteja abaixo não seja necessário
    public boolean compra() {
        return true;}

    public boolean ehVIP() {
        return true;
    }
}
