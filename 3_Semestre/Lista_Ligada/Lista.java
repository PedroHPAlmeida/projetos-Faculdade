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

    public void insereFim(int i) {
        No novo = new No(i);
        if (this.estaVazia()) {
            this.setPrimeiro(novo);
        } else {
            No aux = this.getPrimeiro();
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int removeInicio() {
        int i = this.getPrimeiro().getInfo();
        this.setPrimeiro(this.getPrimeiro().getProximo());
        return i;
    }

    public int removeFim() {
        int i;
        if (this.getPrimeiro().getProximo() == null) { // lista tem apenas 1 elemento
            i = this.getPrimeiro().getInfo();
            this.setPrimeiro(null); // esvaziei a lista
        } else {
            No aux = this.getPrimeiro();
            while (aux.getProximo().getProximo() != null) {
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return i;
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