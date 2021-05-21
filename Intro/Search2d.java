import java.util.*;
import java.io.*;
public class Search2d {
    

     public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int [][] a=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            
            }
        }
        int s = sc.nextInt();
        bsearch(a,s);

    }
     public static void bsearch(int [][]a,int val){
         int x=a[0][a[0].length-1];
         int i=0;
         int j=a[0].length-1;
         while(i<a.length&&j>=0){
             
             if (a[i][j]==val){
                 System.out.println(i+"\n"+j);
                 return;
             }
             else if(a[i][j]<val)
                 i++;
             else
                 j--;
             
         }
         System.out.println("Not Found");
     }
}