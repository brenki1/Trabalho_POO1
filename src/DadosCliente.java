import java.util.ArrayList;

public class DadosCliente { //Classe que armazena os dados do Cliente
    private ArrayList<Cliente> clientes; //Array que armazena os dados do Cliente

    //Construtor que inicializa o vetor quando um objeto da classe é instanciado
    public DadosCliente(){
        this.clientes = new ArrayList<>();
    }

    //Método para cadastrar um cliente
    public void cadastrar(Cliente cliente){
        clientes.add(cliente); //Adcionando um cliente ao vetor
    }

    //Método para buscar um cliente pelo CPF
    public Cliente Buscar(String CPF){
        for(Cliente cliente : clientes){
            if(cliente.getCPF().equals(CPF)){
                return cliente;
            }
        }
        return null; //Caso o cliente não for encontrado
    }

    //Mpetodo para excluir um cliente pelo CPF
    public boolean Excluir(String CPF){
        Cliente cliente = Buscar(CPF);
        if(cliente != null){
            clientes.remove(cliente); //Removendo o cliente do vetor
            return true;
        }
        return false; //Caso o cliente nõ seja encontrado
    }

    //Método para listar todos os clientes
    public void listar(){
        for(Cliente cliente : clientes){
            System.out.println(cliente); //Será impresso pelo método to String na classe Cliente
        }
    }


}
