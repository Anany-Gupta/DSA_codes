import java.io.*;
import java.util.*;

public class tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node construct(int arr[]) {
        // 10 ->n
        // 14 3 15 17 2 4 5 13 11 7-> arr
        Node root = new Node(arr[0], null, null);
        for (int i = 1; i < arr.length; i++) {
            root = add(root, arr[i]);
        }
        return root;

    }
    
    public static Node add(Node node, int data) {
        if (node == null) {
            return new Node(data, null, null);
        }
        
        if (node.data == data)
        return node;
        else if (data > node.data) {
            node.right = add(node.right, data);
        } else if (data < node.data) {
            node.left = add(node.left, data);
        }
        
        return node;
        
    }
    
        public static void display(Node node) {
            if (node == null) {
                return;
            }
    
            String str = "";
            str += node.left == null ? "." : node.left.data + "";
            str += " <- " + node.data + " -> ";
            str += node.right == null ? "." : node.right.data + "";
            System.out.println(str);
    
            display(node.left);
            display(node.right);
        }

    static Node prevNode ;
    static Node headNode ;

    public static void rightSkew(Node root) {
        if (root == null) {
            return;
        }
        rightSkew(root.left);

        Node rightNode = root.right;

        if (headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        } else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        rightSkew(rightNode);

    }
    public static void leftSkew(Node root) {
        if (root == null) {
            return;
        }
        leftSkew(root.right);

        Node leftNode = root.left;

        if (headNode == null) {
            headNode = root;
            root.right = null;
            prevNode = root;
        } else {
            prevNode.left = root;
            root.right = null;
            prevNode = root;
        }
        leftSkew(leftNode);

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = construct(arr);
        prevNode=null;
        headNode=null;
        
        
        rightSkew(root);
        display(headNode);
        prevNode=null;
        root=headNode;
        headNode=null;
        leftSkew(root);
        display(headNode);
        sc.close();
    }

}
