public class Pilha1 { // pilha usando vetor
    private int[] v;
    private int topo;

    public Pilha1(int capacidade) {
        this.v = new int[capacidade];
        this.topo = 0;
    }

    public boolean pilhaVazia() {
        if (this.topo == 0) {
            return true;
        }
        return false;
    }

    public boolean pilhaCheia() {
        if (this.topo == v.length) {
            return true;
        }
        return false;
    }

    public void push(int elemento) { // empilha
        this.v[this.topo] = elemento;
        this.topo++;
    }

    public int pop() { // desempilha
        this.topo--;
        return this.v[this.topo];
    }

    @Override
    public String toString() { // metodo toString alterado para melhor visualizacao no programa de conversao de base
        String s = "";
        if (this.pilhaVazia()) {
            s += "vazia";
        } else {
            for (int i = this.topo - 1; i >= 0; i--) {
                s += this.v[i] + "";
            }
        }
        return s;
    }
}