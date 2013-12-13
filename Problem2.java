class Problem2 {
    public static void main(String[] args) {
        System.out.println(findAnswer());
    }

    public static long fib(long n) {
     long prev1=0, prev2=1;
            for(long i=0; i<n; i++) {
                long savePrev1 = prev1;
                prev1 = prev2;
                prev2 = savePrev1 + prev2;
            }
            return prev1;
    }

    public static long findAnswer() {
        long result = 0;
        long total = 0;
        for (long i = 0; i < 50; i++) {
            result = fib(i);
            if (result > 4000000) {
                break;
            }
            if (result % 2 == 0) {
                total += result;
            }
        }
        return total;
    }
}