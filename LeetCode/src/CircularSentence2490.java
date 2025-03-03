public class CircularSentence2490 {
    public static void main(String[] args) {
        String sentence = "Leetcode";
        System.out.println(isCircularSentence(sentence));
    }
//    static boolean isCircularSentence(String sentence){
//        sentence = sentence.toLowerCase();
//        String[] words = sentence.split(" ");
//        for (int i = 0; i < words.length-1 ; i++) {
//            if (words[i].charAt(words[i].length()-1) == words[i+1].charAt(0)){
//                return true;
//            }
//        }
//        if (words[words.length-1].charAt(0)==words[words.length-1].charAt(words.length)){
//            return true;
//        }
//
//        return false;
//    }
    static boolean isCircularSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        if (words[words.length - 1].charAt(words[words.length - 1].length() - 1) != words[0].charAt(0)) {
            return false;
        }

        return true;
    }

}
