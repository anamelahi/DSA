package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
//        message();
        print(1);
    }

    //recursive function
    static void print(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
//    static void message(){
//        System.out.println("Hello World");
//        message1();
//    }
//    static void message1(){
//        System.out.println("Hello World");
//        message2();
//    }
//    static void message2(){
//        System.out.println("Hello World");
//        message3();
//    }
//    static void message3(){
//        System.out.println("Hello World");
//        message4();
//    }
//    static void message4(){
//        System.out.println("Hello World");
//    }

}
