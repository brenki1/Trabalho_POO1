public class Cliente extends Pessoa {
    private String dataCad;
    private String email;

    private static int nroClienteVip;

    public static int getNroClienteVip() {
        return nroClienteVip;
    }

    public static void setNroClienteVip(int nroClienteVip) {
        Cliente.nroClienteVip = nroClienteVip;
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
