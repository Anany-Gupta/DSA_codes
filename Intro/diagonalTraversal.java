import java.util.*;
import java.io.*;
public class diagonalTraversal {
     public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int [][] a=new int[n][n];
        for (int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j]=sc.nextInt();
            
        }}
        diagonalTraverse(a);
    }
     public static void diagonalTraverse(int [][]a){
         int minr=0,minc=0;
         int maxr=a.length-1,maxc=a.length-1;
         int gap=0;
         while (gap<=a.length-1){
             for(int i=minr;i<=maxr;i++){
                 for (int j=minc;j<=maxc;j++){
                     if (gap+i==j){
                         System.out.println(a[i][j]);
                     }
                 }
             }
             gap++;minc++;maxr--;
         
        }

    }
}
