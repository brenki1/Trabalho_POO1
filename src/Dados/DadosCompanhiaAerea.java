package Dados;

import java.util.ArrayList;
import Classes.*;
public class DadosCompanhiaAerea {
    private ArrayList<CompanhiaAerea> companhiasAereas;

    public DadosCompanhiaAerea() {
        this.companhiasAereas = new ArrayList<>(); //Incializando o vetor
    }

    // Método para cadastrar uma  companhia aérea
    public void cadastrar(CompanhiaAerea companhiaAerea) {
        companhiasAereas.add(companhiaAerea);
    }

    // Método para buscar uma companhia aérea pelo CNPJ
    public CompanhiaAerea buscar(String CNPJ) {
        for (CompanhiaAerea companhiaAerea : companhiasAereas) {
            if (companhiaAerea.getCNPJ().equals(CNPJ)) {
                return companhiaAerea;
            }
        }
        return null; //Caso a  Companhia aérea não seja encontrada
    }

    // Método para excluir uma companhia aérea pelo CNPJ
    public boolean excluir(String CNPJ) {
        CompanhiaAerea companhiaAerea = buscar(CNPJ);
        if (companhiaAerea != null) {
            companhiasAereas.remove(companhiaAerea); //Excluindo a companhia
            return true;
        }
        return false; // Companhia aérea não encontrada
    }

    // Método para listar todas as companhias aéreas
    public void listar() {
        for (CompanhiaAerea companhiaAerea : companhiasAereas) {
            System.out.println(companhiaAerea);
        }
    }
}

