import java.util.*;

public class diagonalbt1 {
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
    TreeNode node ;
    int x, y;
    Pair(TreeNode node, int x, int y) {
      this.node = node;
      this.x = x;
      this.y = y;
    }

  }
 
  public static ArrayList<ArrayList<Integer>> diagonalOrder(TreeNode root) {
  
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
  
    Queue<Pair> q = new ArrayDeque<>();

    q.add(new Pair(root, 0, 0));
    
    // System.out.println(answer);
    int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
    
    while(q.size()!=0){
        Pair current = q.remove();
        TreeNode node = current.node;
        int x = current.x,y=current.y;
        int listIdx = (y-x)/2;
        min = Math.min(min,listIdx);
        max = Math.max(max,listIdx);
        if(map.containsKey(listIdx)){
           ArrayList<Integer> l = map.get(listIdx);
            l.add(node.val);
            map.put(listIdx,l);
        }
        else{
            ArrayList<Integer> l = new ArrayList<>();
            l.add(node.val);
            map.put(listIdx,l);
        }
        
        if(node.left!=null){
            q.add(new Pair(node.left,x-1,y+1));
        }
        if(node.right!=null){
            q.add(new Pair(node.right,x+1,y+1));
        }
        
    }
    
    ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
    for(int i = min ; i <= max ; i++){
        answer.add(map.get(i));
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

    ArrayList<ArrayList<Integer>> ans = diagonalOrder(root);
    int idx = 0;
    for (ArrayList<Integer> i : ans) {
      System.out.print(idx++ + " -> ");
      for (Integer j : i)
        System.out.print(j + " ");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    solve();
  }
}