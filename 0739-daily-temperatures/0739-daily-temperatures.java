class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int n = t.length;
        int[] result = new int[n];
        for(int i= 0;i<n;i++){
            while(!st.isEmpty() && t[st.peek()]< t[i]){
               int pre= st.pop();
            result[pre] = i-pre;
            }
            st.push(i);
        }
        return result;
    }
}