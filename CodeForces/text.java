// ARRAY AS AN INPUT CONSTRUCT A BINARY TREE USING THAT ARRAY CHECK WHEATHER THE CONSTRUCTED TREE IS SYMMETRIC 
//  IF TREE SYMMETRIC SHOW ITS a SYMMETRIC.
// [5,3,7,2,4,6,8]

//         5
//     3       7
// 2       4 6    8
import java.util.*;

public class text{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;


        }
    }
    public static Node constructTree(int[] arr){
        Node root = new Node(arr[0]);
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            root =  add(root,arr[i]);
        }

        return root;

    }
    public static Node add(Node node,int data){
        if(node == null){
            return new Node(data);
        }
        if(node.data>data){
            node.left = add(node.left,data);
        }
        else if(node.data<data){
            node.right = add(node.right,data);
        }
        else if(node.data == data){
            return node;
        }
        return node;

    }
    public static boolean isSymmetric(Node root){
        return isMirror(root, root);
    }
    public static boolean isMirror(Node n1,Node n2){
        if(n1 == null && n2 == null){
            return true;

        }
        if(n1 == null || n2 == null){
            return false;
        }
        boolean res = isMirror(n1.left,n2.right);
        if(res){
            res = isMirror(n1.right,n2.left);
            return res;
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }

        Node root = constructTree(arr);
        if(isSymmetric(root)){

            System.out.println("Tree is a Symmetric Tree");
        }
        else{
            
            System.out.println("Tree is not  a Symmetric Tree");
        }

        
    }
}