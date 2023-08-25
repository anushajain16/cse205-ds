import java.util.ArrayList;
import java.util.List;

public class Q39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        combinationSum(candidates, target, 0, result, new ArrayList());
        return result;
    }

    void combinationSum(int [] candidates, int target, int start, List<List<Integer>> result, List<Integer> curr){
        if(target==0){
            result.add(new ArrayList(curr));
            return;
        }
        if(target<0){
            return;
        }
        else{
            for(int i=start; i<candidates.length;i++){
                curr.add(candidates[i]);
                combinationSum(candidates, target-candidates[i],i,result,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}
