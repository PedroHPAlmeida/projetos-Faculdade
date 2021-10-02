public class No {
    // atributos
    private int info;
    private No proximo;

    public No(int info) { // construtor
        setInfo(info);
        setProximo(null);
    }

    // metodos de acesso = getters
    public int getInfo() {
        return this.info;
    }

    public No getProximo() {
        return this.proximo;
    }

    // metodos modificadores = setters
    public void setInfo(int info) {
        this.info = info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // redefinir o toString = representacao textual de um objeto
    @Override
    public String toString() {
        return getInfo() + " -> ";
    }
}