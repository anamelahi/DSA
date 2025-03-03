public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start<=end){
            int mid = start+ (end-start)/2;
            long midSquare =(long) mid*mid;
            if(midSquare>num){
                end=mid-1;
            } else if (midSquare<num) {
                start= mid+1;
            }else {
                return true;
            }
        }
        return false;
    }
}
