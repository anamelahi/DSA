import java.util.ArrayList;

public class Ques17 {
    public static void main(String[] args) {
        System.out.println(numPad("",""));
    }
    static void numberPad(String ans, String original){
        if (original.isEmpty()){
            System.out.println(ans);
            return;
        }
        int currentDigit = original.charAt(0) - '0';
        for (int i = (currentDigit-2)*3; i <= (currentDigit-2) + 2*(currentDigit-1) ; i++) {
            char ch = (char)('a'+i);
            numberPad(ans+ch,original.substring(1));
        }
    }

    static ArrayList<String> numPad(String ans, String original){
        if (original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int currentDigit = original.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for (int i = (currentDigit-2)*3; i <= (currentDigit-2) + 2*(currentDigit-1) ; i++) {
            char ch = (char)('a'+i);
            list.addAll(numPad(ans+ch,original.substring(1)));
        }
        return list;
    }
}
