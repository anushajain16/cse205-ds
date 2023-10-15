import java.util.Arrays;

public class Q1338 {
    public int minSetSize(int[] arr) {
         int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int e : arr){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }

        int[] freq = new int[max-min+1];

        for(int e : arr){
            freq[e-min]++;
        }

        Arrays.sort(freq);
        int i = max-min;
        int count = 0;

        while(n>arr.length/2){
            n-=freq[i];
            i--;
            count++;
        }

        return count;



    }
}
