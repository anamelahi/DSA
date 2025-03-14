import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit" );
//        }
//        switch (fruit){
//            case "Mango" :
//                System.out.println("King of fruits");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Grapes" :
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }
//        switch (fruit){
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }
//        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter between 1-7");
//        }
//        switch (day){
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6,7 -> System.out.println("Weekend");
//            default -> System.out.println("Please enter between 1-7");
//        }

        int empNo = in.nextInt();
        String dept = in.next();

        //better way to write switch case
        switch (empNo) {
            case 1 -> System.out.println("Anam Elahi");
            case 2 -> System.out.println("Ayesha Firdaus");
            case 3 -> {
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct Empno");
        }
    }
}
