import java.util.*;

public class rightView {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> rightView(TreeNode root) {
       if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();
        // answer.add(root.val);
        main.add(root);
        System.out.println(root.val);
        while(main.size()!=0){
            TreeNode node = main.remove();
            
            if(node.left!=null) helper.add(node.left);
            if(node.right!=null) helper.add(node.right);
            
    
            
            if(main.size()==0){
                if(root!=node){
                    answer.add(node.val);
                }
                main = helper;
                helper = new ArrayDeque<>();
            }
            
        }
        return answer;

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

        ArrayList<Integer> ans = rightView(root);
        for(Integer i : ans) System.out.println(i); 
    }

    public static void main(String[] args) {
        solve();
    }
}