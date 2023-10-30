import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q199 {
     public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res,root,0);
        return res;
    }
    void helper(List<Integer>res ,TreeNode root,int depth)
    {
        if(root==null) return;
        if(depth==res.size())
        {
            res.add(root.val);
        }
        helper(res,root.right,depth+1);
        helper(res,root.left,depth+1);
    }
}
