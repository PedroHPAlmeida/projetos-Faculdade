import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        // variaveis e objetos
        FilaLigada f = new FilaLigada();
        Random random = new Random();

        // saida
        do {
            if (random.nextInt(2) == 1) {
                int n = random.nextInt(10);
                System.out.println(n + " entrou");
                f.insere(n);
                System.out.println(f);
            } else {
                if(!f.estaVazia()){
                    System.out.println(f.remove() + " foi atendido");
                    System.out.println(f);
                }
            }
        } while (!f.estaVazia());
    }
}