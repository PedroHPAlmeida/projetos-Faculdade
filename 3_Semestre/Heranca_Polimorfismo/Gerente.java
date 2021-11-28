public class Gerente extends Empregado {
    // atributtes
    private String nomeSecretaria;

    // constructor
    public Gerente(String nome, double salario, String nomeSecretaria) {
        super(nome, salario);
        this.setNomeSecretaria(nomeSecretaria);
    }

    // setters
    public void setNomeSecretaria(String nomeSecretaria) {
        this.nomeSecretaria = nomeSecretaria;
    }

    // getters
    public String getNomeSecretaria() {
        return this.nomeSecretaria;
    }

    // methods
    @Override
    public void aumentarSalario(double percentual) {
        double bonus = 20;
        percentual += bonus;
        super.aumentarSalario(percentual);
    }
}