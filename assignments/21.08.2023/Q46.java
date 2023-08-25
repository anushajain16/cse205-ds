import java.util.ArrayList;
import java.util.List;

public class Q46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        permutation(nums,result,new ArrayList(),visited);
        return result;
    }
    void permutation(int [] nums, List<List<Integer>> result, List<Integer> curr, boolean[] visited){
        if(curr.size()==nums.length){
            result.add(new ArrayList(curr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(visited[i]==true)continue;
            curr.add(nums[i]);
            visited[i]=true;
            permutation(nums,result,curr,visited);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}
