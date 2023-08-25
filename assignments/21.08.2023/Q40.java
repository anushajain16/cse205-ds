import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList();
        comb(candidates, target,result,new ArrayList(),0);
        return result;
    }

    void comb(int [] candidates, int target, List<List<Integer>> result, List<Integer> curr, int index){
        if(target==0){
            result.add(new ArrayList(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            curr.add(candidates[i]);
            comb(candidates,target-candidates[i],result,curr,i+1);
            curr.remove(curr.size()-1);
        }   
    }
}
