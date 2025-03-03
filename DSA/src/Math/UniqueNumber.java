package Math;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,10,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int uniqueNumber = 0;
        for (int n:arr){
            uniqueNumber ^= n;
        }
        return uniqueNumber;
    }
}
