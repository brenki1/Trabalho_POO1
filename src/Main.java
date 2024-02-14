public class Main{
    public static void main(String[] args) {
        Teste pessoa = new Teste();

        pessoa.setNome("joao");
        pessoa.setIdade(91);

        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());

    }
}