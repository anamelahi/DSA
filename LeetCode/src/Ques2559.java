import java.util.Arrays;

public class Ques2559 {
    public static void main(String[] args) {
        String[] words = {"bcb","p","bb","m"};
        int[][] queries = {
                {0,2},
                {1,4},
                {1,1}
        };
        System.out.println(isVowel(words));

    }
    static boolean isVowel(String[] words){
        if (words.length==0) return false;
        String first = words[0];
        String last = words[words.length-1];
        String[] vowels = {"a","e","i","o","u"};
        for (int i = 0; i < vowels.length-1; i++) {
            if (first==vowels[i] || last==vowels[i]){
                return true;
            }
            i++;
        }
        return true;
    }
//    static int[] vowelStrings(String[] words, int[][] queries) {
//
//    }
}
