package Dados;

import java.util.ArrayList;
import Classes.*;
public class DadosHotel {
    //Array que armazena os dados do Classes.Hotel
    private ArrayList<Hotel>hoteis;

    public DadosHotel() {
        this.hoteis = new ArrayList<>();
    }

    // Método para cadastrar um  hotel
    public void cadastrar(Hotel hotel) {
        hoteis.add(hotel);
    }

    // Método para excluir um hotel
    public boolean excluir(Hotel hotel) {
        return hoteis.remove(hotel);
    }

    // Método para listar todos os hotéis
    public void listarHoteis() {
        for (Hotel hotel : hoteis) {
            System.out.println(hotel);
        }
    }

}
