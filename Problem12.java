class Problem12 {

        public static void main(String[] args) {
                int tri_num = 1;
                int incr = 2;
                while (true) {
                        tri_num += incr;
                        if (numDivisors(tri_num) >= 500) {
                                System.out.println(tri_num);
                                break;
                        }
                        incr++;
                }
        }

        public static int numDivisors(int n) {
		if (n == 1) {
			return 1;
		}
                int total = 2; //Include For 1 and num
                int i = 2;
                while (i <= (int) Math.sqrt(n)) {
			if (i == Math.sqrt(n)) {
				total += 1;
                        } else if (n % i == 0) {
                                total += 2;
                        }
                        i++;
                }
                return total;
        }
}


