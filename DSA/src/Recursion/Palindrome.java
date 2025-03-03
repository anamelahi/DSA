package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(12321);
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
    static boolean isPalindrome(int n){
        int pal = rev(n);
        if (n==pal)
            return true;
        return false;
    }

}
