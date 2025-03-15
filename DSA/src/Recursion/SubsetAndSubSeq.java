package Recursion;

public class SubsetAndSubSeq {
    public static void main(String[] args) {
        String original = "abc";
        String ans = "";
//        System.out.println(subSeq(ans,original));
        subSeq(ans,original);
    }
    static void subSeq(String ans, String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);
        subSeq(ans+ch,original.substring(1));
        subSeq(ans,original.substring(1));
    }
}

