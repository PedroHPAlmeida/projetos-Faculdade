public class TesteLista {
    public static void main(String[] args) {
        Lista l = new Lista();

        System.out.println("lista criada:\n" + l);

        l.insereInicio(2);
        l.insereInicio(4);
        l.insereInicio(6);
        l.insereInicio(8);
        System.out.println("lista depois das insercoes de inicio:\n" + l);

        l.insereFim(1);
        l.insereFim(3);
        l.insereFim(5);
        System.out.println("lista depois das insercoes de fim:\n" + l);

        if (!l.estaVazia()) {
            System.out.println(l.removeInicio() + " foi removido do inicio da lista");
            System.out.println("lista depois da remocao de inicio:\n" + l);
        }

        if (!l.estaVazia()) {
            System.out.println(l.removeFim() + " foi removido do fim da lista");
            System.out.println("lista depois da remocao de fim:\n" + l);
        }
    }
}