import java.util.Random;

public class TesteFilaVetor {
    public static void main(String[] args) {
        // variaveis e objetos
        FilaVetor f = new FilaVetor(8);
        Random random = new Random();

        // saida
        do {
            if (random.nextInt(2) == 1) {
                if (!f.estaCheia()) {
                    int n = random.nextInt(10);
                    System.out.println(n + " entrou");
                    f.insere(n);
                }
                System.out.println(f.stringVetor() + " | " + f);
            } else {
                if (!f.estaVazia()) {
                    System.out.println(f.remove() + " foi atendido");
                    System.out.println(f.stringVetor() + " | " + f);
                }
            }
        } while (!f.estaVazia());
    }
}