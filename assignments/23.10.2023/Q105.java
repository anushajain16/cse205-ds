import javax.swing.tree.TreeNode;

public class Q105 {
     private int i = 0;
    private int p = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,Integer.MIN_VALUE);
    }

    private TreeNode build(int[] pre, int[] in , int stop){
        if(p>=pre.length){
            return null;
        }

        if(in[i] == stop){
            ++i;
            return null;
        }

        TreeNode node = new TreeNode(pre[p++]);
        node.left = build(pre,in,node.val);
        node.right = build(pre,in,stop);
        return node;
    }

}
