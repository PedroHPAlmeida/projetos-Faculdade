public class Lista {
    private No primeiro;
    // usaremos apenas o construtor: primeiro = null

    public No getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        if (this.primeiro == null) {
            return true;
        }
        return false;
        // return this.primeiro == null; - forma de escrever em uma unica linha
    }

    public void insereInicio(int i) {
        No novo = new No(i);
        if (!(this.estaVazia())) {
            novo.setProximo(this.primeiro);
        }
        this.setPrimeiro(novo);
    }

    @Override
    public String toString() {
        String s = "Lista: ";

        if (this.estaVazia()) {
            s += "esta vazia";
        } else {
            No aux = this.getPrimeiro();
            while (aux != null) {
                s += aux;
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s;
    }
}