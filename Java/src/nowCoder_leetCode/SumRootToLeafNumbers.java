package Java;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class SumRootToLeafNumbers {
    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public int sumNumbers(TreeNode root) {
            int res = 0;
            if(root == null)return 0;

            TreeNode node = root;
            TreeNode r = null;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(node);

            while(node != null || !stack.isEmpty()){
                if(node != null){
                    stack.push(node);
                    node = node.left;
                }else{
                    node = stack.peek();
                    if(node.right != null && node.right != r){
                        node = node.right;
                        stack.push(node);
                    }
                }
            }

        }
    }
}
