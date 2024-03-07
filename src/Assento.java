public class Assento {
    private int qtdAssentos;
    private int qtdDisponivelAssentos;
    private int[][] esquemaAssentos;

    public Assento(){}

    public Assento (int qtdAssentos, int qtdDisponivelAssentos, int[][]esquemaAssentos){
        setQtdAssentos(qtdAssentos);
        setQtdDisponivelAssentos(qtdDisponivelAssentos);
        setEsquemaAssentos(esquemaAssentos);
    }

    public boolean estaOcupado(int linha, int coluna){
        if(esquemaAssentos[linha][coluna] == 1) return true;
        else if(esquemaAssentos[linha][coluna]==0) return false;
        return false;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public int getQtdDisponivelAssentos() {
        return qtdDisponivelAssentos;
    }

    public void setQtdDisponivelAssentos(int qtdDisponivelAssentos) {
        this.qtdDisponivelAssentos = qtdDisponivelAssentos;
    }

    public int[][] getEsquemaAssentos() {
        return esquemaAssentos;
    }

    public void setEsquemaAssentos(int[][] esquemaAssentos) {
        this.esquemaAssentos = esquemaAssentos;
    }
}
