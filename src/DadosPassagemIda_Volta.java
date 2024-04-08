import java.util.ArrayList;

public class DadosPassagemIda_Volta {
    private ArrayList<PassagemIda_Volta> passagensIdaVolta;
    public DadosPassagemIda_Volta() {
        passagensIdaVolta = new ArrayList<>();
    }

    public void cadastrar(PassagemIda_Volta passagem) {
        passagensIdaVolta.add(passagem);
    }

    public void listar() {
        for (PassagemIda_Volta passagem : passagensIdaVolta) {
            System.out.println(passagem); // Chama o método toString automaticamente
        }
    }

    public PassagemIda_Volta buscar(String origem, String destino) {
        for (PassagemIda_Volta passagem : passagensIdaVolta) {
            if (passagem.getIda().getOrigem().equalsIgnoreCase(origem) &&
                    passagem.getIda().getDestino().equalsIgnoreCase(destino)) {
                return passagem;
            }
        }
        return null;
    }

    public boolean excluir(PassagemIda_Volta passagem) {
        return passagensIdaVolta.remove(passagem);
    }


}
