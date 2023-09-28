package September_28_2023;

public class PrimeStuff {
    public static boolean isPrime(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        if (factors == 2) {
            return true;
        } else {
            return false;
        }
    }

}
