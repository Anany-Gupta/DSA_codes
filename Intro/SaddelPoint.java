import java.util.*;
import java.io.*;
public class SaddelPoint {
    

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
        for(int i=0;i<n;i++){
            int smallvalj=0;
            for (int j=1;j<n;j++){
                if(a[i][j]<a[i][smallvalj]){
                    smallvalj=j;
                    
                }
            }
            boolean flag=true;
            for (int k=0;k<n;k++){
                if(a[k][smallvalj]>a[i][smallvalj]){
                    flag=false;
                    break;
                }
                
            }
            if (flag){
                System.out.println(a[i][smallvalj]);
                return;
            }
        }
        System.out.println("Invalid input");
     }
}