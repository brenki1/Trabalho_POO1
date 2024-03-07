import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String dataCad;
    private String email;
    private static int nroClienteVip = 12; //Limite de compras para se tornar vip
    private int Compras; //Representa o número de compra
    private ArrayList<String[]>pesquisa; //Um arrayList de strings foi criado para armazenar as pesquisas feitas pelo cliente

    public Cliente () {}

    public Cliente(String nome, String dataNascimento, String CPF, String endereco, String dataCad, String email, int compras) {
        super(nome, dataNascimento, CPF, endereco);
        this.dataCad = dataCad;
        this.email = email;
        this.Compras = compras; //Adcionando as compras
        this.pesquisa = new ArrayList<>(); //Inicializando o vetor que armazena as pesquisas
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
    public boolean cliente_Vip(){
        if(this.Compras >= nroClienteVip) {
            return true;
        }else
        return false;
    }

    //Método para registrar as pesquisas
    public void RegistroPesquisa(String origem, String destino, String dataInicio, String dataFim){
        String[] pesquisaArray= {origem, destino, dataInicio, dataFim};
        pesquisa.add(pesquisaArray); //Registrando a pesquisa em um array de vetores
    }

    public boolean cadCliente(Cliente c, String dataCad, String nome, String dataNascimento, String CPF, String endereco, String email) {
        boolean valida = Pessoa.validar(CPF);
        int cont = 0;

        dataCad = VerificaData.dataAtual();
        c.setDataCad(dataCad);

        if(valida) {
            c.setCPF(CPF);
            cont++;
        }else {
            c.setCPF("");
            return false;
        }

        if(VerificaData.verificaData(dataNascimento)) {
            c.setDataNascimento(dataNascimento);
            cont++;
        } else {
            c.setDataNascimento("");
            return false;
        }

        if(endereco.isEmpty()) {
            c.setEndereco("");
            return false;
        } else {c.setEndereco(endereco); cont++;}

        if(nome.isEmpty()){
            c.setNome("");
            return false;
        } else {c.setNome(nome); cont++;}

        if(email.isEmpty()) {
            c.setEmail("");
            return false;
        } else {c.setEmail(email); cont++;}

        if(cont == 5) return true;

        return false;
    }


    //Talvez o que esteja abaixo não seja necessário
    public boolean compra() {
        return true;
    }

}
