// https://leetcode.com/problems/running-sum-of-1d-array/solutions/
// class Solution {
//     public int[] runningSum(int[] nums) {
//         int[] ans=new int[nums.length];
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<=i;j++){
//                 sum+=nums[j];
//             }
//             ans[i]=sum;
//             sum=0;
//         }
//         return ans;
//     }
// }
//using the fibonacci logic 
class Solution {
    public int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];

        }
        return nums;
    }
}