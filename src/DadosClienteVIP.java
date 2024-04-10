import java.util.ArrayList;
public class DadosClienteVIP {
    private ArrayList<ClienteVIP> clientes; //Vetor de clientes

    //Construtor para inicializar o vetor
    public DadosClienteVIP(){
        this.clientes = new ArrayList<>();
    }

    // Método para cadastrar um cliente
    public void cadastrar(ClienteVIP cliente) {
        clientes.add(cliente);
    }

    // Método para procurar um cliente pelo CPF
    public ClienteVIP buscar(String CPF) {
        for (ClienteVIP cliente : clientes) {
            if (cliente.getCPF().equals(CPF)) {
                return cliente;
            }
        }
        return null; // Caso o Cliente não seja encontrado
    }

    // Método para excluir um cliente pelo CPF
    public boolean excluir(String CPF) {
        ClienteVIP cliente = buscar(CPF);
        if (cliente != null) {
            clientes.remove(cliente); //Removendo um cliente do vetor
            return true;
        }
        return false; // Caso o cliente não seja encontrado
    }

    // Método para listar todos os clientes
    public void listar() {
        for (ClienteVIP cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
