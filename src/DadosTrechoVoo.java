import java.util.ArrayList;

public class DadosTrechoVoo {
    //Vetor que armazena os dados do Trecho
    private ArrayList<TrechoVoo>vetTrechos = new ArrayList<>();

    public void cadastrar(TrechoVoo trecho) { //Método para cadastrar o trecho
        this.vetTrechos.add(trecho);
    }

    public TrechoVoo buscar(String codigo) { //Método para buscar o trecho
        for (TrechoVoo trecho : this.vetTrechos) {
            if (trecho.getCodigo().equals(codigo)) {
                return trecho;
            }
        }
        return null; //Caso o trecho não seja encontrado
    }

    public boolean excluir(String codigo) { //Método que exclui o trecho
        TrechoVoo trecho = buscar(codigo);
        if (trecho != null) {
            this.vetTrechos.remove(trecho);
            return true;
        } else {
            return false;
        }
    }
    public void listar() { //Método para Listar
        for (TrechoVoo trecho : this.vetTrechos) {
            System.out.println(trecho);
        }
    }
}
