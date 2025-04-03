package DaiMaSuiXiangLu.Tree;

/**
 * 翻转二叉树
 *
 */
public class Test6 {

    public TreeNode invertTree(TreeNode root) {

        preorder(root);
        return root;

    }

    public void preorder(TreeNode root){
        if (root == null){
            return;
        }
        TreeNode temp = new TreeNode();//用于交换的中间树节点
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        preorder(root.left);
        preorder(root.right);
    }

}
