// https://leetcode.com/problems/shuffle-the-array/description/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        int xpointer=0;
        int ypointer=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0){
                arr[i]=nums[xpointer];
                xpointer++;
            }else{
                arr[i]=nums[ypointer];
                ypointer++;
            }
        }    
        return arr;
    }
}