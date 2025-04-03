package DaiMaSuiXiangLu.Tree;

/**
 * 二叉树最大深度
 *
 */
public class Test9 {

    int max = 0;
    public int maxDepth(TreeNode root) {

        int deep = 0;
        order(root,deep);
        return max;

    }
    public void order(TreeNode root, int deep){
        if (root == null){
            return;
        }
        deep++;
        if(max < deep){
            max = deep;
        }
        order(root.left,deep);
        order(root.right,deep);
    }

}
