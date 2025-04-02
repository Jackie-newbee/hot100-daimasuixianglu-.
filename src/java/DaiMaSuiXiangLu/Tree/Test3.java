package DaiMaSuiXiangLu.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树层序遍历
 */
public class Test3 {

    class Solution{
        public List<List<Integer>> resList = new ArrayList<List<Integer>>();

        public List<List<Integer>> levelOrder(TreeNode root){
            checkFun01(root, 0);

            return resList;
        }


        /**
         * 递归方式
         */
        public void checkFun01(TreeNode node, Integer deep){
            if(node == null){
                return;
            }
            deep++;

            if(resList.size() < deep){
                ArrayList<Integer> item = new ArrayList<>();
                resList.add(item);
            }
            resList.get(deep-1).add(node.val);
            checkFun01(node.left, deep);
            checkFun01(node.right, deep);

        }







    }


}
