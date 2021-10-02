import java.util.Scanner;
import java.util.Random;

public class BuscaBinModificada {
    static void geraVetor(int v[]) {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10 * v.length);
        }
    }

    static void exibeVetor(int v[], String msg) {
        System.out.println(msg);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int v[]) {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    static int buscaBinariaNumOcorrencias(int x, int v[]) {
        int ini = 0;
        int fim = v.length - 1;
        int cont = 0;
        int meio = 0;

        while (ini <= fim && cont == 0) {
            meio = (ini + fim) / 2;
            if (v[meio] == x) {
                cont = 1;
            }
            if (x > v[meio])
                ini = meio + 1;
            else
                fim = meio - 1;
        }
        if (cont > 0) { // procurar na redondeza
            // pra esquerda
            for (int i = meio - 1; i >= 0 && v[i] == x; cont++, i--);
            // pra direita
            for (int i = meio + 1; i < v.length && v[i] == x; cont++, i++);
        }
        return cont;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] v = new int[n];

        geraVetor(v);
        exibeVetor(v, "Vetor original: ");
        bubbleSort(v);
        int cont = buscaBinariaNumOcorrencias(34, v);
        System.out.println("numero de ocorrencias do 34: " + cont);

        scanner.close(); // free na linguagem C
    }
}