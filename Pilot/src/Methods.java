import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Q: Take an input of 2 numbers and print the sum
//        sum();
        int ans = sum3(30,50);
        System.out.println(ans);


    }

    //using parameters
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter number 1: ");
//        int num1 = in.nextInt();
//
//        System.out.println("Enter number 2: ");
//        int num2 = in.nextInt();
//
//        int sum = num1+num2;
//        System.out.println("The sum = " + sum);
//    }

}
