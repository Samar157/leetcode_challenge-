class Solution {
    public boolean checkDivisibility(int n) {
        int multi =1 ;
        int sum =0;
        int c =n; 
        while(c>0){
            sum += c%10;
            multi *= c%10;
            c /= 10;
        }
        return n %(sum + multi)==0;
    }
}