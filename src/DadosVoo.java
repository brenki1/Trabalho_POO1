import java.util.ArrayList;

public class DadosVoo {
    //Array que armazena os dados dos voos
    private ArrayList<Voo> voos = new ArrayList<>();

    public void cadastrar(Voo v) { //Método para cadastrar
        voos.add(v);
    }


    public Voo buscar(TrechoVoo trecho) {
        for (Voo voo : voos) {
            if (voo.getTrecho().equals(trecho)) {
                return voo;
            }
        }
        return null; // Retorna null se não encontrar o voo com o trecho especificado
    }

    public boolean excluir(Voo v) {
        return voos.remove(v); // Remove o voo da lista e retorna true se a remoção for bem-sucedida
    }

    public void listar() {
        for (Voo voo : voos) {
            System.out.println(voo); // Chama automaticamente o método toString de Voo
        }
    }

}
