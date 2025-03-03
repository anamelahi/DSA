import java.util.Arrays;

public class Ques2770 {
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
    }
    static int waysToSplitArray(int[] nums){
        long totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
         long leftSum = 0;
        int count = 0;

        for (int j = 0; j < nums.length-1; j++) {
            leftSum += nums[j];
            long rightSum = totalSum-leftSum;
            if (leftSum>=rightSum){
                count++;
            }
        }
        return count;
    }

}

//FIRST APPROACH-BRUTE FORCE
//    static boolean splits(int[] nums, int split){
//        int[] left = Arrays.copyOfRange(nums,0,split);
//        int[] right = Arrays.copyOfRange(nums,split,nums.length);
//        int sumLeft = 0;
//        int sumRight =0;
//        for (int j = 0; j < left.length; j++) {
//            sumLeft = sumLeft+left[j];
//        }
//        for (int j = 0; j < right.length; j++) {
//            sumRight = sumRight+right[j];
//        }
//
//        return sumLeft>=sumRight;
//    }
//    static int waysToSplitArray(int[] nums) {
//        int count = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (splits(nums,i)){
//                count++;
//            }
//        }
//        return count;
//    }
