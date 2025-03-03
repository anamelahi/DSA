import java.util.Arrays;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        missingNumber(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while ( i < nums.length) {
            int correcti = nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correcti]){
                int temp = nums[i];
                nums[i] = nums[correcti];
                nums[correcti] = temp;
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j){
                return j;
            }

        }
        return nums.length;
    }
}