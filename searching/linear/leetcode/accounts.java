// https://leetcode.com/problems/richest-customer-wealth/
package leetcode;

class accounts{
    public int maximumWealth(int[][] accounts) {
        // traverse
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            for (int account : person) {
                sum += account;
            }
            if (sum > ans) {
                ans = sum;
            }
            sum = 0;
        }
        return ans;
    }
}