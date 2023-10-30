import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        q.add(null);
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode currNode = q.poll();
            if(currNode == null)
            {
                res.add(ans);
                ans = new ArrayList<>();
                if(q.isEmpty())
                {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                ans.add(currNode.val);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right !=null)
                {
                    q.add(currNode.right);
                }
            }
        }
        return res;
    }
}
