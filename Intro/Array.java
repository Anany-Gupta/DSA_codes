//4th rotated using reverse
/*
import java.io.*;
import java.util.*;

public class Array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  public static void rev(int []a,int li,int ri){
        while (li < ri) {
            int lv = a[li];
            int rv = a[ri];
            a[li] = rv;
            a[ri] = lv;

            li++;
            ri--;
        }
  }
  public static void rotate(int[] a, int k){
    int n=a.length;
    k=k%n;
    if (k<0)
        k=k+n;
    rev(a,0,n-1);
    rev(a,k,n-1);
    rev(a,0,k-1);
    
    
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
*/
//sub array
/*
import java.io.*;
import java.util.*;

public class Array{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
        
    }
    suba(a,n);
}
public static void suba(int a[],int n){
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for (int k=i;k<=j;k++){
                System.out.print(a[k]+" ");
            }System.out.println();
        }
    }
}

}
*/
/* 
//Inverse
import java.io.*;
import java.util.*;

public class Array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
      int b[]=new int[a.length];
      for (int i=0;i<a.length;i++){
          b[a[i]]=i;
      }
      
    return b;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}
*/
/*
//Sum of 2 Arrays
import java.io.*;
import java.util.*;

public class Array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        //input first array
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        //take second array
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = sumOfTwoArrays(a1, a2);

        //print ans array
        for (int i = 0; i < ans.length; i++) {
            if (i == 0 && ans[0] == 1) {
                System.out.println(ans[i]);
            } else if (i > 0) {
                System.out.println(ans[i]);
            }
        }
    }

    public static int[] sumOfTwoArrays(int[] a1, int[] a2) {
        int len = a1.length > a2.length ? a1.length + 1 : a2.length + 1;
        int[] ans = new int[len];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = ans.length - 1;

        int carry = 0;

        //find sum of two arrays
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a1[i];
            }
            if (j >= 0) {
                sum += a2[j];
            }

            int val = sum % 10;
            carry = sum / 10;
            ans[k] = val;

            i--;
            j--;
            k--;
        }

        return ans;
    }


}
*/
/*
//Sub of array

import java.io.*;
import java.util.*;

public class Array{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0 ; i < n1 ; i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int i=0 ; i < n2 ; i++){
        arr2[i] = scn.nextInt();
    }
    
    // sub two arrays
    int p1=n1-1, p2=n2-1, p3=n2-1, borrow=0;
    int res[]=new int[n2];
    
    while (p2>=0){
        int d1= p1<0?0:arr1[p1];
        int d2=arr2[p2];
        int diff=d2-d1-borrow;
        if(diff<0){
            diff+=10;
            borrow=1;
        }
        else
            borrow=0;
        res[p3]=diff;
        p1--;
        p2--;
        p3--;
        
    }
   boolean flag=false;
   for (int i=0;i<n2;i++){
       if (res[i]!=0)
           flag=true;
       if(flag)
           System.out.println(res[i]);
   }
 }

}
*/
/*

//Binary Seearch broken economy

import java.io.*;
import java.util.*;

public class Array{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int element=scn.nextInt();
        binarySearch(arr,0,n-1,element);
    
    }
public static void binarySearch(int []a,int l,int h,int d){
    
    int ceil=-1,floor=-1;
    while (l<=h){
        int mid=(l+h)/2;
        if (a[mid]==d){
             ceil=floor=a[mid];
             return;
        }
        else if(a[mid]>d){
             h=mid-1;
             floor = a[mid];
        }  
        else{
            l=mid+1;
            ceil = a[mid];
            
        }
        
    }
    System.out.println(floor);
    System.out.println(ceil);
    }
}
*/
/*
//Subset of an array
import java.io.*;
import java.util.*;

public class Array{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        printSubset(arr);
 }
    public static void printSubset(int[] a){
        int n=a.length;
        int cases=(int)Math.pow(2,n);
        for (int i=0;i<cases;i++){
            int bn[]=decTOBinary(i,n);
            
            for (int j=0;j<n;j++){
                if (bn[j]==0){
                    System.out.print("- ");
                    
                }
                else
                    System.out.print(a[j]+" ");
                    
            }
            System.out.println();
            
            
        }
        
        
        
    }
public static int[] decTOBinary(int d,int len){
     int bn[]=new int[len];
     int i=bn.length-1;
     while (d>0){
         int rem=d%2;
         d/=2;
         bn[i]=rem;
         i--;
     }
     return bn;
   }
}
*/
import java.io.*;
import java.util.*;

public class Array{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int num=scn.nextInt();
        int f=firstIndex(arr,num);
        int l=lastIndex(arr,num);
        System.out.println(f+"\n"+l);
    }
    public static int firstIndex(int[] a,int n){
        int fi=-1;
        int l=0,h=a.length-1;
        while (l<=h){
        int mid=(l+h)/2;
        if (a[mid]==n){
             fi=mid;
             h=mid-1;//searches left region for more "n"
        }
        else if(a[mid]>n){
             h=mid-1;
             
        }  
        else{
            l=mid+1;       
        }
        
    }
        return fi;
    }
    public static int lastIndex(int[] a,int n){
        int li=-1;
        int l=0,h=a.length-1;
        while (l<=h){
        int mid=(l+h)/2;
        if (a[mid]==n){
             li=mid;
             l=mid+1;//searches left region for more "n"
        }
        else if(a[mid]>n){
             h=mid-1;
             
        }  
        else{
            l=mid+1;       
        }
        
    }
        return li;
}
        
}
       