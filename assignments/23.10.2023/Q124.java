import javax.swing.tree.TreeNode;

public class Q124 {
    public int maxPathSum(TreeNode root) {
        TreeNode res= new TreeNode(Integer.MIN_VALUE);
        maxSum(root, res);
        if(res.val<root.val)
        {
            return root.val;
        }

        return res.val;
    }

    private

    int maxSum(TreeNode root, TreeNode res)
    {
        if(root==null)return 0;

        int lh= Math.max(0, maxSum(root.left, res));
        int rh= Math.max(0, maxSum(root.right, res));

        res.val = Math.max(res.val,Math.max((lh+rh+root.val),Math.max(root.val,Math.max((lh+root.val),(rh+root.val)))));

        return (root.val+Math.max(lh,rh));

    }
}
