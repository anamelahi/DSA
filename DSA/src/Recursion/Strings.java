package Recursion;

public class Strings {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bacapplcad"));
//        System.out.println(skip(););
    }
//    static void skip(String p, String original){
//        if(original.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch = original.charAt(0);
//        if (ch == 'a'){
//            skip(p,original.substring(1));
//        }else{
//            skip(p+ch,original.substring(1));
//        }
//    }
static String skip(String original){
    if(original.isEmpty()){
        return "";
    }
    char ch = original.charAt(0);
    if (ch == 'a'){
        return skip(original.substring(1));
    }else{
        return ch+skip(original.substring(1));
    }
}
    static String skipApple(String original){
        if(original.isEmpty()){
            return "";
        }
//        char ch = original.charAt(0);
        if (original.startsWith("apple")){
            return skipApple(original.substring(5));
        }else{
            return original.charAt(0)+skipApple(original.substring(1));
        }
    }

    static String skipAppNotApple(String original){
        if(original.isEmpty()){
            return "";
        }
//        char ch = original.charAt(0);
        if (original.startsWith("app") && !original.startsWith("apple")){
            return skipAppNotApple(original.substring(3));
        }else{
            return original.charAt(0)+skipAppNotApple(original.substring(1));
        }
    }
}
