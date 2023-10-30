import javax.swing.tree.TreeNode;

public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return symmetric(root.left,root.right);
    }

    public boolean symmetric(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        return node1.val==node2.val && symmetric(node1.left,node2.right) && symmetric(node1.right,node2.left);
    }
}
