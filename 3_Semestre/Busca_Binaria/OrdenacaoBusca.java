import java.util.Random;
import java.util.Scanner;

public class OrdenacaoBusca {
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

    static boolean buscaSimples(int x, int v[]) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }

    static int buscaSimplesComContador(int x, int v[]) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            cont++;
            if (v[i] == x) {
                return cont;
            }
        }
        return cont;
    }

    static boolean buscaBinaria(int x, int v[]) {
        int ini = 0;
        int fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == x)
                return true;
            if (x > v[meio])
                ini = meio + 1;
            else
                fim = meio - 1;
        }
        return false;
    }

    static int buscaBinariaComContador(int x, int v[]) {
        int cont = 0;
        int ini = 0;
        int fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            cont++;
            if (v[meio] == x)
                return cont;
            if (x > v[meio])
                ini = meio + 1;
            else
                fim = meio - 1;
        }
        return cont;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] v = new int[n];

        geraVetor(v);
        // exibeVetor(v, "Vetor original: ");

        System.out.println("comparacoes na busca simples: " + buscaSimplesComContador(34, v));

        bubbleSort(v);

        System.out.println("comparacoes na busca binaria: " + buscaBinariaComContador(34, v));

        scanner.close(); // free na linguagem C
    }
}