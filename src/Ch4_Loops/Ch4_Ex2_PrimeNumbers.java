package Ch4_Loops;

public class Ch4_Ex2_PrimeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        // 2 3 4 5 6 7 8 9 ..
        int count = 0;
        int n = 2;
        boolean isPrime;
        while (count < NUMBER_OF_PRIMES) {
            isPrime = true;
            for (int div = 2; div < n; div++) {
                if (n % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + ", ");
                count++;
            }
            n++;
        }
    }
}
