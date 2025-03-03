package Recursion;

public class Reverse {
    public static void main(String[] args) {
        int ans  = rev(1234);
        System.out.println(ans);
    }
    static int sum = 0;
    static int rev(int n){
        if (n==0){
            return sum;
        }
        int remainder = n%10;
        sum = sum*10 + remainder;
        return rev(n/10);
    }
}
