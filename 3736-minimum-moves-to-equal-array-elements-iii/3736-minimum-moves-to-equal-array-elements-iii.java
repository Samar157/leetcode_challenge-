class Solution {
    public int minMoves(int[] nums) {
        int sum =0,max =-1;
       for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum += nums[i];
       } 
       return nums.length*max - sum;
    }
}