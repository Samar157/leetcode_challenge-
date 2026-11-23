class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            while( i<j && !check(s.charAt(i)) ){
                i++;
            }
            while(i<j && !check(s.charAt(j))){
                j--;
            }
            if(i<j){
            char ch = arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;
            j--;
            }

        }
        return new String(arr);
    }
    public boolean check(char ch){
        if(ch=='A'|| ch=='a'|| ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            return true;
        }
        return false;
    }
}