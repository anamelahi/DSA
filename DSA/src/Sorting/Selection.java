package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
          int start = 0;
          int max = start;

          //Finding max element and swappingg
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[max] < arr[i + 1]) {
                max = i;
            }
        }
            for (int j = 0; j < arr.length-1; j++) {
                int i = 0;
                int end = arr.length-i-1;
                int temp = arr[max];
                arr[max] = arr[end];
                arr[end] = temp;
                i++;
            }

//        return arr;

    }
}
