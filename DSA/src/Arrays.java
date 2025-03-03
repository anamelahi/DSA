public class Arrays {
    public static void main(String[] args) {
        //Q: Store a roll number
        int a = 9;
        //Q: Store a person's name
        String name = "Anam Elahi";

        //Q: Store 3 roll numbers
        int rno1 = 1;
        int rno2 = 55;
        int rno3 = 10;

        //syntax
        // datatype[] variable_name = new datatype[size];
        //store 5 roll numbers:
        int[] rnos = new int[5];
        //or directly
        int[] rnoss = {23,12,34,54,2};

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialization: actually here object is being created in the memory (heap). Do mention the size of the array here, else it will give error


    }
}
