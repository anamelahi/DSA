package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,2,12,6,5};
//        mergeSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] finalArr = new int[left.length + right.length];

        while (i<left.length && j<right.length){
            if (left[i]<right[j]){
                finalArr[k] = left[i];
                i++;
            }else{
                finalArr[k] = right[j];
                j++;
            }
            k++;
        }
        //if one of the array has some elements left, then add all that at the end of the finalArr
        while (i<left.length || j<right.length){
            if (i<left.length){
                finalArr[k] = left[i];
                i++;
                k++;
            }else{
                finalArr[k] = right[j];
                j++;
                k++;
            }
        }
        return finalArr;
    }
}
