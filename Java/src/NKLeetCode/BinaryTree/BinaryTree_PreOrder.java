package NKLeetCode.BinaryTree;
import java.util.ArrayList;
import java.util.Stack;

//对于先序遍历来说

public class BinaryTree_PreOrder{

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)return list;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
        return list;
    }
    public static void test(){
        System.out.println("PreOrder");
    }

}