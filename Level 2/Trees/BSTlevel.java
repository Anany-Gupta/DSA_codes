import java.util.*;

public class BSTlevel {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }
  public static class Pair {
    TreeNode par;
    int min, max;
    Pair(TreeNode par, int min, int max) {
      this.par = par;
      this.min = min;
      this.max = max;
    }

  }
  public static TreeNode constructBSTFromLevelOrder(int[] arr) {
    
    Queue<Pair> q  = new ArrayDeque<>();

    q.add(new Pair(null, Integer.MIN_VALUE, Integer.MAX_VALUE));

    TreeNode root = null;
    int idx = 0;

    //Write your code here
    while (q.size() > 0 && idx < arr.length) {
      Pair rem = q.remove();
      if (arr[idx] < rem.min || arr[idx] > rem.max) continue;
      TreeNode node = new TreeNode(arr[idx]);
      idx++;
      if (rem.par == null) {
        root = node;
      }
      else {
        if (rem.par.val > node.val) {
          rem.par.left = node;
        }
        else {
          rem.par.right = node;
        }

      }
      q.add(new Pair(node, rem.min, node.val - 1));
      q.add(new Pair(node, node.val + 1, rem.max));
    }
    return root;

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
  int[] level = new int[n];
  for (int i = 0; i < n; i++)
    level[i] = scn.nextInt();

  TreeNode root = constructBSTFromLevelOrder(level);
  display(root);
}

public static void main(String[] args) {
  solve();
}
}