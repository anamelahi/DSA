import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedArray448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static List<Integer> sort(int[] nums){
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
//        for (int j = 0; j < nums.length; j++) {
//            if (j!=nums[j]-1){
//                return j;
//            }
//        }

        //finding missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1){
                ans.add(j+1);
            }
        }

        return ans;
    }

}
