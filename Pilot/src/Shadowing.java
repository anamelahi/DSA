public class Shadowing {
    static int x = 90;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90
        int x ;
//        System.out.println(x); //this will give an error, becuz here x has not been initialized yet. Scope will begin when value is initialized.
        x = 40;
        System.out.println(x);  //40
        fun();//90
    }
    static void fun(){
        System.out.println(x);
    }
}

//shadowing in java is a pracitce of using 2 variables with the same name within the scope that overlaps.
