public class LSinRange {
    public static void main(String[] args) {
        int[]  arr = {1,34,54,12,90,23,54,99,124923};
        int target = 34  ;
        System.out.println(SearchInRange(arr,target,1,7));
    }
    static int SearchInRange(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
