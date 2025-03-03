public class StringLS {
    public static void main(String[] args) {
        String name = "Anam";
        char target = 'a';
        System.out.println(StringLinearSearch(name,target));
    }
    static boolean StringLinearSearch(String strr, char target){
        if (strr.length()==0){
            return false;
        }
        for (int i = 0; i < strr.length(); i++) {
            if (target==strr.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
