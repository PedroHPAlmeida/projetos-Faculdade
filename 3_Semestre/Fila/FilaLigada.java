public class FilaLigada {
    private int tamanho;
    private No primeiro;
    private No ultimo;

    // constructor
    public FilaLigada() {
        this.tamanho = 0;
        this.primeiro = null;
        this.ultimo = null;
    }

    // getter
    public int getTamanho() {
        return this.tamanho;
    }

    // metodos
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void insere(int i) {
        No novo = new No(i);
        if (this.estaVazia()) {
            this.primeiro = novo;
        } else {
            this.ultimo.setProximo(novo);
        }
        this.ultimo = novo;
        this.tamanho++;
    }

    public int remove() {
        int copia = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
        if (this.tamanho == 0) {
            this.ultimo = null;
        }
        return copia;
    }

    // toString
    @Override
    public String toString() {
        String s = "";
        if (this.tamanho == 0) {
            s += "fila vazia";
        } else {
            No aux = this.primeiro;
            while (aux != null) {
                s += aux.getInfo() + " -> ";
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s;
    }
}