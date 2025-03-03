package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 2;
        System.out.println(findIndex(arr,target,0));
    }
    static boolean find(int[] arr, int target, int i){
        if (i == arr.length-1){
            return false;
        }
        return arr[i]==target || find(arr,target,i+1);
    }

    static int findIndex(int[] arr, int target, int i){
        if (i == arr.length-1){
            return -1;
        }
        if (arr[i]==target){
            return i;
        }else{
            return findIndex(arr,target,i+1);
        }

    }
}
