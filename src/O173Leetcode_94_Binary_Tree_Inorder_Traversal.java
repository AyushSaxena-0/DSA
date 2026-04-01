import java.util.*;
public class O173Leetcode_94_Binary_Tree_Inorder_Traversal {
    public static void inorder(TreeNode root,List <Integer>ans){
        if(root==null)return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        }
        public static List<Integer> inorderTraversal(TreeNode root) {
            //Creating a global static arraylist creates problem when the inorderTravesal function is called multiple times so create a local arraylist in this function to protect from data persisting and resetting with each function call
            List<Integer>ans=new ArrayList<>();
            inorder(root,ans);
            return ans;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(inorderTraversal(root));
    }
    }

