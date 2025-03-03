package Recursion;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
//        triangle2(4,0);
        int[] arr = {4,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void triangle1(int row, int col){
        if (row==0){
            return;
        }
        if (col<row){
            System.out.print("*");
            triangle1(row,col+1);
        }else{
            System.out.println();
            triangle1(row-1,0);
        }
    }
    static void triangle2(int row, int col){
        if (row==0){
            return;
        }
        if (col<row){
            triangle2(row,col+1);
            System.out.print("*");
        }else{
            triangle2(row-1,0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr,int row, int col){
        if (row==0){
            return;
        }
        if (col<row){
            if (arr[col]>arr[col+1]){
                //swap
                int temp = arr[col+1];
                arr[col+1] = arr[col];
                arr[col] = temp;
            }
            bubbleSort(arr,row,col+1);

        }else{
            bubbleSort(arr,row-1,0);
        }
    }
}
