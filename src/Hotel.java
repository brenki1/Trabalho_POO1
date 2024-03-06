import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Hotel extends Empresa {
    private String endereco;
    private int stars;
    private boolean accPets;
    private int quartos_Single; //Números de quartos single

    private int quartos_Duplos; //Número de quartos duplos

    private int quartos_Triplos; //Número de quartos triplos

    private double valorDiariaSingle;
    private double valorDiariaDuplo;
    private double valorDiariaTriplo;

    private double desconto; //Valor a ser definido

    private boolean cancelar; //Objeto para cancelar a diária
    private Date checkin; //não usar por enqt
    private Date checkout; //não usar por enqt
    private String msgDiv;
    private String descricao;

    //faltam alguns campos

    public Hotel() {}
    public Hotel(String cnpj, String nomeOF, String nomeDIV, String dataCriacao, String endereco, int stars, boolean accPets, int quartos_Single, int quartos_Duplos, int quartos_Triplos, double valorDiariaSingle,  double valorDiariaDuplo, double valorDiariaTriplo, double desconto, boolean cancelar, String msgDiv, String descricao){
        super(cnpj, nomeOF, nomeDIV, dataCriacao);
        this.endereco = endereco;
        this.stars = stars;
        this.accPets = accPets;
        this.quartos_Single =quartos_Single;
        this.quartos_Duplos = quartos_Duplos;
        this.quartos_Triplos = quartos_Triplos;
        this.valorDiariaSingle = valorDiariaSingle;
        this.valorDiariaDuplo = valorDiariaDuplo;
        this.valorDiariaTriplo = valorDiariaTriplo;
        this.desconto = desconto;
        this.msgDiv = msgDiv;
        this.descricao = descricao;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public int getStars() {

        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isAccPets() {

        return accPets;
    }

    public void setAccPets(boolean accPets) {

        this.accPets = accPets;
    }

    public void setQuartos_Single(int quartos) {
        this.quartos_Single = quartos;
    }
    public int getQuartos_Single() {

        return quartos_Single;
    }

    public void setQuartos_Duplos(int quartos_Duplos){
        this.quartos_Duplos = quartos_Duplos;
    }

    public int getQuartos_Duplos(){
        return quartos_Duplos;
    }

    public void setQuartos_Triplos(){
        this.quartos_Triplos = quartos_Triplos;
    }

    public int getQuartos_Triplos() {
        return quartos_Triplos;
    }

    public void setValorDiariaSingle(double valorDiariaSingle) {
        this.valorDiariaSingle = valorDiariaSingle;
    }

    public double getValorDiariaSingle() {
        return valorDiariaSingle;
    }

    public void setValorDiariaDuplo(double valorDiariaDuplo) {
        this.valorDiariaDuplo = valorDiariaDuplo;
    }

    public double getValorDiariaDuplo() {
        return valorDiariaDuplo;
    }

    public void setValorDiariaTriplo(double valorDiariaTriplo) {
        this.valorDiariaTriplo = valorDiariaTriplo;
    }

    public double getValorDiariaTriplo() {
        return valorDiariaTriplo;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {

        this.checkin = checkin;
    }

    public Date getCheckout() {

        return checkout;
    }

    public void setCheckout(Date checkout) {

        this.checkout = checkout;
    }

    public String getMsgDiv() {

        return msgDiv;
    }

    public void setMsgDiv(String msgDiv) {
        this.msgDiv = msgDiv;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }



}
