import javax.swing.tree.TreeNode;

public class Q543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        int lh = height(root.left);
        int rh = height(root.right);

        int max = Math.max(ld,rd);
        return Math.max(max,lh+rh+1);
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }
}
