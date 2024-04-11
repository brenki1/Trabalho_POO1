package Dados;

import java.util.ArrayList;
import Classes.*;
public class DadosVoo {
    //Array que armazena os dados dos voos
    private ArrayList<Voo> voos = new ArrayList<>();

    public void cadastrar(Voo v) { //Método para cadastrar
        voos.add(v);
    }

    public boolean excluir(Voo v) {
        return voos.remove(v); // Remove o voo da lista e retorna true se a remoção for bem-sucedida
    }

    public void listar() {
        for (Voo voo : voos) {
            System.out.println(voo); // Chama automaticamente o método toString de Classes.Voo
        }
    }

}
