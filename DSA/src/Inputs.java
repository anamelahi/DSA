import java.util.Scanner;
import java.util.Arrays;

public class Inputs {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = new int[5];

//        System.out.println(arr[3]);

        //input using for loops

        //printing the array using for loop
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
        //System.out.println(arr[5]);  //INDEX OUT OF BOUND ERROR

//        for (int i = 0; i< arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        String[] str = new String[4];
//        for (int i = 0; i< str.length; i++){
//            str[i] = in.next();
//        }
//        System.out.print(Arrays.toString(str));



        //ARRAY OF OBJECTS
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //MODIFY
        str[1] = "Anam";

        System.out.println(Arrays.toString(str));

    }
}
