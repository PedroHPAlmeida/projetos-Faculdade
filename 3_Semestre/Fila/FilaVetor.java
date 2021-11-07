public class FilaVetor {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int tamanho;

    // construtor
    public FilaVetor(int capacidade) {
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
        this.dados = new int[capacidade];
    }

    // metodos
    public int getTamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public boolean estaCheia() {
        return this.tamanho == this.dados.length;
    }

    private int proximaPosicao(int posicaoAtual) { // permite o uso do vetor de forma circular
        return (posicaoAtual + 1) % this.dados.length;
    }

    public void insere(int i) {
        this.dados[this.ultimo] = i;
        this.ultimo = this.proximaPosicao(this.ultimo);
        this.tamanho++;
    }

    public int remove() {
        int copia = this.dados[this.primeiro];
        this.primeiro = this.proximaPosicao(this.primeiro);
        this.tamanho--;
        return copia;
    }

    // toString
    @Override
    public String toString() {
        String s = "";
        if (this.tamanho == 0) {
            s += "fila vazia";
        } else {
            for (int i = this.primeiro; i != this.ultimo; i = this.proximaPosicao(i)) {
                s += this.dados[i] + " - ";
            }
            s += "//";
        }
        return s;
    }

    // apenas didatico
    public String stringVetor() {
        String s = "";
        if (tamanho == 0) {
            for (int i = 0; i < dados.length; i++) {
                s += "_ ";
            }
        } else if (this.tamanho == dados.length) {
            for (int i = 0; i < dados.length; i++) {
                s += dados[i] + " ";
            }
        } else if (primeiro < ultimo) {
            for (int i = 0; i < primeiro; i++) {
                s += "_ ";
            }
            for (int i = primeiro; i < ultimo; i++) {
                s += dados[i] + " ";
            }
            for (int i = ultimo; i < dados.length; i++) {
                s += "_ ";
            }
        } else {
            for (int i = 0; i < ultimo; i++) {
                s += dados[i] + " ";
            }
            for (int i = ultimo; i < primeiro; i++) {
                s += "_ ";
            }
            for (int i = primeiro; i < dados.length; i++) {
                s += dados[i] + " ";
            }
        }
        return s;
    }
}