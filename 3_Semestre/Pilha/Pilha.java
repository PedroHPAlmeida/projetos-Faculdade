public class Pilha { // pilha usando conceitos de lista ligada
    private No primeiro;

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void push(int i) {
        No novo = new No(i);
        if (!(this.estaVazia())) {
            novo.setProximo(this.primeiro);
        }
        this.primeiro = novo;
    }

    public int pop() {
        int i = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        return i;
    }

    @Override
    public String toString() {
        String s = "Pilha: ";

        if (this.estaVazia()) {
            s += "esta vazia";
        } else {
            No aux = this.primeiro;
            while (aux != null) {
                s += aux;
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s;
    }
}