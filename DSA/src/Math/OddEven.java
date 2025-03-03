package Math;

public class OddEven {
    public static void main(String[] args) {
        int a = 68;
        System.out.println(CheckFunction(a));

    }
    private static boolean CheckFunction(int a) {
        return (a & 1)==1;
    }
}
