import java.util.Arrays;
import java.util.HashMap;

public class RankTransform1331 {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        int[] ans = arrayRankTransform(arr);
//        int[] ans = sorted(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] arrayRankTransform(int[] arr) {
        //usecase: when the array is empty
        if (arr.length==0){
            return new int[0];
        }
        int[] arrTemp = arr.clone(); //to make a copy of the original array
        Arrays.sort(arrTemp);

        HashMap<Integer, Integer> rank = new HashMap<>();
        //ranking
        int ranking = 1;
        for (int i = 0; i < arrTemp.length; i++) {
            if (!rank.containsKey(arrTemp[i])){
                rank.put(arrTemp[i],ranking);
                ranking++;
            }
        }
//        return arrTemp;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = rank.get(arr[i]);
        }
        return res;
    }

//    private static int[] sorted(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                //compare
//                if (arr[j] < arr[j-1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
////{40,10,20,30}
//        }
//        return arr;
//    }

}


