package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Pessoa implements Serializable {
    private String dataCad;
    private String email;

    private ArrayList<String[]>pesquisa; //Um arrayList de strings foi criado para armazenar as pesquisas feitas pelo cliente
    private ArrayList<Compra> compras = new ArrayList<>(); //ArrayList de compras
    public Cliente () {}

    public Cliente (String CPF, String nome) {
        super(CPF, nome);
    }

    public Cliente(String nome, String dataNascimento, String CPF, String endereco, String dataCad, String email) {
        super(nome, dataNascimento, CPF, endereco);
        this.dataCad = dataCad;
        this.email = email;
        this.compras = new ArrayList<>(); //Inicializando o vetor que armazena as compras
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

    public void setCompras(ArrayList<Compra> compras) {
        compras = compras;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }


    //Método para registrar as pesquisas
    public void RegistroPesquisa(String origem, String destino, String dataInicio, String dataFim){
        String[] pesquisaArray= {origem, destino, dataInicio, dataFim};
        pesquisa.add(pesquisaArray); //Registrando a pesquisa em um array de vetores
    }

    //Método para adicionar uma compra
    public void addCompra(Compra compra){
        compras.add(compra);
    }

    //Método To-String, foi implementado para obetermos uma representação de texto Legível de um objeto do tipo Cliente quando for usado na interface gráfica
    public String ToString(){
        return "Nome: " + getNome() + ", Data de Cadastro: " + getDataCad() + ", Email: " + getEmail() + ", Compras: " + getCompras();
    }



}
