package Recursion;

public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");
    }
    static void permutations(String ans, String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);

        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            permutations(first+ch+second,original.substring(1));
        }

    }
}
