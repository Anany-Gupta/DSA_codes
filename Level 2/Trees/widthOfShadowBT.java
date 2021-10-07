import java.util.*;

public class widthOfShadowBT {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    static int lw , rw ; 
    public static int width(TreeNode root) {
        
        lw = rw = 0;
        helper(root,0);
        return rw-lw+1;
    }
    
    public static void helper(TreeNode node,int dfr){//dfn -> distance from root
    
        if(node==null){
            return;
        }
        
        lw = Math.min(lw,dfr);
        rw = Math.max(rw,dfr);
        
        helper(node.left,dfr-1);
        helper(node.right,dfr+1);
        
        
    } 

    // input_section=================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        System.out.println(width(root));
    }

    public static void main(String[] args) {
        solve();
    }
}