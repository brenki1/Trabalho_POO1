public class CompanhiaAerea extends Empresa {
    private double PrecoPass;

    public CompanhiaAerea(){}
    public CompanhiaAerea(String cnpj, String nomeOF, String nomeDIV, String dataCriacao, double PrecoPass){
        super(cnpj, nomeOF, nomeDIV, dataCriacao);
        this.PrecoPass = PrecoPass;
    }

    //faltam alguns campos
}
