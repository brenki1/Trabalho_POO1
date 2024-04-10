import java.util.ArrayList;
public class DadosFuncionarioExecutivo {
    private ArrayList<FuncionarioExecutivo> funcionarios; //Vetor de funcionários

    //Construtor para inicializar o vetor
    public DadosFuncionarioExecutivo(){
        this.funcionarios = new ArrayList<>();
    }

    // Método para cadastrar um funcionário
    public void cadastrar(FuncionarioExecutivo funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para procurar um funcionário pelo CPF
    public FuncionarioExecutivo buscar(String CPF) {
        for (FuncionarioExecutivo funcionario : funcionarios) {
            if (funcionario.getCPF().equals(CPF)) {
                return funcionario;
            }
        }
        return null; // Caso o Funcionário não seja encontrado
    }

    // Método para excluir um funcionário pelo CPF
    public boolean excluir(String CPF) {
        FuncionarioExecutivo funcionario = buscar(CPF);
        if (funcionario != null) {
            funcionarios.remove(funcionario); //Removendo um funcionário do vetor
            return true;
        }
        return false; // Caso o funcionário não seja encontrado
    }

    // Método para listar todos os funcionários
    public void listar() {
        for (FuncionarioExecutivo funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
