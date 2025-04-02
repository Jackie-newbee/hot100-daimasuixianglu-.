package DaiMaSuiXiangLu.Tree;

/**
 * 二叉树的链表存储形式
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }


}
