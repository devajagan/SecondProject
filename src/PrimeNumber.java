public class PrimeNumber {
    public static void main(Strings args[]) {
        int n = 9;
        boolean prime number = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);

    }
}

