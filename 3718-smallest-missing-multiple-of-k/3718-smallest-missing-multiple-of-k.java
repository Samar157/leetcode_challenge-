class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=1;
        while(found(nums,k*i)){
            i++;
        }
        return k*i;
    }
    public boolean found(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}