import java.util.ArrayList;
import java.util.List;

public class Ques916 {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"lo","eo"};
        System.out.println(wordSubsets(words1,words2));
    }
    static int[] getFrequency(String word) {
        int[] freq = new int[26];
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            freq[c - 'a']++;
        }

        return freq;
    }
    static boolean isPresent(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
    static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        List<String> ans = new ArrayList<>();
        for (String word : words2) {
            int[] freq = getFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        for (int i = 0; i < words1.length; i++) {
            String word = words1[i];
            int[] wordFreq = getFrequency(word);
            if (isPresent(wordFreq, maxFreq)) {
                ans.add(word);
            }
        }
        return ans;
    }
}
