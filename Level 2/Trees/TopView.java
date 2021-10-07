import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class Pair{
        TreeNode node;
        int vl;
        
        Pair(TreeNode node , int vl){
            this.node=node;
            this.vl = vl;
        }
    }
    
   
    public static void widthHelper(TreeNode node,int dfr){//dfn -> distance from root
    
        if(node==null){
            return;
        }
        
        lw = Math.min(lw,dfr);
        rw = Math.max(rw,dfr);
        
        widthHelper(node.left,dfr-1);
        widthHelper(node.right,dfr+1);
        
        
    } 
    static int lw , rw ; 

    public static ArrayList<Integer> TopView(TreeNode root) {
        lw = rw = 0;
        widthHelper(root,0);
        int width = rw - lw +1;
        
        Queue<Pair> q = new ArrayDeque<>();
        
        q.add(new Pair(root,0));
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i < width ; i++){
            answer.add(new Integer(Integer.MIN_VALUE));
            
        }
        
        while(q.size()!=0){
            Pair current = q.remove();
            int v = current.vl;
            TreeNode node = current.node;
            
            int listIdx = v - lw;
            
            if(answer.get(listIdx)==Integer.MIN_VALUE){
                answer.set(listIdx,node.val);
            }
            
            
            if(node.left!=null){
                q.add(new Pair(node.left,v-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,v+1));
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

        ArrayList<Integer> ans = TopView(root);
        for (Integer i : ans)
            System.out.print(i + " ");

    }

    public static void main(String[] args) {
        solve();
    }
}