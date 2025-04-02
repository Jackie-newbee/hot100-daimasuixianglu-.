package DaiMaSuiXiangLu.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的递归遍历
 */
public class Test2 {

    /**
     * 前序遍历
     */
    class Solution{
        public List<Integer> preorderTraversal(TreeNode root){
            List<Integer> result = new ArrayList<>();//递归的过程中共享这个result对象，由于result是同一个对象，递归过程中对它的修改会反映到最终返回的结果中
            preorder(root,result);
            return result;
        }

        public void preorder(TreeNode root, List<Integer> result){
            if(root == null){
                return;
            }
            result.add(root.val);
            preorder(root.left, result);
            preorder(root.right, result);
        }
    }

    /**
     * 中序遍历
     */
    class Solution2 {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            inorder(root, res);
            return res;
        }

        void inorder(TreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }
            inorder(root.left, list);
            list.add(root.val);             // 注意这一句
            inorder(root.right, list);
        }
    }


}
