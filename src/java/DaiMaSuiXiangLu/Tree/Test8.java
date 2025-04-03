package DaiMaSuiXiangLu.Tree;

/**
 * 对称二叉树
 *
 */
public class Test8 {

    public boolean isSymmetric(TreeNode root) {

        return compare(root.left, root.right);

    }

    public boolean compare(TreeNode left, TreeNode right){

        if(left == null && right != null){
            return false;
        }
        if(left != null && right == null){
            return false;
        }
        if(left == null && right == null){
            return true;
        }
        if (left.val != right.val) {
            return false;
        }

        //把以上情况都排除之后，剩下的就是 左右节点都不为空，且数值相同的情况。
        Boolean compareOutside  = compare(left.left, right.right);
        Boolean compareInside  = compare(left.right, right.left);
        return compareOutside  && compareInside ;

    }

}
