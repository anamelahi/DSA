package Sorting;

import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while ( i < arr.length) {
            int correcti = arr[i]-1;
            if (arr[i] != arr[correcti]){
                int temp = arr[i];
                arr[i] = arr[correcti];
                arr[correcti] = temp;
            }
            else {
                i++;
            }
        }
    }
}
