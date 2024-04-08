import java.util.ArrayList;

public class DadosPassagemIda {

    private ArrayList<PassagemIda> passagensIda;

    public DadosPassagemIda() {
        passagensIda = new ArrayList<>();
    }

    public void cadastrar(PassagemIda passagemIda) {
        passagensIda.add(passagemIda);
    }

    public void listar() {
        for (PassagemIda passagemIda : passagensIda) {
            System.out.println(passagemIda);
        }
    }

    public PassagemIda buscar(TrechoVoo trecho) {
        for (PassagemIda passagemIda : passagensIda) {
            if (passagemIda.getIda().equals(trecho)) {
                return passagemIda;
            }
        }
        return null;
    }

    public boolean excluir(TrechoVoo trecho) {
        PassagemIda passagemIda = buscar(trecho);
        if (passagemIda != null) {
            passagensIda.remove(passagemIda);
            return true;
        }
        return false;
    }


}
