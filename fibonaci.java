public class fibonaci {
    static int fibonacci(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
