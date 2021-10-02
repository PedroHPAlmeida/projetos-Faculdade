import java.util.Random;

public class JogoLista {
    public static void main(String[] args) {
        Lista l = new Lista();
        Random random = new Random();

        do {
            if (random.nextInt(2) == 1) { // insercao
                if (random.nextInt(2) == 1) { // insercao de inicio
                    l.insereInicio(random.nextInt(10));
                } else { // insercao de fim
                    l.insereFim(random.nextInt(10));
                }
            } else { // remocao
                if (!l.estaVazia()) {
                    if (random.nextInt(2) == 1) { // remocao de inicio
                        System.out.println(l.removeInicio() + " saiu do inicio");
                    } else { // remocao de fim
                        System.out.println(l.removeFim() + " saiu do fim");
                    }
                }
            }
            System.out.println(l);
        } while (!l.estaVazia());
    }
}