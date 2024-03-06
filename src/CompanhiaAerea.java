public class CompanhiaAerea extends Empresa {
    private double PrecoPass; //Preço da passagem

    public CompanhiaAerea(){}
    //Construtuor para o cadastro da empresa
    public CompanhiaAerea(String cnpj, String nomeOF, String nomeDIV, String dataCriacao, double PrecoPass){
        super(cnpj, nomeOF, nomeDIV, dataCriacao);
        this.PrecoPass = PrecoPass;
    }

    //Métodos get e set
    public void setPrecoPass(double PrecoPass){
        if(PrecoPass > 0 ) {
            this.PrecoPass = PrecoPass;
        }
    }

    public double getPrecoPass(){

        return PrecoPass;
    }


}
