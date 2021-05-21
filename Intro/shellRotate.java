import java.io.*;
import java.util.*;

public class shellRotate{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            
        }}
        int s=sc.nextInt();
        int r=sc.nextInt();
        
        rotateShell(a,s,r);
        display(a);
        
        
        
    }
        
    
    public static void rotateShell(int [][]a,int s,int r){
       int oned[] = fillOned(a,s);
       rotate(oned,r);
       fillShell(a,oned,s);
       
    }
    public static void rotate(int[] a,int r){
        r=r%a.length;
        if (r<0){
            r+=a.length;
        }
        reverse(0,a.length-1,a);
        reverse(0,r-1,a);
        reverse(r,a.length-1,a);
        
    }
    public static void reverse(int fi,int li,int[]a){
        while(fi<li){
            int t=a[li];
            a[li]=a[fi];
            a[fi]=t;
            fi++;
            li--;  
        }
    }
    
    public static int[] fillOned(int [][]a,int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=a.length-s;
        int maxc=a[0].length-s;
        
        int size=2*(maxc-minc+maxr-minr);
        int [] oned=new int[size];
        int count=0;
       
        
        for (int i=minr,j=minc;i<=maxr;i++){
            oned[count]=a[i][j];
            count++;
        }
        for (int i=maxr,j=minc+1;j<=maxc;j++){
            oned[count]=a[i][j];
            count++;
        }
        for (int i=maxr-1,j=maxc;i>=minr;i--){
            oned[count]=a[i][j];
            count++;
        }
        for (int i=minr,j=maxc-1;j>=minc+1;j--){
            oned[count]=a[i][j];
            count++;
        }
        return oned;
    }
    

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fillShell(int [][]a,int[]oned,int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=a.length-s;
        int maxc=a[0].length-s;
        
        
        int count=0;
       
        
        for (int i=minr,j=minc;i<=maxr;i++){
            a[i][j]=oned[count];
            count++;
        }
        for (int i=maxr,j=minc+1;j<=maxc;j++){
            a[i][j]=oned[count];
            count++;
        }
        for (int i=maxr-1,j=maxc;i>=minr;i--){
            a[i][j]=oned[count];
            count++;
        }
        for (int i=minr,j=maxc-1;j>=minc+1;j--){
            a[i][j]=oned[count];
            count++;
        }
        
    }
    }

