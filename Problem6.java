class Problem6 {

    public static void main(String[] args) {
        long squareOfSum = getSquareOfSum(100);
        long sumOfSquares = getSumOfSquares(100);

        System.out.println(squareOfSum - sumOfSquares);

    }

    public static long getSquareOfSum(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static long getSumOfSquares(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }
}