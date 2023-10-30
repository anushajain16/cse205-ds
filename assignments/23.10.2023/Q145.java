import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q145 {
    List<Integer> result = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            result.add(root.val);
        }
        return result;
    }
}
