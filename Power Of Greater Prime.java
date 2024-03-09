import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean result = isPowerGreaterThanOne(n);

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int largestPrimeFactor(int n) {
        int maxPrime = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                maxPrime = i;
                n /= i;
            }
        }
        return maxPrime;
    }

    private static boolean isPowerGreaterThanOne(int n) {
        int largestPrime = largestPrimeFactor(n);
        int power = 0;
        while (n % largestPrime == 0) {
            n /= largestPrime;
            power++;
        }
        return power > 1;
    }
}
