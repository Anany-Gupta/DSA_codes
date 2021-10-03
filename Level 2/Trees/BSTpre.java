import java.util.Scanner;
import java.util.Arrays;
public class BSTrpe {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
         index = 0;
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE-1);
        
    }
    private static int index;
    private static TreeNode helper(int[] pre , int min , int max){
        
        if(index>=pre.length||pre[index]< min || pre[index]> max ){
            return null;
        }
        
        TreeNode node = new TreeNode(pre[index]);
        index++;
        node.left = helper(pre,min,node.val);
        node.right = helper(pre,node.val,max);
        
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

        TreeNode root = bstFromPreorder(pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}