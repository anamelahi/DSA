import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6);
        multiple(2,4,"ksdhjfkjsh");
    }

    static void multiple(int a, int b, String ...v){


    }
    static void fun(int ...v){ //it takes an array of int
        System.out.println(Arrays.toString(v));
    }
}
