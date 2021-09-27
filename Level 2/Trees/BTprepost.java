import java.util.Scanner;

public class BTprepost {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n = pre.length;
        return helper(pre,post,0, n-1 , 0 , n-1);
    }
    public static TreeNode helper(int[]pre , int[] post,int pres , int pree ,int posts , int poste){
          if (pres > pree)
            return null;

        TreeNode node = new TreeNode(pre[pres]);
        if(pres==pree){
            return node;
        }
        int ltv = pre[pres+1];
        int k = -1;
        for(int i = posts ; i < poste ; i++){
            if(post[i]==ltv){
                k = i;
                break;
            }
        }
        int cls = k - posts + 1;
        //left pre -> pres+1 - pres+k+1 post-> 0-k
        //right pre ->k+2 - pre.length-1 post -> k+1 - post.length-1;
        
        node.left = helper(pre,post,pres+1,pres+cls,posts,k);
        node.right = helper(pre,post,pres+cls+1,pree,k+1,poste-1);
        
        return node;
        
    }
    // public static TreeNode constructFromPrePost(int[] pre, int[] post) {
    //     if(pre.length==1){
    //         return new TreeNode(pre[0]);
    //     }
    //     TreeNode node = new TreeNode(pre[0]);
    //     int ltv = pre[1];
    //     int k = -1;
    //     for(int i = 0 ; i < post.length-1 ; i++){
    //         if(post[i]==ltv){
    //             k = i;
    //             break;
    //         }
    //     }
    //     //left pre -> 1- k+1 post-> 0-k
    //     //right pre ->k+2 - pre.length-1 post -> k+1 - post.length-1;
    //     int lpre[] = new int[k+1];
    //     int rpre[] = new int[pre.length-lpre.length-1];
    //     int lpost[] = new int[k+1];
    //     int rpost[] = new int[post.length-lpost.length-1];
    //     int p = 0, q = 0;
    //     for(int i = 1 ; i<=k+1 ; i++){
    //         lpre[p++] = pre[i];
    //     }
    //     for(int i = k+2 ; i<=pre.length-1 ; i++){
    //         rpre[q++] = pre[i];
    //     }
    //     p = 0; q = 0;
    //     for(int i = 0 ; i<=k ; i++){
    //         lpost[p++] = post[i];
    //     }
    //     for(int i = k+1 ; i<=post.length-2 ; i++){
    //         rpost[q++] = post[i];
    //     }
        
    //     node.left = constructFromPrePost(lpre,lpost);
    //     node.right = constructFromPrePost(rpre,rpost);
        
    //     return node;
        
    // }


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
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = constructFromPrePost(pre, post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}