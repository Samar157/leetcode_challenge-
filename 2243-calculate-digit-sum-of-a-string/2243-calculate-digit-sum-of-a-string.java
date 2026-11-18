class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        for( i=0;i<s.length()-k;){
            int a=i;
            int sum =0;
            while(a<i+k){
                char ch = s.charAt(a);
                sum += ch-'0';
                a++;
            }
            sb.append(sum);
            i += k;
        }
       int  sum =0;
        while(i<s.length()){
            sum += s.charAt(i)-'0';
            i++;
        }
        sb.append(sum);
        
        return digitSum(sb.toString(),k);
    }
}