/*
//Function1
import java.util.*;

public class Functions {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int count=0;
        while (n!=0)
        {
            if (n%10==d)
                count++;
            n=n/10;
            
        }
        return count;
    }
}
*/
/*
//UFnction2
import java.util.*;
  
  public class Functions{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int count=0;
       int bn=0;
       while (n!=0){
           bn+=(n%b)*Math.pow(10,count);
           count++;
           n=n/b;
       }
       return bn;
   }
  }
*/
/*
//Function3

import java.util.*;
  
  public class Functions{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int count=0;
       int dn=0;
       while (n!=0){
           dn+=(n%10)*Math.pow(b,count);
           count++;
           n=n/10;
       }
       return dn;
   
   }
  }
*/
/*
import java.util.*;
  
  public class Functions{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
      int d = getValueIndecimal(n,sourceBase);
      int dn = getValueInBase(d, destBase);
      System.out.println(dn);
   } 
    public static int getValueIndecimal(int n, int s){
      int count=0;
       int dn=0;
       while (n!=0){
           dn+=(n%10)*Math.pow(s,count);
           count++;
           n=n/10;
       }
       return dn;
   
   }
    public static int getValueInBase(int n, int b){
       int count=0;
       int bn=0;
       while (n!=0){
           bn+=(n%b)*Math.pow(10,count);
           count++;
           n=n/b;
       }
       return bn;
   }
  }
*/
/*
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int b = sc.nextInt();
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int rv=0;
       int c=0;
       int p=1;
       while (n1>0||n2>0||c>0){
           int d1=n1%10;
           int d2=n2%10;
           
           n1=n1/10;
           n2=n2/10;
           
           int d=d1+d2+c;
           
           c=d/b;
           d=d%b;
           
           rv += d*p;
           p  *= 10;
       }
       return rv;
   }
  }
*/
/*
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int borrow=0;
       int rv=0;
       int p=1;
       while(n2>0){
           int d1=n1%10;
           int d2=n2%10;
           n1/=10;
           n2/=10;
           int d=0;
           d2=d2+borrow;
           
           if (d2>=d1)
               d=d2-d1;
           else{
               borrow=-1;
               d=d2+b-d1;   
           }
           rv+=d*p;
           p*=10;
       }
       return rv;
       
   }
  
  }
*/
/*
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }
 public static int getSum(int b, int n1, int n2){
       int rv=0;
       int c=0;
       int p=1;
       while (n1>0||n2>0||c>0){
           int d1=n1%10;
           int d2=n2%10;
           
           n1=n1/10;
           n2=n2/10;
           
           int d=d1+d2+c;
           
           c=d/b;
           d=d%b;
           
           rv += d*p;
           p  *= 10;
       }
       return rv;
 }
 public static int getsinglep(int b,int n1,int d2){
     int p=1;
     int rv=0;
     int c=0;
     while (n1>0 || c>0){
         int d1=n1%10;
         n1=n1/10;
         int d=d1*d2+c;
         c=d/b;
         d=d%b;
         rv += d*p;
         p *=10;
         
         
     }
     return rv;
 }
  
 public static int getProduct(int b, int n1, int n2){
     int pro=0;
     int p=1;
     while (n2>0){
         int d2=n2%10;
         n2/=10;
         int sprd=getsinglep(b,n1,d2);
         pro = getSum(b,pro,sprd*p);
         p*=10;
     }
     return pro;
 }

}
*/