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

    @Override
    public String toString() { // metodo toString alterado para melhor visualizacao no programa de conversao de base
        return this.getInfo() + ""; // truque para converter numeros para String, apenas concatenando com "" (vazio)
    }
}