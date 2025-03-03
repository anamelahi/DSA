package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,5};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int i){
        //base case
        if (i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}
