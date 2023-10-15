import java.util.ArrayList;
import java.util.List;

public class Q451 {
    public String frequencySort(String s) {
               int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char c : s.toCharArray()) {
            max = Math.max(max, c);
            min = Math.min(min, c);
        }

        int[] freq = new int[max - min + 1];

        for (char c : s.toCharArray()) {
            freq[c - min]++;
        }

        List<Character> ans = new ArrayList<>();
        for (int c = min; c <= max; c++) {
            if (freq[c - min] > 0) {
                ans.add((char) c);
            }
        }

        int[] f = freq;
        int m = min;

        ans.sort((a, b) -> Integer.compare(f[b - m], f[a - m]));

        char[] result = new char[s.length()];
        int index = 0;
        for (char c : ans) {
            int frequency = freq[c - min];
            for (int i = 0; i < frequency; i++) {
                result[index++] = c;
            }
        }

        return new String(result);
    }
    
}
