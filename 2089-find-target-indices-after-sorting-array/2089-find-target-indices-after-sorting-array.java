class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] fre = new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        int i=0,sum =0;
        while(i!= target){
            sum += fre[i];
            i++;
        }
        sum=sum-1;
        List<Integer> l1 = new ArrayList<>();
        int a=1;
        while(fre[target]>0){
            l1.add(sum +a);
            a++;
            fre[target]--;
        }
        return l1;
    }
}