//ARRAYS
public class Main {
    public static void main(String[] args) {
        //Q: Store a roll no.
//        int a = 19;

        //Q: Store a person's name
//        String name  = "Anam Elahi";

        //Q: Store 5 roll nos

        //syntax of arrays
        // datatype[] variable_name = new datatype[size];
        //store 5 roll numbers:

//        int[] rno = new int[5];
//
//        //or directly
//        int[] rnos2 = {23,12,45,32,15};

//        int[] ros; //declaration of array. ros is getting defined in the stack
//        ros = new int[5]; //initialization: actually here object is being created in the memory (heap)
//        String[] arr = new String[5];
//        System.out.println(arr[2]);

//        int row = 1;
//        int n=4 ;
//        int i=1;
//        while(row<=n){
//            int col = 1;
//            while (col<=row){
//                System.out.print("*");
//                col++;
//            }
//            System.out.println(" ");
//            row++;
//        }
//        int col = 1;
//        int row = 4;
//        while (row<5){
//            while (row>=col){
//                System.out.print("*");
//                col++;
//            }
//            System.out.println(" ");
//            row++;
//        }
//        int col = 1;
//        int n = 4;
//        while (col<=4){
//            int row = 4;
//            while (row>=1){
//                System.out.print("*");
//                row--;
//                n--;
//            }
//            System.out.println(" ");
//            row += 1;
//            col++;
//        }
        int col = 5;
        while (col>=1){
            int row = 1;
            while (row<=col-1){
                System.out.print("*");
                row++;
            }
            System.out.println("");
            col--;
        }




        }
}
