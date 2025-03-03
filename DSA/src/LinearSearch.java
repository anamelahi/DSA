public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,23,42,65,10,32,43};
        int target = 1;
        int ans = LinearSearch(arr,target);
        System.out.println(ans);
    }

    //Linear Search function
    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
//            int element = arr[index];
//            if (element==target){
//                return index;
//            }
            //ORyui
            if (target==arr[index])
                return index;
        }

        //this line will execute if none of the return statements above have executed hence target not found
        return -1;
    }
}
