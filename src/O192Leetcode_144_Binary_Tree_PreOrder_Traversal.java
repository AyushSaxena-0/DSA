import java.util.ArrayList;
import java.util.List;

public class O192Leetcode_144_Binary_Tree_PreOrder_Traversal {
    public static void pre(TreeNode root,ArrayList<Integer> list){
        if(root==null)return;
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        pre(root,list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<Integer>list=new ArrayList<>();
        pre(root,list);
        System.out.println(list);
    }
}
