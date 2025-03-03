package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,10,23,23,30,40,98};
        int target = 23;
        int ans = BSearch(arr,target);
        System.out.println(ans);

    }

    static int BSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {
                //ans found
                return mid;
            }

        }
        return -1;
    }
}
