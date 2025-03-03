//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;

            for (int i : account) {
                sum += i;
            }

            //now we have sum of accounts of person
            //check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
