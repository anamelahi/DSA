package Sorting;

import java.util.Arrays;

public class   Bubble {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped = false;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step, element with the max value will go to its respective index
            for (int j = 1; j < arr.length-i; j++) {
                //compare
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
