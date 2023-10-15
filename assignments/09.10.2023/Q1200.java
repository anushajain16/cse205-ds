import java.util.ArrayList;
import java.util.List;

public class Q1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        quickSort(arr,0,arr.length-1);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff<min)
            {
            min=diff;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff==min){
                 List<Integer> pair=new ArrayList<>(2);
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                ans.add(pair);
            }
        }
        return ans;
    }
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
