public class Empresa {
    public static void main(String[] args) {
        Empregado e = new Empregado("Jose", 1000);
        Gerente g = new Gerente("Joao", 1200, "Ana");

        //e.aumentarSalario(10);
        //g.aumentarSalario(10); // vai executar o aumento de salario da classe de Gerente, pois foi feita a
                               // sobrescrita (override) do método

        Empregado[] listaFuncionarios = new Empregado[3];
        listaFuncionarios[0] = e;
        listaFuncionarios[1] = g;
        listaFuncionarios[2] = new Empregado("Ana", 1550);

        for(Empregado emp : listaFuncionarios){
            System.out.println(emp.getNome() + " - " + emp.getSalario());
        }

        for (Empregado emp : listaFuncionarios) { // for aprimorado
            emp.aumentarSalario(15); // polimorfismo
            System.out.println(emp.getNome() + " - " + emp.getSalario());
        }
    }
}