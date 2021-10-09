import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

//programa que calcula o fatorial de um numero
//codigo usado para exemplificar o uso da classe BigInteger e BigDecimal 

public class BigFatorial { // calculando fatorial usando double
    static double fatorial(int n) {
        double f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i; // promocao do i (promove o inteiro a double)
        }
        return f;
    }

    static BigInteger bigFatorial(int n) { //calculando fatorial usando a classe BigInteger
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    static BigInteger jogosMegaSena() { // calcula a quantidade de jogos possiveis da megasena
        return bigFatorial(60).divide(bigFatorial(54)).divide(bigFatorial(6));
    }

    static boolean repete(int n, int[] v, int i) { // metodo usado para garantir que nao haja repeticoes no metodo geraJogo
        boolean b = false;
        for (int j = 0; j < i && !b; j++) {
            if (v[j] == n) {
                b = true;
            }
        }
        return b;
    }

    static void geraJogo(int[] v) { // metodo que gera um jogo (com 6 numeros) da megasena, sem repeticoes
        Random random = new Random();
        v[0] = random.nextInt(60) + 1;
        int i = 1, n;
        while (i < 6) {
            do {
                n = random.nextInt(60) + 1;
            } while (repete(n, v, i));
            v[i++] = n;
        }
    }

    public static void main(String[] args) {
        // esta parte do programa exemplica os metodos criados para calcular o fatorial de um numero n
        /*
         * for (int i = 0; i < 31; i++) { System.out .println("Fatorial de " + i + " = "
         * + bigFatorial(i) + " ou " + String.format("%.0f", fatorial(i))); }
         */

        // esta parte do programa faz alguns teste com numeros muito grandes e tambem com numeros muito pequenos
        System.out.println("O total de jogos da megasena e " + jogosMegaSena());

        BigDecimal numerador = new BigDecimal(BigInteger.ONE);
        BigDecimal denominador = new BigDecimal(jogosMegaSena());

        System.out.println("Sua chance de ganhar: " + String.format("%.12f", numerador.divide(denominador, 20, RoundingMode.UP)));

        int[] v = new int[6];
        geraJogo(v);
        System.out.println("Se mesmo assim quiser jogar, vai a dica:");
        for (int i = 0; i < 6; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println("\nBoa sorte!!!");
    }
}