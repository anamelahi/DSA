public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Anam";
        {
            // int a = 78; //a is already initialized so re-initializing it will return you an error. Once initialized, you can only reassign the value of that variable.
            a = 100; //reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Ayesha";
            System.out.println(name);//will return Ayesha instead of Anam, cuz name has been reassigned.
            //values initialized in this block, remains in the block
        }
        System.out.println(a);
        System.out.println(name);
    }

    //if you declare a variable inside a function, then you cannot use it outside the function. here in the function below, marks and num can be used only inside the function
    static void random(int marks){
        int num = 67;
        System.out.println(num);
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this function scope only.
    }
}
