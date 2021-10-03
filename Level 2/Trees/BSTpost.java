import java.util.Scanner;

public class BSTpost {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode bstFromPostorder(int[] preorder) {
        index = preorder.length-1;
        return helper(preorder,Integer.MIN_VALUE+1,Integer.MAX_VALUE-1);
        
    }
    private static int index;
    private static TreeNode helper(int[] post , int min , int max){
        
        if(index<0||post[index]< min || post[index]> max ){
            return null;
        }
        
        TreeNode node = new TreeNode(post[index--]);
        
        node.right = helper(post,node.val,max);
        node.left = helper(post,min,node.val);
        
        return node;
    }
    
    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = bstFromPostorder(pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}