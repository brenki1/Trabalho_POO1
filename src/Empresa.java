public class Empresa {
    private String CNPJ;
    private String nomeOF;

    private String nomeDIV;
    private String dataCriacao;

    protected static double taxaUdiDecola = 0.056;

    public Empresa(){}
    public Empresa (String cnpj, String nomeOF, String nomeDIV, String dataCriacao) {
        CNPJ = cnpj;
        this.nomeOF = nomeOF;
        this.nomeDIV = nomeDIV;
        this.dataCriacao = dataCriacao;
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
