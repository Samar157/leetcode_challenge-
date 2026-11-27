class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> l1 = new ArrayList<>();
        for(int i=0;i<s.length();){
            int j=i+1;
            char ch = s.charAt(i);
            while( j< s.length() && ch == s.charAt(j)){
                j++;
            }
            if(j-i >= 3){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j-1); 
                l1.add(l);
            }
            i=j;
        }
        return l1;
    }
}