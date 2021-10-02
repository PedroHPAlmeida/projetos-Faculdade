public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(3);
        No no2 = new No(4);

        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setProximo(no2);
        no1.getProximo().setInfo(8);

        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);
    }
}