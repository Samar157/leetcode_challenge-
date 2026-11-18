class Solution {
    public int getLucky(String s, int k) {   
         int n=0;
        for(int i=0;i<s.length();i++){
           int n1 =( s.charAt(i)-'a')+1;
           n += (n1 / 10) + (n1 % 10);
        }
       
       
        for(int i=2;i<=k;i++){
            int sum =0;
            while(n>0){
                sum += (n%10);
                n /= 10;
            }
            n = sum;
            if(n<10) break;
        }
        return (int) n;
    }
}