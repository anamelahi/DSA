import java.util.Arrays;

public class Ques1769 {
    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(Arrays.toString(minOperations(boxes)));
    }
    static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer;
        answer = new int[n];
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                int diff;
                if (j==i){
                    continue;
                }
                else {
                    if (boxes.charAt(j)=='1'){
                        if (i>j){
                            diff = i-j;
                        }else{
                            diff = j-i;
                        }
                        count = count+diff;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
