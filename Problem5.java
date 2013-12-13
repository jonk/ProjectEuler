class Problem5 {
    public static void main(String[] args) {
        System.out.println(getAnswer());
    }

    public static boolean isDivisible(long n) {
        return n % 2 == 0 && n % 3 == 0 && n % 4 == 0
            && n % 5 == 0 && n % 6 == 0 && n % 7 == 0
            && n % 6 == 0 && n % 7 == 0 && n % 8 == 0 
            && n % 9 == 0 && n % 10 == 0 && n % 11 == 0
            && n % 12 == 0 && n % 13 == 0 && n % 14 == 0
            && n % 15 == 0 && n % 16 == 0 && n % 17 == 0
            && n % 18 == 0 && n % 19 == 0 && n % 20 == 0;
    }

    public static long getAnswer() {
        long min = 100000;
        for (long i = 1000000000; i != 1; i--) {
            if (isDivisible(i)) {
                min = i;
            }
        }
        return min;
    }
}