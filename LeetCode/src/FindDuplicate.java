import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        Solution(nums);
//        System.out.println(Arrays.toString(nums));
        System.out.println(Solution(nums));
    }

    public static int Solution(int[] nums) {
        int i = 0;
        while ( i < nums.length) {
            int correcti = nums[i]-1;
            if (nums[i] != nums[correcti]){
                int temp = nums[i];
                nums[i] = nums[correcti];
                nums[correcti] = temp;
            }
            else {
                i++;
            }
        }

        //finding duplicate
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
        return nums.length;
    }
}
