class Solution {
    public boolean canConstruct(String r, String magazine) {
        int fre[] = new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            fre[ch-'a']++;
        }
        for(int i=0;i<r.length();i++){
            char ch = r.charAt(i);
            if(fre[ch-'a']==0){
                return false;
            }
            fre[ch-'a']--;
        }
        return true;
    }
}