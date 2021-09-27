  


import java.util.*;

public class BTinlvl {
  public static Scanner scn = new Scanner(System.in);

  static class TreeNode {
    int val;
    TreeNode left = null, right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static TreeNode buildTree(int[] inorder, int[] levelOrder) {
    return helper(inorder, levelOrder, 0, inorder.length - 1);

  }
  public static TreeNode helper(int[] in, int[] level, int is, int ie) {
    if (is > ie) {
      return null;
    }
    TreeNode node = new TreeNode(level[0]);

    int k = -1;
    for (int i = is ; i <= ie ; i++) {
      if (in[i] == node.val) {
        k = i;
        break;
      }
    }

    HashSet<Integer> map = new HashSet<>();
    
    for (int i = is ; i < k ; i++) {
        map.add(in[i]);
    }
    
    int[]llo = new int[map.size()];
    int[]rlo = new int[level.length-map.size()-1];
    int p = 0, q=0;
    for(int i=1 ;i<level.length;i++){
        if(map.contains(level[i])){
            llo[p++]=level[i];
            map.remove(level[i]);
        }
        else{
            rlo[q++]=level[i];
        }
    }
    
    node.left = helper(in,llo,is,k-1);
    node.right = helper(in,rlo,k+1,ie);

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

    int[] InOrder = new int[n];
    for (int i = 0; i < n; i++)
      InOrder[i] = scn.nextInt();

    int[] LevelOrder = new int[n];
    for (int i = 0; i < n; i++)
      LevelOrder[i] = scn.nextInt();

    TreeNode root = buildTree(InOrder, LevelOrder);
    display(root);
  }

  public static void main(String[] args) {
    solve();
  }

}