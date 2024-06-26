package Classes;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa implements Serializable {

    private String nome; //Variável
    private String dataNascimento; //DDMMAA
    private String CPF;
    private String endereco;

    public Pessoa() {}

    public Pessoa (String CPF, String Nome){
        this.CPF = CPF;
        this.nome = Nome;
    }

    public Pessoa (String nome, String dataNascimento, String CPF, String endereco) { //falta implementar as verificacoes necessárias, por enqt é só a base
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(validar(CPF) == true) {
            this.CPF = CPF;
        }
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date StringToDate(String s){

        Date result = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            result  = dateFormat.parse(s);
        }

        catch(ParseException e){
            e.printStackTrace();

        }
        return result ;
    }
    //Algorítmo para validar o CPF
        public static boolean validar(String CPF){ // Um método de validação estático foi criado para que possa ser acessado nas classes do mesmo pa-cote sem que uma instância da classe seja criada
            CPF = remover(CPF); //Chamando o método para remover os caracteres do cpf e facilitar as operações
            int[] vet = CPFtoArray(CPF); //Transformando meu cpf em array

            if(verificar(1, vet) == true){ //Passando como parâmetro a primeira posição
                return true;
            }else{
                return false;
            }
        }

        private static String remover(String CPF){ //Método privado para retirar os caracteres do cpf. Ele é privado para que não corra o risco de ser acessado nas outras classes, pode ser acessado apenas nessa em questão
            if(CPF.contains(".") || CPF.contains("-")){
                CPF = CPF.replace(".", "");
                CPF = CPF.replace("-", "");

            }
            return CPF;
        }

        //Função para transformar CPF em um vetor de inteiros
        private static int[] CPFtoArray(String CPF){
            int [] vet = new int[11]; //Criando um vetor de inteiros de 11 posições
            for(int i = 0; i <= 10; i++){
                vet[i] = Integer.parseInt(String.valueOf(CPF.charAt(i))); //Convertenedo o String para int (CharAt(i))) é um método próprio do string, valueof eu transformo em string

            }
            return vet;
        }

        private static boolean verificar(int pos, int[] cpf) { //Esse método vai pegar a posição do vetor, e verificar se eu estou verficando o primeiro digito(Verificador) ou o segundo
            int mult = 0; //Inicializando o valor que irá multiplicar os valores dos 9 primeiros digitos do cpf
            int par, result = 0, resto; //"par" é o parâmetro que será usado para indicar até qual posição do vetor eu farei os cálculos para gerar o primeiro dígito ou o segundo, "result" guarda o resultado, resto guardará o resto da divisão

            if (pos == 1) { //Se for o primeiro digito, mult inicia em 10
                mult = 10;
            } else {
                mult = 11; //Se for o segundo dígito
            }
            par = 7 + pos; //Se for o primeiro digito eu utilizarei os 9 primeiros digitos, se for o 2 eu utilizarei os 10 primeiros

            for (int i = 0; i <= par; i++) {
                result += mult * cpf[i];
                mult--;  //Decrementando o valor do multiplicador até que chegue no digito indicado. Lembrando que ele irá decrementar até o número 2, seja para achar o primeiro digito verificador ou o segundo
            }
            resto = result % 11; //Atribuindo ao resto, a divisão do resultado por 11
            if (resto < 2) {
                if (cpf[par + 1] == 0) {
                    if (pos == 1) {
                        return verificar(2, cpf);
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                // Calcular o dígito verificador esperado
                int digitoEsperado = 11 - resto;
                // Comparar o dígito verificador esperado com o dígito verificador fornecido no CPF
                if (digitoEsperado == cpf[par + 1]) {
                    return true; // CPF válido
                } else {
                    return false; // CPF inválido
                }
            }
        }

}





