
import java.util.Arrays;

class Solution {
    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder result = new StringBuilder();
        boolean[] used = new boolean[arr.length];

        while (result.length() < arr.length) {

            // Increasing order
            char prev = 0;

            for (int i = 0; i < arr.length; i++) {
                if (!used[i] && arr[i] > prev) {
                    result.append(arr[i]);
                    prev = arr[i];
                    used[i] = true;
                }
            }

            // Decreasing order
            prev = (char) 256;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (!used[i] && arr[i] < prev) {
                    result.append(arr[i]);
                    prev = arr[i];
                    used[i] = true;
                }
            }
        }

        return result.toString();
    }
}

