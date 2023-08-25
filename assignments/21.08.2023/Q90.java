import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        subset(nums, result, new ArrayList(), 0);
        return result;
    }

    void subset(int[] nums, List<List<Integer>> result, List<Integer> curr, int index){
        result.add(new ArrayList(curr));
        for(int i = index; i<nums.length; i++){
            if(i>index && nums[i-1]==nums[i]){
                continue;
            }
            curr.add(nums[i]);
            subset(nums, result, curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
