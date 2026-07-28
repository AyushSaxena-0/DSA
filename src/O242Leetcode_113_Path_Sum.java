import java.util.ArrayList;
import java.util.List;

public class O242Leetcode_113_Path_Sum {
    public static void helper(TreeNode root, int targetSum, int currSum, List<List<Integer>>ans, List<Integer>path){
        //This is the base case
        if(root==null)return;
        //Adding the node value of root to currSum
        currSum=currSum+root.val;
        //Adding this node in path
        path.add(root.val);
        //Now check wheather it is a leaf node or not
        if(root.left==null&&root.right==null){
            //Now we are on leafnode
            //Check wheather it is equal to desired sum
            if(currSum==targetSum){
                ans.add(new ArrayList<>(path));// Store a copy of the current path
                /*
                If you wrote:
                    ans.add(path);
                then every element in ans would point to the same path object, which is modified during backtracking.
                */
            }
        }
        // Explore the left subtree
        helper(root.left,targetSum,currSum,ans,path);
        // Explore the right subtree
        helper(root.right,targetSum,currSum,ans,path);

        //Backtrack
        path.remove(path.size()-1);
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        helper(root,targetSum,0,ans,path);
        //Note ans is an arraylist and arraylist are referanced to the object
        //When its value is changed in above function the value of arraylist changes from everywhere
        //It changes arraylist after going through function
        // ArrayList is passed by reference (the reference is passed by value).
        // Any modifications made to 'ans' inside helper() are visible here,
        // so there is no need to return it from the helper method.
        return ans;
    }

    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(8);
        root.right.left.right = new TreeNode(9);

        int targetSum = 7;
        System.out.println(pathSum(root,targetSum));
    }
}
