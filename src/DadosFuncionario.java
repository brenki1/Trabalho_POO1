import java.util.ArrayList;

public class DadosFuncionario {
    private ArrayList<Funcionario> funcionarios; //Vetor de funcionários

    //Construtor para inicializar o vetor
    public DadosFuncionario(){
        this.funcionarios = new ArrayList<>();
    }

    // Método para cadastrar um funcionário
    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para procurar um funcionário pelo CPF
    public Funcionario buscar(String CPF) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCPF().equals(CPF)) {
                return funcionario;
            }
        }
        return null; // Caso o Funcionário não seja encontrado
    }

    // Método para excluir um funcionário pelo CPF
    public boolean excluir(String CPF) {
        Funcionario funcionario = buscar(CPF);
        if (funcionario != null) {
            funcionarios.remove(funcionario); //Removendo um funcionário do vetor
            return true;
        }
        return false; // Funcionário não encontrado
    }

    // Método para listar todos os funcionários
    public void listar() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}


