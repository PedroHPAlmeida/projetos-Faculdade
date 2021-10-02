import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Ordenacao {

    static void geraVetor(int vet[]) {
        Random random = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(vet.length * 10 + 1);
        }
    }

    static void exibeVetor(int vet[], String msg) {
        System.out.println(msg);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int n, int v[]) {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    static void insertion(int n, int v[]) {
        for (int i = 1; i < n; i++) {
            int x = v[i];
            int j;
            for (j = i - 1; j >= 0 && v[j] > x; j--) {
                v[j + 1] = v[j];
            }
            v[j + 1] = x;
        }
    }

    static void seletion(int n, int vet[]) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            int aux = vet[i];
            vet[i] = vet[min];
            vet[min] = aux;
        }
    }

    static void tempoOrdenacao(int v[], String nomeMetodoOrdenacao){
        long iniOrdenacao = 0, fimOrdenacao = 0;
        
        if(nomeMetodoOrdenacao == "bubble"){
            iniOrdenacao = new Date().getTime();
            bubbleSort(v.length, v);
        }
        else if(nomeMetodoOrdenacao == "insertion"){
            iniOrdenacao = new Date().getTime();
            insertion(v.length, v);
        }
        else{
            iniOrdenacao = new Date().getTime();
            seletion(v.length, v);
        }
        fimOrdenacao = new Date().getTime();
        System.out.println("Tempo de ordenacao com " + nomeMetodoOrdenacao.toUpperCase() + ": " + (fimOrdenacao - iniOrdenacao) + " milisegundos");
    }

    public static void main(String[] args) {
        /* variaveis e objetos */
        Scanner scanner = new Scanner(System.in);
        int n;

        /* entrada */
        System.out.print("Digite o tamanho do vetor: ");
        n = scanner.nextInt();
        int vetInsertion[] = new int[n];

        /* processamento (chamadas dos metodos) */
        geraVetor(vetInsertion);
        int vetSeletion[] = vetInsertion.clone(); // gerando uma copia do vetor randomico para que ambos ordenem os
        int vetBubbleSort[] = vetInsertion.clone(); // mesmos numeros

        // ordenacao
        tempoOrdenacao(vetBubbleSort, "bubble");
        tempoOrdenacao(vetInsertion, "insertion");
        tempoOrdenacao(vetSeletion, "seletion");

        scanner.close();
    }
}