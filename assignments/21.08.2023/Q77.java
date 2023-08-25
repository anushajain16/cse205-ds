import java.util.ArrayList;
import java.util.List;

public class Q77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        combination(n,k,result,new ArrayList(),1);
        return result;
    }

    void combination(int n, int k, List<List<Integer>> result , List<Integer> curr, int index){
        if(curr.size()==k){
            result.add(new ArrayList(curr));
            return;
        }
        else{
            for(int i=index; i<=n;i++){
                curr.add(i);
                combination(n,k,result,curr,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
}
