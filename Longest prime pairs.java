import java.util.Scanner;
public class Main {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] longestPrimePairs(int left, int right) {
        int prime1 = -1;
        int prime2 = -1;
        int maxGap = 0;

        for (int i = Math.max(2, left); i <= right; i++) {
            if (isPrime(i)) {
                if (prime1 == -1) {
                    prime1 = i;
                } else {
                    int gap = i - prime1;
                    if (gap > maxGap) {
                        maxGap = gap;
                        prime2 = i;
                    }
                    prime1 = i;
                }
            }
        }

        if (prime1 == -1 || prime2 == -1) {
            return new int[]{-1, -1};
        } else {
            return new int[]{prime1, prime2};
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int[] output = longestPrimePairs(left, right);

        System.out.println("[" + output[0] + ", " + output[1] + "]");
    }
}
