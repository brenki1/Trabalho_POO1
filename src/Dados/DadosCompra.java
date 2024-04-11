package Dados;

import java.util.ArrayList;
import Classes.*;
public class DadosCompra {
    //Array para armazenar os dados da compras
    private ArrayList<Compra>compras;

    public DadosCompra() {
        this.compras = new ArrayList<>(); //Inicializando um Vetor
    }

    // Método para cadastrar uma  compra
    public void cadastrar(Compra compra) {
        compras.add(compra);
    }

    // Método para buscar uma compra pelo comprador
    public Compra buscar(Cliente comprador) {
        for (Compra compra : compras) {
            if (compra.getComprador().equals(comprador)) {
                return compra;
            }
        }
        return null; // Classes.Compra não encontrada
    }

    // Método para excluir uma compra
    public boolean excluirCompra(Compra compra) {
        return compras.remove(compra);
    }



    // Método para listar todas as compras
    public void listar() {
        for (Compra compra : compras) {
            System.out.println(compra); // Supondo que Classes.Compra tenha um método toString() implementado
        }
    }
}


