public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        if (x==1 || x==0){
            return x;
        }
        int start = 1;
        int end = x;
        while (start<=end){
            int mid = start+ (end-start)/2;
            long midSquare =(long) mid*mid;
            if(midSquare>x){
                end=mid-1;
            } else if (midSquare<x) {
                start= mid+1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
