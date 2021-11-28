public class Empregado {
    // atributtes
    private String nome;
    private double salario;

    // constructor
    public Empregado(String nome, double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // getters
    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    // methods
    public void aumentarSalario(double percentual) {
        percentual = 1 + (percentual / 100);
        this.setSalario(salario * percentual);
    }
}