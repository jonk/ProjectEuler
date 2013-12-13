import java.util.HashSet;

class Problem1 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000; i += 3) {
            nums.add(i);
        }
        for (int i = 0; i < 1000; i += 5) {
            nums.add(i);
        }
        for (int x : nums) {
            total += x;
        }
        System.out.println(total);
    }

        public static HashSet<Integer> nums = new HashSet<Integer>();
}