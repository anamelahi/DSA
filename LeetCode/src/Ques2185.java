public class Ques2185 {
    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "code";
        System.out.println(prefixCount(words,pref));
    }
    static int prefixCount(String[] words, String pref) {
        int n = words.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            String str1 = words[i];
            if(isPresent(str1,pref)){
                count+=1;
            }
        }
        return count;
    }
    static boolean isPresent(String str1, String pref){
        int length = pref.length();
        if (str1.length()<pref.length()){
            return false;
        }
        String sub = str1.substring(0,length);
        if(sub.equals(pref)){
            return true;
        }
        return false;
    }
}
