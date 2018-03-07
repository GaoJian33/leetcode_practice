
/**Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree{1,#,2,3},


 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null )return list;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(0, node.val);
            if(node.left != null)stack.push(node.left);
            if(node.right != null)stack.push(node.right);
        }
        return list;
    }
}