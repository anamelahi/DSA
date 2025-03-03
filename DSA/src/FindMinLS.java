public class FindMinLS {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(FindMin(arr));
    }
    //first we have to assume that arr[0] is the minimum value then we compare rest of the values with it and update the min value
    static int FindMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
