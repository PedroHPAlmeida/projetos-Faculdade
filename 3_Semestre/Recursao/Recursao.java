public class Recursao {
    public static void main(String[] args) {
        //int[] v = new int[6];
        // System.out.println("Fatorial de 5 = " + fatorialRecursivo(5));
        // System.out.println("Fibonacci Recursivo 5 = " + fibonacciRecursivo(5));

        for (int i = 0; i < 46; i++) {
            System.out.println("Fibonacci Recursivo de " + i + " = " + fibonacciRecursivo(i));
        }

        // fibonacci(v, 6);
        // System.out.println("Fibonacci 5 = " + v[5]);
    }

    static int fatorialRecursivo(int n) {
        if (n <= 1)
            return 1;
        return n * fatorialRecursivo(n - 1);
    }

    static int fibonacciRecursivo(int n) {
        if (n <= 1)
            return 1;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // programacao dinamica
    static void fibonacci(int v[], int n) {
        v[0] = 1;
        v[1] = 1;
        for (int i = 2; i < n; i++) {
            v[i] = v[i - 1] + v[i - 2];
        }
    }
}