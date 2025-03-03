//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
import java.util.Arrays;

public class SmallestLetter744 {
    public static void main(String[] args) {
        char[] letters = {'a','b','c'};
        char target = 'b';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end  = letters.length-1;
        if (target>=letters[end]){
            return letters[0];
        }
            while (start<=end) {
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            return letters[start];


    }
}
