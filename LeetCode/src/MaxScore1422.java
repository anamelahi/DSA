public class MaxScore1422 {
    public static void main(String[] args) {
        String s = new String("00111");
        System.out.println(maxScore(s));
    }
    static int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        int n = s.length();
//        String left = new String("");
//        String right = new String("");
//        int max;
//        for (int i = 0; i < s.length(); i++) {
//        }

        for (int i = 1; i < n; i++) {
            int leftZeros = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    leftZeros++;
                }
            }

            int rightOnes = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    rightOnes++;
                }
            }

            int score = leftZeros + rightOnes;

            max = Math.max(max, score);
        }

        return max;
    }
}
