//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class StepCount1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
        static int numberOfSteps(int num) {
        if (num==0){
            return 0;
        } else if (num%2==0) {
            return numberOfSteps(num / 2)+1;
        }else{
            return numberOfSteps(num-1)+1;
        }
        }
}


//    static int stepCount(int num,int step){
//        if (num==0){
//            return step;
//        } else if (num%2==0) {
//            step++;
//            return stepCount(num / 2, step);
//        }
//        else{
//            step++;
//            return stepCount(num-1,step);
//        }
//    }
