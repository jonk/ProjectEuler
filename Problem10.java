public class Problem10 {

    public static void main(String[] args) {
        long result = 0L;
        for (long i = 0L; i < 2000000L; i++) {
            if (isPrime(i)) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if ((n % 2) == 0 || (n % 3) == 0) {
            return false;
        }

        long sqrt = (long) Math.sqrt(n);

        for (long i = 6L; i <= sqrt + 1; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
