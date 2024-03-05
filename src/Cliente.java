public class Cliente extends Pessoa {
    private String dataCad;
    private String email;
    private static int nroClienteVip = 12;

    public Cliente () {}

    public Cliente(String nome, String dataNascimento, String CPF, String endereco, String dataCad, String email) {
        super(nome, dataNascimento, CPF, endereco);
        this.dataCad = dataCad;
        this.email = email;
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

    public boolean compra() {return true;}

    public boolean ehVIP() {return true;}
}
