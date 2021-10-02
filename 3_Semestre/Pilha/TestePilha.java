import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        Random random = new Random();
        int i = 1;
        while (i <= 6) {
            p.push(random.nextInt(10));
            System.out.println(p);
            i++;
        }

        while (!p.estaVazia()) {
            p.pop();
            System.out.println(p);
        }
    }
}