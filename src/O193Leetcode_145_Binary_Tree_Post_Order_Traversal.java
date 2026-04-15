import java.util.ArrayList;
import java.util.List;

public class O193Leetcode_145_Binary_Tree_Post_Order_Traversal {
    public static void post(TreeNode root,ArrayList<Integer>list){
        if(root==null)return;
        post(root.left,list);
        post(root.right,list);
        list.add(root.val);
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        post(root,list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        post(node,new ArrayList<>());
        System.out.println(postorderTraversal(node));

    }
}
