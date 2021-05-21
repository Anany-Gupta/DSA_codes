/*
//demo
import java.io.*;
import java.util.*;

public class twod{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] array2d=new int[n][m];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            array2d[i][j]=sc.nextInt();
            
        }
    }
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           System.out.print(array2d[i][j]+" ");
            
        }System.out.println();
    }
 }

}
*/
/*
//Matrix mult

import java.io.*;
import java.util.*;

public class twod{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int m1=sc.nextInt();
    int [][] a1=new int[n1][m1];
    for (int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            a1[i][j]=sc.nextInt();
            
        }
    }
    int n2=sc.nextInt();
    int m2=sc.nextInt();
    int [][] a2=new int[n2][m2];
    for (int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            a2[i][j]=sc.nextInt();
            
        }
    }
    if (m1!=n2)
           System.out.println("Invalid input");
    else{
    int [][] a3=new int[n1][m2];
    for (int i=0;i<n1;i++){
        for(int j=0;j<m2;j++){
            int res=0;
            for(int k=0;k<n2;k++){
                res+=a1[i][k]*a2[k][j];
            }
            a3[i][j]=res;
        }
    }
    for (int i=0;i<n1;i++){
        for(int j=0;j<m2;j++){
           System.out.print(a3[i][j]+" ");
            
        }System.out.println();
    }
}
}
}
*/
/*
//State of Wakanda
import java.io.*;
import java.util.*;

public class twod{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] a=new int[n][m];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            
        }
    }
    
    for (int c=0;c<m;c++){
        if (c%2==0){
            for (int i=0;i<n;i++){
                System.out.println(a[i][c]);
            }
        }
        else{
            
             for (int i=0;i<n;i++){
                System.out.println(a[n-1-i][c]);
            }
            
        }
    }
 }

}
*/
/*
//spiral

import java.io.*;
import java.util.*;

public class twod{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] a=new int[n][m];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            
        }
    }
    int minr=0,minc=0;
    int maxr=a.length-1,maxc=a[0].length-1;
    int ti=n*m;
    int c=0;
    while(c<ti){
        //1st left wall
        for(int i=minr;i<=maxr && c<ti;i++){
            System.out.println(a[i][minr]);
            c++;}
        minc++;
        //2nd bottom wall
        for(int i=minc;i<=maxc && c<ti;i++){
            System.out.println(a[maxr][i]);
            c++;}
        maxr--;
        //3rd rigth wall
        for (int i=maxr;i>=minr && c<ti;i--){
            System.out.println(a[i][maxc]);
            c++;}
        maxc--;
        for (int i=maxc;i>=minc && c<ti;i--){
            System.out.println(a[minr][i]);
            c++;}
        minr++;
            
    
    
}
}
}
*/
/*
//exit point
import java.io.*;
import java.util.*;

public class twod{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] a=new int[n][m];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            
        }
    }
    int i=0, j=0;
    int c=0;//dir 0(->) 1(|down) 2 (<-) and 3(|^ up)
    while (j!=m &&  i!=n){
        
            
           
            c=(c+a[i][j])%4;
            switch (c) {
                case 0:
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    j--;
                    break;
                case 3:
                    i--;
                    break;
            
            }
            if(i<0){
                i++;
                break;
            }
            else if(i>=a.length){
                i--;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(j>=a.length){
                j--;
                break;
            }
        }
        System.out.println(i+"\n"+j);
        
}   
}
*/
/*
//Rotate by 90 degree using new array

import java.io.*;
import java.util.*;

public class twod {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] a=new int[n][m];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            
        }
        
    }
    System.out.println("\n\n");
    int [][]b=new int[m][n];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            b[j][m-i-1]=a[i][j];
            
        }
  
    
    }
      display(b);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
*/
import java.io.*;
import java.util.*;

public class twod {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] a=new int[n][m];
    for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            
        }
        
    }
    
    for (int i=0;i<n;i++){
        for(int j=i;j<m;j++){
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;   
            }    
        }
    for (int i=0;i<n;i++){
        int li=0;
        int ri=m-1;
        while (li<ri){
            int temp =a[i][li];
            a[i][li]=a[i][ri];
            a[i][ri]=temp;
            li++;ri--; 
        }
    }
    display(a);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}


