class Problem4 {
    public static void main(String[] args) {
        System.out.println(getAnswer());
    }

    public static boolean isPalindrome(long n) {
        String s = Long.toString(n);
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int getAnswer() {
        int max = -9999999;
        int left = 999;
        int right = 999;
        while (left != 0) {
            System.out.println(left * right);
            if (isPalindrome(left * right) && (left * right) > max) {
                max = left * right;
            } else if (right == 1) {
                left--;
                right = 999;
            } else {
                right--;
            }
        }
        return max;
    }
}