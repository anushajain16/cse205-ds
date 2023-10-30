import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q94 {
    List<Integer> result = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
        }
        return result;
    }
}
