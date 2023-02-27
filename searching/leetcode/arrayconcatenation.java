package searching.leetcode;

// https://leetcode.com/problems/concatenation-of-array/description/
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] ans= new int[2*nums.length];
//         for(int i=0; i<nums.length ;i++){
//             ans[i]=nums[i];
//         }
//         int n=nums.length;
//         while(n<ans.length){
//             ans[n]=nums[n-nums.length];
//             n++;
//         }
//         return ans;
//     }
// }  
// or
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }
        return ans;
    }
}
