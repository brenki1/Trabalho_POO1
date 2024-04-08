import java.util.ArrayList;

public class DadosPassagem {
    //Array para os dados da passagem
    private ArrayList<Passagem>passagens;
    public DadosPassagem() {
        this.passagens = new ArrayList<>();
    }

    public void cadastrar(Passagem passagem) {
        passagens.add(passagem);
    }

    public Passagem buscar(double preco, double taxaEmbarque, int tipoPass) {
        for (Passagem passagem : passagens) {
            if (passagem.getPreco() == preco && passagem.getTaxaEmbarque() == taxaEmbarque && passagem.getTipoPass() == tipoPass) {
                return passagem;
            }
        }
        return null; // Passagem não encontrada
    }

    public boolean excluir(double preco, double taxaEmbarque, int tipoPass) {
        Passagem passagem = buscar(preco, taxaEmbarque, tipoPass);
        if (passagem != null) {
            passagens.remove(passagem);
            return true; // Passagem excluída com sucesso
        }
        return false; // Passagem não encontrada
    }

    public void listar() {
        for (Passagem passagem : passagens) {
            System.out.println(passagem);
        }
    }
}




