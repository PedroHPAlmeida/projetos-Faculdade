import java.util.Scanner;

//programa que converte um numero na base 10 para a base
//usando a classe Pilha1(que e construida sobre a estrutura de vetor)  
public class ConverteDecBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero na base 10 para converte-lo para a base 2: ");
        int numero10 = scanner.nextInt();
        Pilha numero2 = new Pilha();

        while (numero10 > 0) {
            numero2.push(numero10 % 2);
            numero10 /= 2;
        }

        System.out.println("Numero convertido para base 2: " + numero2);

        scanner.close();
    }
}