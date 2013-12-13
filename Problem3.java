class Problem3 {
    public static void main(String[] args) {
        System.out.println(getAnswer(600851475143L));
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public static long primeStream() {
        counter++;
        if (isPrime(counter)) {
            return counter;
        } else {
            return primeStream();
        }
    }

    public static long getAnswer(long n) {
        long prime = primeStream();
        while (n % prime == 0) {
            long temp = n / prime;
            n = temp;
        }
        if (isPrime(n)) {
            return n;
        } else {
            return getAnswer(n);
        }
    }

    private static long counter = 1;
}