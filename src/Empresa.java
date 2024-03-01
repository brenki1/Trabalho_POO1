public class Empresa {
    private String CNPJ;
    private String nomeOF;



    private String nomeDIV;
    private String dataCriacao;

    protected static double taxaUdiDecola;
    /*
    taxa fixa que as empresas pagam para o udi decola
    ainda pendente o modo que será utilizado para definir esse atributo
     */

    public static void setTaxaUdiDecola(double taxaUdiDecola) {
        Empresa.taxaUdiDecola = taxaUdiDecola;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeOF() {
        return nomeOF;
    }

    public void setNomeOF(String nomeOF) {
        this.nomeOF = nomeOF;
    }

    public String getNomeDIV() {
        return nomeDIV;
    }

    public void setNomeDIV(String nomeDIV) {
        this.nomeDIV = nomeDIV;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


}
