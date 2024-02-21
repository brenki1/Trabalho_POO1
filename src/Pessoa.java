import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Pessoa {

    private String nome;
    private String dataNascimento; //DDMMAA
    private String CPF;
    private String endereco;
    private Date dNas; //Garante que a data será exibida sempre no formato desejado, talvez não seja necessário e mantenhamos apenas a string mesmo
                             //Também podemos colocar cada campo da data individualmente int ano int mes e int dia e depois passar tudo pra essa variável

    public Date getdNas() {
        return dNas;
    }

    public Pessoa() {} //Construtor padrão
    public Pessoa (String nome, String dataNascimento, String CPF, String endereco) { //falta implementar as verificacoes necessárias, por enqt é só a base
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        dNas = StringToDate(dataNascimento);
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date StringToDate(String s){

        Date result = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            result  = dateFormat.parse(s);
        }

        catch(ParseException e){
            e.printStackTrace();

        }
        return result ;
    }
}
