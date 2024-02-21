import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Hotel extends Empresa {
    private String endereco;
    private int stars;
    private boolean accPets;
    private int quartos;
    private Date checkin; //REQUER FORMATACAO!!
    private Date checkout; //REQUER FORMATACAO!!
    private String msgDiv;
    private String descricao;

    //faltam alguns campos

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

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
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
