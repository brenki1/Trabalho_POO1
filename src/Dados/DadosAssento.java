package Dados;

import java.util.ArrayList;
import java.util.List;
import Classes.*;


public class DadosAssento {

    private List<Assento>lista; //Array para a lista de Assentos

    public DadosAssento() {
        this.lista = new ArrayList<>(); //Inicializando o vetor
    }

    public void cadastrar(Assento assento) {
        this.lista.add(assento);
    }

    public void listar() {
        for (Assento assento : this.lista) {
            System.out.println(assento); // Chamando o método toString implicitamente
        }
    }

    public Assento buscar(int pos) { //'pos' Indica a posição do assento na matriz
        if (pos >= 0 && pos < this.lista.size()) {
            return this.lista.get(pos);
        } else {
            return null; //Caso o assento não seja encontrado
        }
    }

    public boolean excluir(int pos) {
        if (pos >= 0 && pos < this.lista.size()) {
            this.lista.remove(pos);
            return true;
        } else {
            return false; //Caso o assento não seja encontrado
        }
    }


}
