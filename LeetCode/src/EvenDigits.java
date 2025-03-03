
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num = 0; num < nums.length; num++) {
            if (even(nums[num])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int countt = 0;
        while (num > 0) {
            countt++;
            num = num / 10;
        }
        return countt;
    }
}
