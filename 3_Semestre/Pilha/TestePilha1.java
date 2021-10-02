import java.util.Random;
import java.util.Scanner;

public class TestePilha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a capacidade da pilha: ");
        int capacidade = scanner.nextInt();

        Pilha1 p = new Pilha1(capacidade);

        Random random = new Random(); 
        while (!p.pilhaCheia()) {
            p.push(random.nextInt(10));
            System.out.println(p);
        }

        while(!p.pilhaVazia()){
            p.pop();
            System.out.println(p);
        }
        
        scanner.close();
    }
}
