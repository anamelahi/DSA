import java.util.Arrays;

public class Ques3042 {
    public static void main(String[] args) {
        String[] words = {"bc","b","ab"};
        System.out.println(countPrefixSuffixPairs(words));
    }

    static boolean isPrefixAndSuffix(String str1, String str2){
        if (str1.length()>str2.length()){
            return false;
        }
        if (str1.length()==str2.length()){
            return true;
        }
//        return str2.contains(str1);
        int length = str1.length();

        String pre = str2.substring(0,length);
        String reverseSlice = new StringBuilder(str2).reverse().substring(0, length);
        String suffix = new StringBuilder(reverseSlice).reverse().toString();
        if (str1.equals(pre)&&str1.equals(suffix)){
            return true;
        }
        return false;
    }
    static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String str1 = words[i];
            for (int j = i+1; j < n; j++) {
                String str2 = words[j];
                if (isPrefixAndSuffix(str1,str2)){
                    count+=1;
                }
            }
        }
        return count;
    }
}
