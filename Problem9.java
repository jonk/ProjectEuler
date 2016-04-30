public class Problem9 {
    public static void main(String[] args) {
        for (double i = 0; i < 1000; i++) {
            double a = i;
            for (double j = 0; j < 1000 - i; j++ ) {
                double b = j;
                double c = 1000 - i - j; 
                if (isTriple(a, b , c)) {
                    System.out.println((int)a * b * c);
                }
            }
        }
    }

    public static boolean isTriple(double a, double b, double c) {
        if (!((a < b) && (b < c))) {
            return false;
        }
        double expA = Math.pow(a, 2);
        double expB = Math.pow(b, 2);
        double expC = Math.pow(c, 2);
        return (expA + expB == expC);
    }
}
